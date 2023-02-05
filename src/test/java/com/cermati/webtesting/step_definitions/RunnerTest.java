package com.cermati.webtesting.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/01.AccessUrl.feature",
                "src/main/resources/features/02.Register.feature"},
        glue = "com.cermati.webtesting.step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
