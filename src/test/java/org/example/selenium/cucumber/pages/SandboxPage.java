package org.example.selenium.cucumber.pages;

public class SandboxPage extends BasePage {

    private final String categoryDropdown = "(//select)[1]";

    public SandboxPage() {
        super(driver);
    }

    public void navigateToPageSandbox() {
        navigateTo("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    }

    public void selectForValue(String category) {
        selectFormDropdownByValue(categoryDropdown, category);
    }

    public void selectForIndex(int index) {
        selectFormDropdownByIndex(categoryDropdown, index);
    }

    public void selectForTextVisibility(String text) {
        selectFormDropdownByVisibleText(categoryDropdown, text);
    }
}

