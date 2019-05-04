package com.basic.GetWithParameter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.Assert;

public class MyParameterFilterStepdef {

	Response resp;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test(){
		
		System.out.println("Starting of the GET request");
		
	}
	
	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
		
		//Path Parameter
		resp = RestAssured.given().relaxedHTTPSValidation()
				.pathParam("country", "India").
	when().get("http://restcountries.eu/rest/v1/name/{country}");
		
		//print response in string
		String respString = resp.asString();
		System.out.println(respString);
		
		//get all headers
		Headers heds = resp.getHeaders();
		System.out.println(heds);
		
	}
	
	
	@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expStatusCode){
		//Get status code from the response
		//int ExpCode = Integer.parseInt(expStatusCode);
		int statusCode = resp.getStatusCode();
		Assert.assertTrue(expStatusCode==statusCode);
	}
	
	
	
	
	
}
