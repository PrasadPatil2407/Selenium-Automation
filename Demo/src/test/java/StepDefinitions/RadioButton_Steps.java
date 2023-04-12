package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.RadioButton;

import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.io.IOException;

public class RadioButton_Steps {
    RadioButton rb = new RadioButton();

    public RadioButton_Steps() throws IOException {

    }


        @Given("user is on the url of Radio Button")
        public void user_is_on_the_url_of_radio_button()
        {

            rb.getSite();
    }
        @Then("user selects the Radio Button")
        public void user_selects_the_radio_button()
        {
        rb.clickRadioButton();
    }
    }
