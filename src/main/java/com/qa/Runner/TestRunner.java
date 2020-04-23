package com.qa.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
      features = "C:\\Users\\52001551\\eclipse-workspace\\POMCucumberBDD\\src\\main\\java\\com\\qa\\feature\\FreeCrm.feature" ,
      glue = { "com\\qa\\StepDefinitions" },    //Path of Step definition package
      plugin = { "pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},    // To generate pretty output in console and generate html and json output
      monochrome = true ,    //display the console output in a proper readable format
      strict = true,    //to check each step is properly defined in step definition
      dryRun = false  //get to know that which step definitions are missing for the steps in feature file
        )
   


public class TestRunner {
	
	
	
	

}