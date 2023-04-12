package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Calender {
    WebDriver driver;

    Properties P = Propertyreader.Read();

    public Calender() throws IOException{

        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite(){
        driver.navigate().to(P.getProperty("CalenderURL"));
    }

    public void FindButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).click();

       Select year_drp = new Select (driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
       year_drp.selectByVisibleText(String.valueOf(2000));
       Thread.sleep(2000);

       Select month_drp =new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
       month_drp.selectByVisibleText("December");
       Thread.sleep(10000);

       String date = "7";
        Thread.sleep(10000);


        List <WebElement> allDate =driver.findElements(By.xpath("//div[@class='react-datepicker__month']"));

        for (WebElement ele: allDate) {
            String dt = ele.getText();

            if (dt.equals(date)) {
                ele.click();
                break;
            }
        }
        Thread.sleep(10000);

    }


}
