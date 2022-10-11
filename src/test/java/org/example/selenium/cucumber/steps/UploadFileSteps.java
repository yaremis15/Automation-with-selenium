package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.selenium.cucumber.pages.UploadFilePage;

import java.io.IOException;

public class UploadFileSteps {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @Given("I navigate to the upload file page")
    public void navigateToUploadFilePage() {
        uploadFilePage.navigateToUploadFilePage();

    }

    @And("I upload a file")
    public void uploadFile() throws IOException {
        uploadFilePage.uploadFileInTheForm("File.pdf");
    }

}
