package com.basic.B17googletest;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/basic/B17googletest/MyGoogleFF.feature",
				"src/test/resources/com/basic/B17googletest/MyGoogleFF2.feature"},
		glue={"com/basic/B17googletest/"}
		
		
		)

public class RunMyGoogleTest {

}
