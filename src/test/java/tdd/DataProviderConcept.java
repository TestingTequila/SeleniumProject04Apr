package tdd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept
{
    @Test(dataProvider = "getData")
    public int addMyIntegers(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is : " + sum);
        return sum;
    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{12, 4}, {2, 5}, {10, 7}};
        return data;
    }
}
