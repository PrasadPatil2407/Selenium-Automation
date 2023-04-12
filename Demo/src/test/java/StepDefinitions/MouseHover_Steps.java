package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.MouseHover;

import java.io.IOException;

public class MouseHover_Steps {

    MouseHover mh = new MouseHover();

    public MouseHover_Steps() throws IOException {

    }

    @Given("user lanch the URL of {string} website")
     public void user_lanch_the_url_of_website(String string) {
        mh.getSite();
    }
    @Then("user hover over the {string} element for details")
    public void user_hover_over_the_element_for_details(String string) throws InterruptedException {
        mh.findOption();
    }



}
