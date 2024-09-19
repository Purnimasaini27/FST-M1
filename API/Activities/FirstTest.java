package examples;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {

	// GET : https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	@Test
	public void getRequestWithQueryParam() {
		//send request and save request
		Response response = 
				given().
					baseUri("https://petstore.swagger.io/v2/pet").
					header("Content-Type","application/json").
					queryParam("status","alive").
					when().get("/findByStatus");
		
		//print the response headers
		System.out.println(response.headers());
		
		//print the response body 
		System.out.println(response.getBody().asString());
		System.out.println("----------------------------------------");
		System.out.println(response.getBody().asPrettyString());
	
		//Extract properties from response
		String petStatus = response.then().extract().path("[0].status");
		System.out.println("Pet status : " + petStatus);
		
		//TestNG assertion
		Assert.assertEquals(petStatus, "alive");
		
		//RestAssurred assertion
		response.then().statusCode(200).body("[0].status",equalTo("alive"));
		
	}
	
	
	//GET : https://petstore.swagger.io/v2/pet/{petId}
	@Test
	public void getRequestWithPathParam() {
		//send request and get request , and assert with logging
		
				given().
					baseUri("https://petstore.swagger.io/v2/pet").
					header("Content-Type","application/json").
					pathParam("petId",77232).
				when().
					get("/{petId}").
				then().
					statusCode(200).
					body("status", equalTo("alive")).
					body("name", equalTo("Riley"));
	}
}
