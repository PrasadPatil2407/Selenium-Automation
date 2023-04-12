package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class MouseHover {

    WebDriver driver;

    Properties P = Propertyreader.Read();

    public MouseHover() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite(){
        driver.navigate().to(P.getProperty("MouseHoverURL"));
    }

    public void findOption() throws InterruptedException {
       WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[1]/div[1]/a"));
       WebElement element01 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/a[1]"));
       WebElement element02 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[2]/button"));
       WebElement element03 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[1]/div[3]/button"));


       Thread.sleep(2000);
        Actions actions = new Actions(driver);

        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        actions.moveToElement(element01).perform();
        Thread.sleep(2000);
        actions.moveToElement(element02).perform();
        Thread.sleep(2000);
        actions.moveToElement(element03).perform();
        Thread.sleep(2000);
        actions.moveToElement(element02).perform();
        Thread.sleep(2000);
        actions.moveToElement(element01).perform();
        Thread.sleep(2000);
        actions.moveToElement(element).perform();

    }

}
