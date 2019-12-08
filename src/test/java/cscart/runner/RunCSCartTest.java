package cscart.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features="classpath:features",
			glue="cscart.stepdefs",
			plugin = {"pretty",
					"html:target/CucumberReport",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			tags =  "@wip",
			monochrome = true,
			dryRun = false
			
			)
	
	public class RunCSCartTest {

	}

	 

