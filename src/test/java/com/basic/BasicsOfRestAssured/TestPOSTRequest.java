package com.basic.BasicsOfRestAssured;

//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestPOSTRequest {
	
	
	//@Test
	public void testPost1(){
		
		Response resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{    \"name\": \"morpheus\",    \"job\":\"leader\"}").post("https://reqres.in/api/users");
		resp.then().log().all();
		resp.then().log().status();
		
	}
	
	
	//@Test
	public void testPostWithJsonFile(){
		
		Response resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("SampleJsonTextFile.txt").post("https://reqres.in/api/users");
		resp.then().log().all();
		resp.then().log().status();
		
	}

}
