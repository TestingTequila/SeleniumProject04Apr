package janbasktestautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main(String[] args) {

        //1. Open the browser
        WebDriver driver = new ChromeDriver();

        //2. Enter the url
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the form
        WebElement firstNameTextBox = driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("John");

        WebElement lastNameTextBox = driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Feloni");

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("john.feloni@janbask.com");

        WebElement telephoneTextBox = driver.findElement(By.id("input-telephone"));
        telephoneTextBox.sendKeys("54645645");

        WebElement countryDdl = driver.findElement(By.id("input-country"));
        Select country = new Select(countryDdl);
//        country.selectByVisibleText("India");
        country.selectByValue("99");
        //country.selectByIndex(11);
//        List<WebElement> countries = country.getOptions();
//        for(WebElement nation: countries)
//        {
//            String countryName=nation.getText();
//            if(countryName.equals("India"))
//            {
//                nation.click();
//                break;
//            }
//        }

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement confirmPasswordTextBox = driver.findElement(By.id("input-confirm"));
        confirmPasswordTextBox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.name("newsletter"));
        yesRadioButton.click();

        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscribe = new Select(subscriptionDdl);
        subscribe.selectByVisibleText("Monthly");

        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();

        //7. Click on Continue button

        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();


        //8. Validate Registration status
        String registerPageTitle = driver.getTitle();
        if (registerPageTitle.equals("Your Account Has Been Created!")) {
            System.out.println("Registration successful");

        } else {
            System.out.println("User with given email is already Registered....");
        }

        //9. Close the browser
        //driver.close();
    }
}
