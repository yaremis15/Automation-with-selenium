package org.example.selenium.cucumber.pages;

public class FramePage extends BasePage {

    private final String iframeLocator = "//iframe[@id='iframeResult']";
    private final String firstNameField = "//input[@id='fname']";
    private final String lastNameField = "//input[@id='lname']";

    public FramePage(){
        super(driver);
    }

    public void navigateToTheFramePage() {
        navigateTo("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    }

    public void switchToTheFrameForName() {
        switchToiFrameForName("iframeResult");
    }

    public void switchToTheFrameForIndex(int index) {
        switchToiFrameForIndex(index);
    }

    public void switchToTheFrameForLocator() {
       switchToiFrameForWebElement(iframeLocator);
    }

    public void enterFirstName(String firstName) {
        enterInformation(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        enterInformation(lastNameField, lastName);
        switchToParentFrame();
    }

}

