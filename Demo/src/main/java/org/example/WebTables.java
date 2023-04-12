package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class WebTables {

    WebDriver driver;

    Properties P = Propertyreader.Read();


    public WebTables() throws IOException {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void getSite() {
        driver.navigate().to(P.getProperty("WebTablesURL"));
    }

    public void inspectTable() {
        List<WebElement> headings = driver.findElements(By.xpath("//table[@id='customers']//th"));
        System.out.println(headings.size());
        //Assert.assertEquals(headings.size(), 12, "Column count is not the same ");
        Boolean status = false;
        for (WebElement we : headings) {
            String header = we.getText();
            System.out.println(header);

            //if (header.contains("tools")) {
            //     status = true;
            //     break;
            // }
            // Assert.assertTrue(status, "header is not present");
        }

        //For Rows
        List <WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println(rows.size());

        for(WebElement r:rows)
        {
            String rd = r.getText();
            System.out.println(rd);
        }

    }




}
