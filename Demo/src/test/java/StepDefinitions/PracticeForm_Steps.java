package StepDefinitions;

import io.cucumber.java.en.Given;
import org.example.PracticeForm;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class PracticeForm_Steps {

    PracticeForm pf = new PracticeForm();

    public PracticeForm_Steps() throws IOException {
    }


    @Given("user is on the URL of Practice form")
    public void user_is_on_the_url_of_practice_form() {
       pf.getSite();
    }
    @Then("user Enters the first name")
    public void user_enters_the_first_name() throws InterruptedException {
        pf.fillFirstname();
    }
    @Then("user Enters the last name")
    public void user_enters_the_last_name() throws InterruptedException {
        pf.fillLastname();
    }
    @Then("user Enters the last Email")
    public void user_enters_the_last_email() throws InterruptedException {
        pf.enterEmail();
    }
    @Then("user selects the Gender")
    public void user_selects_the_gender() throws InterruptedException {
        pf.selectGender();
    }
    @Then("user selects the Profession")
    public void user_selects_the_profession() throws InterruptedException {
        pf.selectProfession();
    }
    @Then("user selects the Country from DropDown")
    public void user_selects_the_country_from_drop_down() throws InterruptedException {
        pf.selectCountry();
    }
    @Then("user selects the Skills")
    public void user_selects_the_skills() throws InterruptedException {
        pf.selectSkill();
    }
    @Then("user click the {string} button")
    public void user_click_the_button(String string) throws InterruptedException {
        pf.clickMe();
    }
    @Then("user click on {string} button")
    public void user_click_on_button(String string) throws InterruptedException {
        pf.clickAlert();
    }
}
