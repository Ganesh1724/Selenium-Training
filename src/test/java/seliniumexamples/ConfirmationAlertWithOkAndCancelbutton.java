package seliniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfirmationAlertWithOkAndCancelbutton {

    WebDriver driver;

    @Test
    public void handlingConfirmationAlert() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //button[text()='Click for JS Confirm']
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert alert = driver.switchTo().alert();
        String confirmationText = alert.getText();
        Assert.assertEquals(confirmationText,"I am a JS Confirm");
        Thread.sleep(4000);
        alert.dismiss();
        driver.quit();

    }
}
