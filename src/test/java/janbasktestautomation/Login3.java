package janbasktestautomation;

import data.AppLevelData;
import data.TestLevelData;
import org.openqa.selenium.WebDriver;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccount;
import pageobjectmodel.YourStore;

public class Login3 {
    public static void main(String[] args) {

        // 1- Open the browser
        WebDriver driver = utilities.BrowserType.launchBrowser(AppLevelData.BROWSER_NAME);

        // 2- Enter the url
        driver.get(AppLevelData.APP_URL);

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

        //9- Close the browser
        driver.close();

    }
}
