package seliniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PromptAlert {

    WebDriver driver;
    @BeforeSuite
    public void initializeBrowser(){
        driver= new EdgeDriver();

    }





   @Test
           public void handlingPromptAlert() {


       // driver = new EdgeDriver();
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.manage().window().maximize();
       //button[text()='Click for JS Confirm']
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

       Alert alert = driver.switchTo().alert();
       alert.sendKeys("suresh alabani");
       alert.accept();
       String resultData = driver.findElement(By.xpath("//p[@id='result']")).getText();
       System.out.println(resultData);
       Assert.assertEquals(resultData, "You entered: suresh alabani");



   }

   @AfterSuite
    public void terminate(){
        driver.close();
   }
}
