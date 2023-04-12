package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.WebTable02;

import java.io.IOException;

public class WebTable02_Steps {

    WebTable02 ww = new WebTable02();

    public WebTable02_Steps() throws IOException {
    }

    @Given("user is on the URL of WebTable02")
    public void user_is_on_the_url_of_web_table02() {
        ww.getSite();
    }
    @Then("user add new employee in the table")
    public void user_add_new_employee_in_the_table() throws InterruptedException {
        ww.addNew();
    }
    @Then("user update a specific employee")
    public void user_update_a_specific_employee() {
        ww.updateEmployee();
    }
    @Then("user delete a specific employee")
    public void user_delete_a_specific_employee() {

    }

}
