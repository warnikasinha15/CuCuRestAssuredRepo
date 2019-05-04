package com.basic.MyErgastTest;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class MyErgastSD {
	
	Response res;
	
	@Given("^I want to open Ergast$")
	public void i_want_to_open_Ergast() {
		res = RestAssured.given().get("https://ergast.com/api/f1/2017/circuits.json");
		}
//	
//	@Then("^I want to check \"([^\"]*)\" limit$")
//	public void i_want_to_check_limit(String arg1){
//		String limitvalue = res.getBody().jsonPath().getString("MRData.limit");
//		//json reads in STring so no need to convert
//		Assert.assertEquals("30", limitvalue);
//		// can be("30", limitvalue) but public void bracket should be empty not contain (String arg1)
//        //res.then().assertThat().body("MRData.limit", equalToIgnoringCase("30"));
		
	
	@Then("^I want to check \"([^\"]*)\" circuit limit$")
	public void i_want_to_check_circuit_limit(String arg1) {
		String limitvalue = res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitvalue);
	}
	
	@Then("^I want to check circuit count$")
	public void i_want_to_check_circuit_count(){
		List<Object> circuitIDcount = res.getBody().jsonPath().getList("MRData.CircuitTable.Circuits.circuitName");
		int count = circuitIDcount.size();
		String stringcount =Integer.toString(count);
		Assert.assertEquals("20", stringcount);

//	res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}
}
