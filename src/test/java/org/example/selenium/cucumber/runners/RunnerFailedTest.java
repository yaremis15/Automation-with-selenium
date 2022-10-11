package org.example.selenium.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.example.selenium.cucumber.pages.BasePage;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/HtmlReports.html", "json:target/cucumber/cucumber.json", "rerun:rerun/failed_scenarios.txt"},
        features = "@target/failed_scenarios.txt",

        glue = "org.example.selenium.cucumber.steps",
        snippets = SnippetType.CAMELCASE,
        tags = " "
)


public class RunnerFailedTest {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }

}
