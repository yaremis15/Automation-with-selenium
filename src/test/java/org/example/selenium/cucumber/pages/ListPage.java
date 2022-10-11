package org.example.selenium.cucumber.pages;

import org.example.selenium.cucumber.utils.StaticWait;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListPage extends BasePage {

    private final String searchField = "//input[@placeholder='City or State']";
    private final String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void navigateToList() {
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria(String state) {
        try {
            StaticWait.waitForSeconds(1);
            enterInformation(searchField, state);
        } catch (NoSuchElementException e) {
            System.out.println("The WebElement search Field couldn't be found: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<String> getAllSearchResults() {
        List<WebElement> list = getAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();

        for (WebElement element : list) {
            stringsFromList.add(element.getText());
        }
        return stringsFromList;
    }
}
