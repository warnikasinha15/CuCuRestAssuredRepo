package com.basic.BasicsOfRestAssured;

//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseUrlAndEndPoint {
	
	
	//@BeforeClass
	public void testBaseURI(){
	
		RestAssured.baseURI = "https://ergast.com";
		RestAssured.basePath = "/api";
	
	}
	
	
	//@Test
	public void testBaseUIRAndEndPoint(){
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("/f1/2017/circuits.json");
		resp.then().log().all();
		resp.then().log().status();
		
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		//Assert.assertEquals("30", limitValue);
	}
	

}
