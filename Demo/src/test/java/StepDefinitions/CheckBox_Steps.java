package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.CheckBox;
import java.io.IOException;

public class CheckBox_Steps {

    CheckBox cb=new CheckBox();

    public CheckBox_Steps() throws IOException{

    }
    @Given("user is on the url")
    public void user_is_on_the_url() {
        cb.getSite();
    }
    @Then("user selects the checkbox")
    public void user_selects_the_checkbox() {
        cb.clickCheckbox();
    }
}
