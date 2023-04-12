package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.UploadFile;

import java.io.IOException;

public class UploadFile_Steps {

    UploadFile up = new UploadFile();

    public UploadFile_Steps() throws IOException {

    }
    @Given("user is on the url of Upload file")
    public void user_is_on_the_url_of_upload_file() {
        up.getSite();
    }
    @Then("user upload the specific file")
    public void user_upload_the_specific_file() {

        up.clickUpload();
    }

}
