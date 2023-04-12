package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.DriverFactory;
import org.example.Propertyreader;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks {

    WebDriver driver;
    Properties P = Propertyreader.Read();

    public ApplicationHooks() throws IOException {
    }

    @Before
    public void start()
    {
        DriverFactory driverFactory=new DriverFactory();
        driver = driverFactory.driver_init(P.getProperty("BrowserType"));
        driver.manage().window().maximize();

    }


    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
