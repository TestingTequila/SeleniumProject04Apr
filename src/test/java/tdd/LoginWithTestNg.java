package tdd;

import data.AppLevelData;
import data.TestLevelData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccount;
import pageobjectmodel.YourStore;

public class LoginWithTestNg {
    WebDriver driver;
    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        driver = utilities.BrowserType.launchBrowser(AppLevelData.BROWSER_NAME);
        driver.get(AppLevelData.APP_URL);
    }

    @Test(priority = 3, dependsOnMethods = "login3")
    public  void login1()
    {
        // 3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        // 4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

        // 5- Enter correct email and password
        al.enterCredentials(TestLevelData.USER_EMAIL_ID, TestLevelData.USER_PASSWORD);

        // 7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();
    }

    @Test(priority = 1, enabled = true, timeOut = 2)
    public  void login2()
    {
        // 3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        // 4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

        // 5- Enter correct email and password
        al.enterCredentials(TestLevelData.USER_EMAIL_ID, TestLevelData.USER_PASSWORD);

        // 7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();
    }

    @Test(priority = 2, invocationCount = 3)
    public  void login3()
    {
        // 3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        // 4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

        // 5- Enter correct email and password
        al.enterCredentials(TestLevelData.USER_EMAIL_ID, TestLevelData.USER_PASSWORD);

        // 7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();

        Assert.fail();
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }


}
