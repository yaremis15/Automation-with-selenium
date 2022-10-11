package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.selenium.cucumber.pages.GridPage;
import org.junit.Assert;

public class GridSteps {

    GridPage grid = new GridPage();

    @Given("I navigate to the static table")
    public void navigateToTheGridPage() {
        grid.navigateToGrid();
    }

    @Then("I can return the value I wanted")
    public void returnValueOfTheTable() {
        String value = grid.getValueFromGrid(1, 4);
        System.out.println("\nResult: " + value + "\n");
        Assert.assertEquals("r: 0, c: 3", value);
        Assert.assertTrue(value.contains("r: 0, c: 3"));
    }

    @Then("I can validate the table is displayed")
    public void validateTableIsDisplayed() {
        Assert.assertTrue("El elemento se está mostrando en pantalla", grid.elementDisplayedInTheTable());
        Assert.assertFalse("El elemento está siendo mostrado", false); //Validar que un elemento no exista en el DOM
    }

}
