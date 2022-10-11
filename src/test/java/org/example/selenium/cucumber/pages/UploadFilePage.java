package org.example.selenium.cucumber.pages;

import java.io.IOException;

public class UploadFilePage extends BasePage {

    private final String selectFile = "//input[@name='file-553']";

    public UploadFilePage() {
        super(driver);
    }

    public void navigateToUploadFilePage() {
        navigateTo("https://www.globalsqa.com/samplepagetest/");
    }

    public void uploadFileInTheForm(String nameFile) throws IOException {
       uploadFile(selectFile, nameFile);
    }

}
