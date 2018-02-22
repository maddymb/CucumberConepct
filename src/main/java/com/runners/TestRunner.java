package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="/Users/maddy/eclipse-workspace/CucumberConcepts/src/main/java/com/features/login.feature",// feature file path
		features="/Users/maddy/eclipse-workspace/CucumberConcepts/src/main/java/com/features/contact.feature",
		glue= {"com.stepDefinitions"}, // stepdefinition path
				format= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file
				dryRun = false //to check the mapping is proper between feature file and step def file
		
		)



public class TestRunner {

}
