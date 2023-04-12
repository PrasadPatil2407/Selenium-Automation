package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class AlertBox {
    WebDriver driver;

    Properties P = Propertyreader.Read();

    public AlertBox() throws IOException {

        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {driver.navigate().to(P.getProperty("AlertBoxURL"));}

    public void clickFirstbutton() throws InterruptedException {
        driver.findElement(By.id("alertButton")).click();
        Alert clickFirstbutton=driver.switchTo().alert();
        Thread.sleep(2000);
        clickFirstbutton.accept();
    }
    public void clickSecondbutton() throws InterruptedException{
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.id("timerAlertButton"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(6000);
        Alert clickSecondbutton=driver.switchTo().alert();
        clickSecondbutton.accept();
        Thread.sleep(2000);
    }
    public void clickThirdAlert() throws InterruptedException{
        WebElement element = driver.findElement(By.id("confirmButton"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Alert clickThirdAlert=driver.switchTo().alert();
        Thread.sleep(10000);
        clickThirdAlert.accept();
//      Thread.sleep(2000);
}



    public void clickFourthAlert(){
        WebElement element = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
        Alert clickFourthAlert=driver.switchTo().alert();
        clickFourthAlert.sendKeys("TOM CRUISE");
        clickFourthAlert.accept();

 }
}
