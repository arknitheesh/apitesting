package org.ark;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class apiPOST {

	public static void main(String[] args) {
		
		
		Response posturl = RestAssured.get("https://dummyjson.com/products/search?q=Laptop");
		int statusCode = posturl.statusCode();
		String statusLine = posturl.getStatusLine();
		
		Headers headers = posturl.getHeaders();
		
		System.out.println(statusCode);
		System.out.println(statusLine);
		System.out.println(headers.asList());

	}

}
