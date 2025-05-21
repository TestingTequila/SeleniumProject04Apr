package commanactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralActions
{
    WebDriver driver;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator)
    {
        driver.findElement(locator).click();
    }

    public void doSendKeys(By locator, String text)
    {
        driver.findElement(locator).sendKeys(text);
    }
}
