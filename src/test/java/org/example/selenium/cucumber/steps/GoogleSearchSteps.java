package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.selenium.cucumber.pages.GooglePage;
import org.junit.Assert;


public class GoogleSearchSteps {

    GooglePage google = new GooglePage();

    @Given("I am on the google homepage")
    public void navigateToGoogle() {
        google.navigateToGoogle();
    }

    @When("I enter a search criteria")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Colombia");
    }

    @And("click the search button")
    public void clickSearchButton() {
        google.clickSearchButton();
        google.scrollToSearchResult();
    }

    @Then("I should see the results of the search")
    public void validateResults() {
        System.out.println("\nResult: " + google.firstResult() + "\n");
        Assert.assertEquals("Colombia - Wikipedia, la enciclopedia libre", google.firstResult());
    }

}
