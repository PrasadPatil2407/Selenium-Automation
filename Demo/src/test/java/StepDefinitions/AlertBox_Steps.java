package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.AlertBox;

import java.io.IOException;

public class AlertBox_Steps {

    AlertBox ab = new AlertBox();

    public AlertBox_Steps() throws IOException {
    }




    @Given("user is navigated to AlertBox URL")
    public void user_is_navigated_to_alert_box_url() {
       ab.getSite();
    }
    @Then("user clicks on the first Alert Button")
    public void user_clicks_on_the_first_alert_button() throws InterruptedException {
        ab.clickFirstbutton();
    }
    @Then("user clicks on the second Alert Button")
    public void user_clicks_on_the_second_alert_button() throws InterruptedException {
        ab.clickSecondbutton();

    }
    @Then("clicks on the third Alert Button")
    public void clicks_on_the_third_alert_button() throws InterruptedException {
        ab.clickThirdAlert();

    }
    @Then("clicks on the fourth Alert Button")
    public void clicks_on_the_fourth_alert_button() {
        ab.clickFourthAlert();

    }

}
