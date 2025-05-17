package pageobjectmodel;

import org.openqa.selenium.WebDriver;

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
        if(pageTitle.equals("My Account"))
        {
            System.out.println("Login is successful");
        }
        else
        {
            System.out.println("Login failed...Please check your credentials");
        }
    }
}
