package com.StepDefination;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





@RunWith(Cucumber.class)
	@CucumberOptions(features="orangeHRMApplication", // feature file folder information
	glue="com.StepDefination", //  stepDefination package in which userDefined methods are written
	monochrome=true // removes the junk data from the Eclipse Console
	// dryRun=true // will compare the feature file with the Methods class - for a new
	           //  step added in feature file it creates a method without runnering the Scenarios


	                 )


	public class TestRunner {

	}



