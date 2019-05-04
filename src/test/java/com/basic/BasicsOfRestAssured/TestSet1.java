package com.basic.BasicsOfRestAssured;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.response.Response;

public class TestSet1 {
	
	
	//@Test
	public void testSizeOf(){
		
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		//verify the size
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
		//print response in string
		String respString = resp.asString();
		System.out.println(respString);
		
		//Get status code from the response
		int sCode = resp.getStatusCode();
		System.out.println("status code = "+ sCode);
		resp.then().assertThat().statusCode(200);
	}
	
	public void testStatusCode(){
		
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		//Get status code from the response
		int sCode = resp.getStatusCode();
		System.out.println("status code = "+ sCode);
		resp.then().assertThat().statusCode(200);
	}
	
	
	
	@Test
	public void testResponseHeaders(){
		
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		
		//get all headers
		Headers heds = resp.getHeaders();
		List<Header> allHeaders = heds.asList();
		for (Header header : allHeaders) {
			System.out.println(header.getValue());
		}
		System.out.println(heds);
		
		
		
		
		
	}
	
	
	
	//@Test
	public void test(){
		
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		//verify the size
		resp.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
		
		//print response in string
		String respString = resp.asString();
		System.out.println(respString);
		
		//Get status code from the response
		int sCode = resp.getStatusCode();
		System.out.println("status code = "+ sCode);
		resp.then().assertThat().statusCode(200);
	}
	
	
	//@Test
	public void testResponseValueStringWithJsonpathWithTestNG(){
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		//Assert.assertEquals("30", limitValue);
		
	}
	
	//@Test
	public void testResponseValueStringWithJsonpath(){
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation().
				when().get("https://ergast.com/api/f1/2017/circuits.json");
		
		resp.then().assertThat().body("MRData.limit", equalTo("30"));
		
	}
	
	
	public void testCompareTwoJson(){
		
		String actual = "{id:123, name:\"John\"}";
		String expected = "{id:123, name:\"JohnABC\"}";
		
		
		//LENIENT : means that even if the actual JSON contains extended fields, the test will still pass
		//STRICT : means that if the actual JSON contains extended fields, the test will still FAIL
		JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
	}
	
	
	public void testQueryParameter(){
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation()
				.queryParam("text", "test")
				.when().get("http://md5.jsontest.com");
		System.out.println(resp.asString());
				
	}
	
	
	public void testRespTime(){
		
		//Response resp = 
		Response resp = RestAssured.given().relaxedHTTPSValidation()
				.queryParam("text", "test")
				.when().get("http://md5.jsontest.com");
		System.out.println(resp.time());
		System.out.println(resp.timeIn(TimeUnit.SECONDS));
				
	}
	
	
	
	
	
	

}
