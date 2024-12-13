package testngexample;

import org.testng.annotations.Test;

public class IntegrationTest {
    @Test(groups = "integrationTests")

    public void testPaymentGateway() {
        System.out.println("Integration test: Payment gateway");
    }


}
