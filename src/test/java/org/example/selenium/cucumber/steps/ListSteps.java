package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.selenium.cucumber.pages.ListPage;

import java.util.List;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("I navigate to the list page")
    public void navigateToTheListPage() {
        listPage.navigateToList();
    }

    @When("I search {string} in the list")
    public void searchTheList(String state) {
        listPage.enterSearchCriteria(state);
    }

    @Then("I can validate that {string} is present inside the list")
    public void findTheTextInTheList(String city) {
        List<String> list = listPage.getAllSearchResults();
        boolean textIsPresent = list.contains(city);

        if (textIsPresent) {
            System.out.println("Text is present in the list: PASSED!");
        } else {
            throw new Error("Text is not present in the list: FAILED!");
        }
    }
}
