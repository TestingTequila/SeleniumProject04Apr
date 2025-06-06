package tdd;

import data.AppLevelData;
import data.TestLevelData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccount;
import pageobjectmodel.YourStore;

public class LoginWithTestNg {
    WebDriver driver;

    @BeforeMethod @Parameters("url")
    public void openBrowserAndEnterUrl(String url) {
        driver = utilities.BrowserType.launchBrowser(AppLevelData.BROWSER_NAME);
//        driver.get(AppLevelData.APP_URL);
        driver.get(url);
    }

    @Test(priority = 3, dependsOnMethods = "login3", enabled = false)
    public void login1() {
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

    @Test(priority = 1, enabled = false, timeOut = 2)
    public void login2() {
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


    @Test(priority = 2, invocationCount = 1, dataProvider = "getData")
    public void login3(String email, String pwd) {
        // 3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        // 4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

        // 5- Enter correct email and password
        al.enterCredentials(email, pwd);

        // 7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

        //8- Validate Login Status
        ma.validateLoginStatus();

    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }


    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{"ben.fletcher@janbask.com", "test@1234"}, {"jason.roger@janbask.com", "test@1234"}, {"forest.grump@janbask.com", "test@1234"}};
        return data;
    }

}