package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class WebTable02 {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public WebTable02() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {
        driver.navigate().to(P.getProperty("WebTable02URL"));
    }

    public void addNew() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Devi");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Pats");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("devi0724@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("50000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("DRDO");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(1000);
    }

    public void updateEmployee() {
        //driver.findElement()
    }
}
