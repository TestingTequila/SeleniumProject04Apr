package tdd;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAnnotations
{

    @BeforeSuite
    public  void installSoftware()
    {
        System.out.println("@BeforeSuite Installing the required software....");
    }

    @AfterSuite
    public  void uninstallSoftware()
    {
        System.out.println("@AfterSuite Un-Installing the required software....");
    }
    @Test(priority = 1, groups = "smoke")
    public void registration()
    {
        System.out.println("@Test: This is my Registration Page....");
        Assert.fail();
    }

    @BeforeClass
    public void connectWithDb()
    {
        System.out.println("@BeforeClass: connecting with the db.....");
    }

    @BeforeTest
    public void createDb()
    {
        System.out.println("@BeforeTest: Creating the DB.....");
    }

    @AfterTest
    public void deleteDb()
    {
        System.out.println("@AfterTest: Deleting the DB.....");
    }

    @Test(enabled = true, invocationCount = 10, timeOut = 1, groups = "sanity")
    public void contactUs()
    {
        System.out.println("@Test: This is my Contact Us Page....");
    }


    @AfterClass
    public void disconnectWithDb()
    {
        System.out.println("@AfterClass: disconnecting with the db.....");
    }
    @BeforeMethod
    public void openBrowserAndEnterUrl()
    {
        System.out.println("@BeforeMethod: Opening Browser and Entering url....");
    }

    @AfterMethod
    public void closeBrowserAndRemoveUrl()
    {
        System.out.println("@AfterMethod: Closing Browser and removing url....");
    }
    @Test(priority = -1, dependsOnMethods = "registration", alwaysRun = true, groups = "smoke")
    public void login()
    {
        System.out.println("@Test: This is my login page....");
    }

    @Test(priority = 3, enabled = true, groups = "sanity", dependsOnGroups = "smoke")
    public void addToCart()
    {
        System.out.println("@Test: This is my addToCart Page....");
    }


}
