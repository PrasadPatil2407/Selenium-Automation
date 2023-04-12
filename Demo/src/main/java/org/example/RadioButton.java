package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class RadioButton {
    WebDriver driver;
    Properties P= Propertyreader.Read();

    public RadioButton() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }
    public void getSite()
    {
        driver.navigate().to(P.getProperty("RadioButtonURL"));
    }
    public void clickRadioButton(){
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
    }
}
