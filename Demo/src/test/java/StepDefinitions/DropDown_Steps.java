package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DropDown;

import java.io.IOException;

public class DropDown_Steps {

    DropDown dp = new DropDown();

    public DropDown_Steps() throws IOException {

    }


    @Given("user is on the DropDown Menu in the site")
    public void user_is_on_the_drop_down_menu_in_the_site() throws InterruptedException {
      dp.getSite();
    }
    @Then("user select the value from the dropdown menu")
    public void user_select_the_value_from_the_dropdown_menu() throws InterruptedException {
        dp.findDropDown();
    }

}
