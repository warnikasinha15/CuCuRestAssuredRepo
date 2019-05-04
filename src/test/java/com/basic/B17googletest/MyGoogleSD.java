package com.basic.B17googletest;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGoogleSD {
	
	Response res;
	
	@Given("^I want to open google$")
	public void i_want_to_open_google(){
		System.out.println("Hitting google.com");
		res = RestAssured.given().get("https://www.google.com/");
	}

	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String statusCode) {
		System.out.println("validating status code");
		int stCode =res.getStatusCode();
		String ssStCode = Integer.toString(stCode);
		Assert.assertEquals(statusCode, ssStCode);
	}
	
	@Then("^I want to check status code1$")
	public void i_want_to_check_status_code1() {
		System.out.println("validating status code");
		int stCode =res.getStatusCode();
		Assert.assertEquals(200, stCode);
	}
	
	

}
