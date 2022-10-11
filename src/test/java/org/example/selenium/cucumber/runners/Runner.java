package org.example.selenium.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.example.selenium.cucumber.pages.BasePage;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example.selenium.cucumber.steps",
        plugin = {"pretty", "summary",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports.json", "rerun:target/failed_scenarios.txt"}, //to generate different types of reporting
        snippets = SnippetType.CAMELCASE,
        tags = "@SmokeTest"
)

public class Runner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}

/*
 * Para ejecutar un test desde la terminal se debe ejecutar el siguiente comando: gradle test -Dcucumber.options="--tags @SmokeTest"
 * Para ejecutar varios tests desde la terminal se debe ejecutar el siguiente comando: gradle test -Dcucumber.options="--tags @SmokeTest, --tags @RegressionTest"
 */
