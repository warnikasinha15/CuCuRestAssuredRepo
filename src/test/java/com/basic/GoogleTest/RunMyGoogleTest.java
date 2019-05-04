package com.basic.GoogleTest;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"src/test/resources/com/basic/GoogleTest/MyGoogleFF.feature"},
		glue={"com/basic/GoogleTest/"}
		
		//under features: no need of mentioning .feature file if there is single feature file
		//in case there are 2 or many feature file, specification is required to run
		)

public class RunMyGoogleTest {

}
