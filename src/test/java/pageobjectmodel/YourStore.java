package pageobjectmodel;

import commanactions.GeneralActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YourStore
{
    WebDriver driver;
    GeneralActions ga;
    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink=By.xpath("//a[text()='Login']");
    public YourStore(WebDriver driver)
    {
     this.driver = driver;
     ga = new GeneralActions(driver);
    }
    public  void clickOnMyAccountIcon()
    {
        ga.doClick(myAccountIcon);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }

    public  AccountLogin clickOnLoginLink()
    {
        ga.doClick(loginLink);
        return new AccountLogin(driver);
    }
}
