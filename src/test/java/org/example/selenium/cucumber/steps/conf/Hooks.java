package org.example.selenium.cucumber.steps.conf;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.example.selenium.cucumber.pages.BasePage;

import java.io.IOException;

public class Hooks {

    @After
    public void as(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.isFailed()) {
            scenario.log("Scenario Failed!, going to take screenshot");
            scenario.attach(BasePage.getByteScreenshot(), "image/png", "The displayed error is: ");
        }
    }
}
