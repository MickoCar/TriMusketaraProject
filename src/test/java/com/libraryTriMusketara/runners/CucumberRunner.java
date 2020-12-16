package com.libraryTriMusketara.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "com/libraryTriMusketara/stepDefinitions",
        dryRun = false,
        tags = ""
)

public class CucumberRunner {
}
