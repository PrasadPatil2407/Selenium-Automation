package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Properties;

public class DropDown {
    WebDriver driver;

    Properties P = Propertyreader.Read();

    public DropDown() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() throws InterruptedException {
        driver.navigate().to(P.getProperty("DropDownURL"));
        Thread.sleep(50);
    }

    public void findDropDown() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("//select"));
        Thread.sleep(60);

        //Select select = new Select(dropdown);
        Select select = new Select(dropdown);

        select.selectByValue("IND");
        Thread.sleep(2000);

        select.selectByIndex(4);
        Thread.sleep(2000);

        select.selectByVisibleText("Antigua and Barbuda");


    }



}
