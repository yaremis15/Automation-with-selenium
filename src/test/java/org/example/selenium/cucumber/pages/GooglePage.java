package org.example.selenium.cucumber.pages;

public class GooglePage extends BasePage {

    private final String searchButton = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    private final String searchTextField = "//input[@title='Buscar']";
    private final String firstSearchResult = "//*[contains(text(),'Colombia - Wikipedia, la enciclopedia libre')]";


    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String textToWrite) {
        enterInformation(searchTextField, textToWrite);
    }

    public void scrollToSearchResult() {
        scrollToElement(firstSearchResult);
    }

    public String firstResult(){
        return textFromElement(firstSearchResult);
    }


}

