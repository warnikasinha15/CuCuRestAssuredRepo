package com.basic.getWithTagsOfCucuSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
			//dryRun=true,
			//tags={"@Important"}, //All scenario executed if this is tag for feature file
			 //tags={"@Smoke"}, //only tag with @smoke
			//tags={"@Smoke","@Regression"}, //AND condition
			 //tags={"@Smoke,@Regression"} , // OR condition// see the diff. in "" and ,
			tags={"~@Smoke,@Regresssion"}, // this will execute the scenarios except Smoke
			monochrome=true, //if false, garbage entries in log will come, to skip it monochrome should be true:readability
			dryRun=true, //check if all the required thing is present or not without actual run
			// by default state is false for both: monochrome and drrRun 
			features= {"src/test/resources/com/basic/getWithTagsOfCucuFF/"},
			glue={"com/basic/getWithTagsOfCucuSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report6.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunGetWithTagsTest {


}
