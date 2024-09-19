package examples;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
	@BeforeClass
	public void setup() {
		
		//Request specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io/v2/pet").
				addHeader("Content-Type","application/json").
				build();
		
		//response specification
		responseSpec= new ResponseSpecBuilder().
				expectStatusCode(200).
				expectResponseTime(lessThanOrEqualTo(4000L)).
				build();
	}	

	@Test(priority=1)
	public void postRequest() {
		//Create request body
		Map<String,Object> reqBody = new HashMap<String,Object>();
		reqBody.put("id", "8130");
		reqBody.put("name", "tyson");
		reqBody.put("status", "alive");
		Response response = given().spec(requestSpec).body(reqBody).when().post();
		//extract the petID
		petId = response.then().extract().path("id");
		//assertion
		response.then().spec(responseSpec).body("status",equalTo("alive"));
	}
	
	@Test(dependsOnMethods= {"postRequest"},priority=2)
	public void getRequest() {
		//send request, get response, assert response
		given().spec(requestSpec).pathParam("petId",petId).
		when().get("/{petId}").
		then().spec(responseSpec).body("status",equalTo("alive"));
	}
	@Test(dependsOnMethods = {"postRequest"},priority = 3)
	public void deleteRequest() {
		given().spec(requestSpec).pathParam("petId",petId).log().all().
		when().delete("/{petId}").
		then().spec(responseSpec).body("message", equalTo("" + petId));
		
	}
	
}
