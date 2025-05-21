package tdd;

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
    @Test
    public void registration()
    {
        System.out.println("@Test: This is my Registration Page....");
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
    @Test
    public void login()
    {
        System.out.println("@Test: This is my login page....");
    }

    @Test
    public void contactUs()
    {
        System.out.println("@Test: This is my Contact Us Page....");
    }
}
