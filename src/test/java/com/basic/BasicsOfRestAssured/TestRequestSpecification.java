package com.basic.BasicsOfRestAssured;

//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestRequestSpecification {
	
	
	//@BeforeClass
	public void testBaseURI(){
	
		RestAssured.baseURI = "https://ergast.com";
		RestAssured.basePath = "/api";
		RequestSpecification req = RestAssured.given()
				.accept(ContentType.JSON)
				.headers("","");
				
	
	}
	
	
	//@Test
	public void testRequestSpecification(){
		//Response resp = 
		
		RequestSpecification req = RestAssured.given().accept(ContentType.JSON);
		
		Response resp = RestAssured.given().spec(req).relaxedHTTPSValidation().
				when().get("/f1/2017/circuits.json");
		resp.then().log().all();
		resp.then().log().status();
		
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		//Assert.assertEquals("30", limitValue);
	}

}
