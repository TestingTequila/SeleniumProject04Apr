package pageobjectmodel;

import commanactions.GeneralActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogin {
    WebDriver driver;
    GeneralActions ga;

    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@type='submit']");

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        ga= new GeneralActions(driver);
    }

    public void enterCredentials(String emailId, String password) {
        ga.doSendKeys(emailTextBox, emailId);
        ga.doSendKeys(passwordTextBox, password);
    }

    public MyAccount clickOnLoginButton() {
        ga.doClick(loginButton);
        return new MyAccount(driver);
    }
}
