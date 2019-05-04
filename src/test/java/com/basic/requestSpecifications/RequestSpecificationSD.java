package com.basic.requestSpecifications;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationSD {
	
	
RequestSpecification req;
	
	@Before
	public void setup(){
		RestAssured.baseURI = "https://ergast.com";
		RestAssured.basePath = "/api";
		req = RestAssured.given().accept(ContentType.JSON);
	}
	
	@Given("^user hit the get request$")
	public void user_hit_the_get_request(){
		Response resp = RestAssured.given().spec(req).relaxedHTTPSValidation().
				when().get("/f1/2017/circuits.json");
		resp.then().log().all();
		resp.then().log().status();
	}
	
	
	

}
