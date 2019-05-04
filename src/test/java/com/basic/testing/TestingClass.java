package com.basic.testing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingClass {
	
	
	@Given("launching Google")
	public void abc(){
		
		System.out.println("hello java");
		Response resp = RestAssured.given().when().get("https://www.google.com/");
		int i = resp.statusCode();
		System.out.println("code = "+ i);
	}
	
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user checks \"([^\"]*)\" value$")
	public void user_checks_value(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

//	@Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
//	public void user_checks_at_path_with_the_value(String arg1, String arg2) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}



}
