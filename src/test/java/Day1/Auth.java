package Day1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;
import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
public class Auth {
  @Test
/*  public void f() {
	  given()
	  .proxy("192.168.100.1",8081)
	  .auth().oauth2("3c81066001d69253db92b400a3f271fc14b2a112")//used for checking person to person
	  .when()
	  .post("http://coop.apps.symfonycasts.com/api/423/chickens-feed")
	  .then()
	  .statusCode(200);*/
  public void f() {
	Response r=  given()
			.proxy("192.168.100.1",8081)
	  .formParam("client_id", "Demog")
	  .formParam("client_secret", "22d2ac20b6517348b4424eb3f66ae0ec")
	  .formParam("grant_type", "client_credentials")
	  .when()
	  .post("http://coop.apps.symfonycasts.com/token");
	  
	  
	  System.out.println(r.jsonPath().prettify());
	  String token=r.jsonPath().get("access_token");
	  System.out.println("token is "+token);
}
}
