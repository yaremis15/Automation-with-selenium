package org.example.selenium.cucumber.pages;

public class GridPage extends BasePage {

    private final String cell = "//div[@id='root']//div";
    private final String mainTable = "//div[@id='root']/div/table";

    public GridPage() {
        super(driver);
    }

    public void navigateToGrid() {
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueFromGrid(int row, int column) {
        return getValueFromTable(cell, row, column);
    }

    public boolean elementDisplayedInTheTable(){
        return isElementDisplayed(mainTable);
    }



}


