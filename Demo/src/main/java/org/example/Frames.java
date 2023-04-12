package org.example;

import com.mongodb.client.model.geojson.LineString;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Frames {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public Frames() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() throws InterruptedException {
        driver.navigate().to(P.getProperty("FramesURL"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverFactory.getDriver();
        javascriptExecutor.executeScript("window.scrollBy(100,200)");
        Thread.sleep(3000);
    }

    public void findFrame01() throws InterruptedException {
        driver.switchTo().frame("SingleFrame");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Devi");
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
    }

    public void findFrame02() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        Thread.sleep(500);
        driver.switchTo().frame(1);
        System.out.println("in 1");
        driver.switchTo().frame(0);
        System.out.println("in 2");
        WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys("DeviPrasad");


    }
}
