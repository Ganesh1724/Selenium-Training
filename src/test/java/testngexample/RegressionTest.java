package testngexample;

import org.testng.annotations.Test;

public class RegressionTest {
    @Test(groups = "regressionTests")

    public void testDashboard() {
        System.out.println("Regression test: Dashboard");
    }



}
