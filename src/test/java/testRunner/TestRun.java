package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature", glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:TestOutput/test-output.html" })

public class TestRun {

}
