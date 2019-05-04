package com.basic.GetWithParameter;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report7.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		})

public class RunmyParameterFilterTest {


}
