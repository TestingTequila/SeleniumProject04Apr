package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccount
{
    WebDriver driver;

    public MyAccount(WebDriver driver)
    {
        this.driver= driver;
    }
    public void validateLoginStatus()
    {
        String pageTitle =driver.getTitle();
        //Assert.assertTrue(pageTitle.equals("My Account1"));
        //Assert.assertFalse(pageTitle.equals("My Account"));
        Assert.assertEquals(pageTitle, "My Account");

    }
}
