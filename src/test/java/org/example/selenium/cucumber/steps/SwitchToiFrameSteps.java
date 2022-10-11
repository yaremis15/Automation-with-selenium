package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.selenium.cucumber.pages.FramePage;

public class SwitchToiFrameSteps {

    FramePage framePage = new FramePage();

    @Given("I navigate to the iframe page")
    public void navigateToTheFramePage() {
        framePage.navigateToTheFramePage();
    }

    @And("I switch to iFrame by Name criteria")
    public void switchToFrameByNameCriteria() {
        framePage.switchToTheFrameForName();
    }

    @And("I switch to iFrame by Index criteria")
    public void switchToFrameByIndexCriteria() {
        framePage.switchToTheFrameForIndex(0);
    }

    @And("I switch to iFrame by WebElement criteria")
    public void switchToFrameByWebElementCriteria() {
        framePage.switchToTheFrameForLocator();
    }

    @Then("I can enter information in the iframe")
    public void enterInformationInTheFrame() {
        framePage.enterFirstName("Camila");
        framePage.enterLastName("Dimas");
    }


}
