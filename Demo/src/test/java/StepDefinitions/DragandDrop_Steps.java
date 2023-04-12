package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.DragandDrop;

import java.io.IOException;

public class DragandDrop_Steps {
    DragandDrop dd= new DragandDrop();

    public DragandDrop_Steps() throws IOException {

    }
    @Given("user is on the url of the drag and drop")
    public void user_is_on_the_url_of_the_drag_and_drop() {
        dd.getSite();

    }
    @Then("user drags the element and drops on the destination")
    public void user_drags_the_element_and_drops_on_the_destination() {
        dd.findElement();

    }
}
