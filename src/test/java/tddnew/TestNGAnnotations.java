package tddnew;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

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

    @Test
    public void checkNumber()
    {
        Assert.assertTrue(compareNumbers(1,8), "This test case is failing....");
        //Assert.assertFalse(compareNumbers(1,8));

    }

    public  boolean compareNumbers(int a, int b)
    {
        boolean check = false;
        if(a>b)
        {
            check= true;
        }
        return check;
    }

    @Test
    public  void compareObjects()
    {
        String str1 = new String("Java");
        String str2 = "Java";
        String str3= "Java";

        Assert.assertNotSame(str2, str3);
    }
    @Test
    public  void compareSumOfNumbers()
    {
        //Assert.assertNotEquals(12, 14);
        //Assert.assertEquals(addition(12,4), 20);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(addition(12,4), 20);
        System.out.println("This is my AssertEquals TestNG Code....");
        sa.assertAll();
    }

    public int addition(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

}
