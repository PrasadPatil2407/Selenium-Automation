package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Calender;

import java.io.IOException;

public class Calender_Steps {

    Calender cd = new Calender();

    public Calender_Steps() throws IOException{

    }

    @Given("user is on the url of calender date picker")
    public void user_is_on_the_url_of_calender_date_picker() {
        cd.getSite();
    }
    @Then("user selects the specific date from the calender")
    public void user_selects_the_specific_date_from_the_calender() throws InterruptedException {
        cd.FindButton();
    }

}
