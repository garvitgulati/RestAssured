package Day1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import  static io.restassured.RestAssured.given;

import java.util.ArrayList;
public class StudentAppAPICalls {
  @Test
/*  public void f() {
	 given()
			  .when()
			  .get("http://localhost:9090/student/list")
			  .then()
			  .statusCode(200);
	 Response r=given().when().delete("http://localhost:9090/student/100");
	 
	 System.out.println(r.prettyPrint().toString());
//	 String fname=r.jsonPath().get("firstName");
	// Assert.assertEquals(fname,"Vernon" );
	 System.out.println(r.getTime());
  }*/
  public void putcall() {
	  ArrayList<String> courses=new ArrayList<String>();
	  courses.add("Digital Communication");
	  courses.add("Computer Networking");
	  courses.add("software testing");
	  
	  student st=new student();
	  st.setFirstName("Garvit");
	  st.setLastName("Gulati");
	  st.setEmail("grvtgulati@gmail.com");
	  st.setProgramme("it");
	  st.setCourses(courses);
	  
	  
	  given().contentType(ContentType.JSON).when().body(st).put("http://localhost:9090/student/101")
	  .then()
	  .statusCode(200);
	  
  }
  
}
