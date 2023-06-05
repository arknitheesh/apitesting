package org.ark;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TestApi {

	public static void main(String[] args) {
		
		Response apiurl = RestAssured.get("https://dummyjson.com/products");
		int statusCode = apiurl.getStatusCode();
		String statusLine = apiurl.statusLine();
		ResponseBody body = apiurl.getBody();
		
		
		System.out.println(statusCode);
		System.out.println(statusLine);
		System.out.println(body.asPrettyString());
		
		

	}

}
