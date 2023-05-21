package com.usa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		// plug in is nothing but generate the report
		plugin= {"pretty","json:target/cucumber.json" }, 
		features = { ".//Feature/" }, // feature is nothing but location of features file
		glue = { "com.usa.stepdefinition", "com.usa.hooks" } // glue is nothing but location of stepdefination
)
public class MyRunner extends AbstractTestNGCucumberTests {

}

