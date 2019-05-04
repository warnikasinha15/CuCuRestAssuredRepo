package com.basic.FirstFeatureTestGoogle;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyFirstepdef {

	Response resp;
	
		
	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
		//Response resp = 
		resp = RestAssured.given().relaxedHTTPSValidation().
					when().get("http://www.google.com");
		
	}
	
	@Then("^user checks the status code$")
	public void user_checks_the_status_code(){
		
		int statCode = resp.getStatusCode();
		Assert.assertEquals(200, statCode);
	}
	
}
