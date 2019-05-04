package com.basic.GoogleTest;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGoogleSD {
	
	Response res;
	
	@Given("^I want to open google$")
	public void i_want_to_open_google() {
		System.out.println("Hitting google.com");
		res = RestAssured.given().get("https://www.google.com/");
	   
	}

//	@Then("^I want to check status code$")
//	public void i_want_to_check_status_code(){
//		int stCode = res.getStatusCode();
//		Assert.assertEquals(200, stCode); 
//	}

	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String arg1) {
		int stCode = res.getStatusCode();
		String sstCode = Integer.toString(stCode); // changing int to string for comparison of int and String
		Assert.assertEquals(arg1, sstCode);
		
	}
	
	}
