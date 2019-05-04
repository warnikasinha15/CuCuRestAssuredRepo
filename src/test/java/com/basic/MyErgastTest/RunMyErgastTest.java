package com.basic.MyErgastTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"src/test/resources/com/basic/MyErgastTest/MyErgastF.feature"},
	    glue={"com/basic/MyErgastTest/"}
		
		)

public class RunMyErgastTest {
	


}
