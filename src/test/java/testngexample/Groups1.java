package testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups1 {
    @Test(groups = {"login", "smoke"})
    public void login1(){
        System.out.println("Smoke1");
        Assert.assertTrue(true);
    }

    @Test(groups = {"login", "regression"})
    public void login2(){
        System.out.println("Smoke2");
        Assert.assertEquals(2,2);
    }

    @Test(groups = {"login", "smoke", "regression", "paymentUpdating"})
    public void login3(){
        System.out.println("Smoke3");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression", "login", "paymentUpdating"})
    public void login4(){
        System.out.println("Smoke4");
        Assert.assertEquals(2,2);
    }

}
