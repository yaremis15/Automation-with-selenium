package org.example.selenium.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.selenium.cucumber.pages.SandboxPage;

import static java.lang.Thread.sleep;

public class SelectValueDropdownSteps {

    SandboxPage sandboxPage = new SandboxPage();

    @Given("I navigate to the sandBox page")
    public void navigateToPageSandbox() {
        sandboxPage.navigateToPageSandbox();
    }

    @And("select a value from the dropdown")
    public void selectValueFromDropdown() throws InterruptedException {
        sandboxPage.selectForValue("ASM");
        sleep(2000);
        sandboxPage.selectForIndex(10);
        sleep(2000);
        sandboxPage.selectForTextVisibility("Colombia");
    }
}
