package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.JavaSExecutor;

import java.io.IOException;

public class JavaSExecutor_Steps {

    JavaSExecutor js = new JavaSExecutor();

   public  JavaSExecutor_Steps() throws IOException {

   }

    @Given("user is navigated to twoPLUGS site")
    public void user_is_navigated_to_two_plugs_site() {
       js.getSite();
    }
    @Then("user clicks Blinking Button")
    public void user_clicks_flashing_button() throws IOException, InterruptedException {
       js.flash();
    }
}
