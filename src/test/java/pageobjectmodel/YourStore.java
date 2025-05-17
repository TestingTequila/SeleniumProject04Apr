package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class YourStore
{
    WebDriver driver;

    public YourStore(WebDriver driver)
    {
     this.driver = driver;
    }
    public  void clickOnMyAccountIcon()
    {
        WebElement myAccountIcon =driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    }

    public  void clickOnLoginLink()
    {
        WebElement loginLink=driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
    }
}
