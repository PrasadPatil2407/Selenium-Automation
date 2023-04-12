package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Properties;

public class PracticeForm {
    WebDriver driver;

    Properties P = Propertyreader.Read();


    public PracticeForm() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {
        driver.navigate().to(P.getProperty("PracticeFormURL"));
    }

    public void fillFirstname() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Devi");
        Thread.sleep(2000);
    }

    public void fillLastname() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pats");
        Thread.sleep(2000);
    }

    public void enterEmail() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("devipras0724@mail.com");
        Thread.sleep(2000);
    }

    public void selectGender() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        Thread.sleep(100);
    }

    public void selectProfession() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        Thread.sleep(100);
    }

    public void selectCountry() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
        Thread.sleep(60);

        //Select select = new Select(dropdown);
        Select select = new Select(dropdown);

        select.selectByValue("India");
        Thread.sleep(1000);
    }

    public void selectSkill() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"skillsmultiple\"]"));
        Thread.sleep(60);

        //Select select = new Select(dropdown);
        Select select = new Select(dropdown);

        select.selectByValue("AT");
        Thread.sleep(100);
    }

    public void clickMe() throws InterruptedException {
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        Thread.sleep(200);
    }

    public void clickAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='alertbutton']")).click();
        Alert clickAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        clickAlert.accept();

    }



}
