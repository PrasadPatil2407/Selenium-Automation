package org.example;

import org.apache.xmlbeans.impl.tool.FactorImports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class UploadFile {
    WebDriver driver;

    Properties P = Propertyreader.Read();

    public UploadFile() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }
  
    public void getSite(){
        driver.navigate().to(P.getProperty("UploadFileURL"));

    }


    public void clickUpload(){
        driver.findElement(By.xpath("//div/input[@id='uploadFile']")).sendKeys("C:\\Users\\HXPATILP\\Downloads\\pom.xml");
    }

}
