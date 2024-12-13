package seliniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NormalAlertWithOkButton {


    WebDriver driver;

    @Test
    public void handleNormalAlert() throws InterruptedException {
        driver= new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();

        driver.quit();



    }
}
