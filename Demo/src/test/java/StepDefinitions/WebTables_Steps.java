package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.WebTables;

import java.io.IOException;

public class WebTables_Steps {

    WebTables wt = new WebTables();

    public WebTables_Steps() throws IOException {
    }


    @Given("user is on the URL of WebTables")
    public void user_is_on_the_url_of_web_tables() {
        wt.getSite();
    }
    @Then("user verify the Web Tables by different ways")
    public void user_verify_the_web_tables_by_different_ways() throws InterruptedException {
        wt.inspectTable();
    }

}
