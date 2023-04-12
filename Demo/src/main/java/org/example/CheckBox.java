package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class CheckBox {

    WebDriver driver;
    Properties P= Propertyreader.Read();

    public CheckBox() throws IOException{

        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);

    }

    public void getSite()
    {
        driver.navigate().to(P.getProperty("CheckBoxURL"));
    }

    public void clickCheckbox() {

        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
    }


}
