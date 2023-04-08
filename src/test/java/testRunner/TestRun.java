package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/Account.feature", ".//Features/Login.feature", ".//Features/Home.feature",".//Features/Cameras.feature"}, glue = "stepDefinitions", 
tags = " @Phones",dryRun = false, monochrome = false, plugin = {"json:target/cucumber.json"})

public class TestRun {

}

