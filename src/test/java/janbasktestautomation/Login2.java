package janbasktestautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccount;
import pageobjectmodel.YourStore;

import java.time.Duration;

public class Login2
{
    public static void main(String[] args) {

       // 1- Open the browser
        WebDriver driver =utilities.BrowserType.launchBrowser("Chrome");

       // 2- Enter the url
        driver.get("https://janbaskdemo.com/");

       // 3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();
       // 4- Click on login Link
        ys.clickOnLoginLink();

       // 5- Enter correct email and password
        AccountLogin al = new AccountLogin(driver);
        al.enterCredentials("jason.roger@janbask.com", "test@1234");

       // 7- Click on Login button
        al.clickOnLoginButton();


       //8- Validate Login Status
        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();


       //9- Close the browser
        driver.close();

    }
}
