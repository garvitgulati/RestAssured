package Day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class BasicAuthentication {
 @BeforeClass
 public void beforeClass()
 {
	 RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA", "TestPassword");
 }
	@Test
  public void PreemptiveAuthentication() {
	  given().proxy("192.168.100.1",8081).when().get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
	  .then().statusCode(200);
  }
}
