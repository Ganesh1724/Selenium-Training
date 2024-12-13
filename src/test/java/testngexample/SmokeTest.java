package testngexample;

import org.testng.annotations.Test;

public class SmokeTest {
    @Test(groups = "smokeTests")

    public void testLogin() {
        System.out.println("Smoke test: Login");
    }

}
