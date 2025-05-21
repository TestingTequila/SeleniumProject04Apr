package janbasktestautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Login {
    public static void main(String[] args) {

        // 1- Open the browser
        WebDriver driver = new ChromeDriver();

        // 2- Enter the url
        driver.get("https://janbaskdemo.com/");

        // 3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        // 4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();

        // 5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys("jason.roger@janbask.com");

        // 6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys("test@1234");

        // 7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //8- Validate Login Status
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("My Account")) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login failed...Please check your credentials");
        }
        //9- Close the browser
        driver.close();

    }
}
