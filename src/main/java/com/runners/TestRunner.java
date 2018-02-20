package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/maddy/eclipse-workspace/CucumberConcepts/src/main/java/com/features/login.feature",// feature file path
		glue= {"com.stepDefinitions"}, // stepdefinition path
		format= {"pretty","html:test-output"}
		)



public class TestRunner {

}
