package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class JavaSExecutor {

    static WebDriver driver;

    static Properties P;

    static {
        try {
            P = Propertyreader.Read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JavaSExecutor() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public static void getSite() {
        driver.get(P.getProperty("JavaSExecutorURL"));
    }

    public static void blink(WebElement element,WebDriver driver) throws IOException {
        String bglite = element.getCssValue("Background Colour");

        for (int i = 0; i <= 10; i++) {
            changeColour("#000000", element, driver);
            changeColour(bglite, element, driver);
        }

    }

    public static void changeColour(String color, WebElement element, WebDriver driver) throws IOException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.background = '" + color + "'", element);
        //

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
        }

    }
    public static void flash() throws InterruptedException, IOException {
        WebElement blinkbutton = driver.findElement(By.xpath("(//a[@href='/signup'])[1]"));
        blink(blinkbutton,driver);

    }
}
