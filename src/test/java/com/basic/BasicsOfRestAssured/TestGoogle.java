package com.basic.BasicsOfRestAssured;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class TestGoogle {
	
	
	@Test
	public void testGoogle(){
		
		Response res = RestAssured.given().get("https://www.google.com/");
		int stCode =res.getStatusCode();
		Assert.assertEquals(200, stCode);
	}

}
