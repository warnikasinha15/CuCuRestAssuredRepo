package com.basic.BasicsOfRestAssured;

//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestUpdateRequest {
	
	
	
	//@Test
	public void testUpdate1(){
		
		Response resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{    \"name\": \"morpheus\",    \"job\":\"Test\"}").put("https://reqres.in/api/users");
		resp.then().log().all();
		resp.then().log().status();
		
	}

}
