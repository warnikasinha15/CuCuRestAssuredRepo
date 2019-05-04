package com.basic.BasicsOfRestAssured;

//import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class FirstScriptForGoogle {
	
	
	
		//@Test
		public void testMethod(){
			
			//Case 1
			RestAssured.given().
						when().get("http://www.google.com").
						then().statusCode(200);
			
			//Case 2
			Response res = RestAssured.given().when().get("http://www.google.com");
			res.then().assertThat().statusCode(200);
			
		}
	

}
