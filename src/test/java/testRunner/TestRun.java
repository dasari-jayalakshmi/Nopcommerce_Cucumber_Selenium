package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//Features/Login.feature", ".//Features/Home.feature", ".//Features/Account.feature"}, glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {"json:target/cucumber.json"})

public class TestRun {

}
