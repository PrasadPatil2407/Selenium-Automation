package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Frames;

import java.io.IOException;

public class Frames_Steps {

    Frames fm =new Frames();

    public Frames_Steps() throws IOException {

    }

    @Given("user is on the frames URL")
    public void user_is_on_the_frames_url() throws InterruptedException {
       fm.getSite();
    }
    @Then("user give the value in first Frame")
    public void user_give_the_value_in_first_frame() throws InterruptedException {
        fm.findFrame01();
    }
    @Then("user handles the Nested Frames")
    public void user_handles_the_nested_frames() throws InterruptedException {
        fm.findFrame02();
    }
}
