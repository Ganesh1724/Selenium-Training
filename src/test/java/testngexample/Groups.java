package testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"registration", "smoke"})
    public void registration1(){
        System.out.println("Smoke1");
        Assert.assertTrue(true);
    }

    @Test(groups = {"registration", "regression"})
    public void registration2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }

    @Test(groups = {"registration", "smoke", "regression", "paymentUpdating"})
    public void registration3(){
        System.out.println("Smoke3");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression", "registration"})
    public void registration4(){
        System.out.println("Smoke4");
        Assert.assertEquals(2,2);
    }

}
