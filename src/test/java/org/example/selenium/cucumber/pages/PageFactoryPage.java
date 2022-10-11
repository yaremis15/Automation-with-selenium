package org.example.selenium.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPage extends BasePage {

    @CacheLookup //cache the element so as not to search again for something that has already been found. (do not use on dynamic elements)
    @FindBy(id = "bton")
    WebElement bton;

    public PageFactoryPage() {
        super(driver);
        driver.get("https://www.google.com");
    }
}

