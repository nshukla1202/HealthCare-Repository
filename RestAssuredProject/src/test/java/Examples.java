import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Examples {
	
	//@Test
	public void test_Get() {
		
     //before doing given let me set the base URI is from Rest Assured.
		
		baseURI ="http://localhost:3000/";
		given().
		param("name","Automation").
		get("/subjects").
		then().
		statusCode(200).
		log().all();	
		
	}
	//@Test
	public void test_post() {
	//For doing the  post we need to provide body for providing body we need to put some jason library.
		
		JSONObject request =new JSONObject();
		request.put("firstName", "Tom");
		request.put("lastNmae", "jerry");
		request.put("subjectId", 1);
		
		baseURI ="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).header("contentType","application/json").
		body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).
		log().all();		
		
	}
	//@Test
	public void test_patch() {
		
		//Here in this test i will update the last name only thats what we do in case of Patch methods of HTTPS.
		
		JSONObject request =new JSONObject();
		
		request.put("lastName","Sephard");
		baseURI ="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).header("contentType","application/json").
		body(request.toJSONString()).
		when().
		patch("/users/4").
		then().
		statusCode(200).
		log().all();	
		
		
	}
	//@Test
	public void test_put() {
		
		JSONObject request =new JSONObject();
		request.put("firstName", "Merry");
		request.put("lastNmae", "jane");
		request.put("subjectId", 1);	
		baseURI ="http://localhost:3000/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).header("contentType","application/json").
		body(request.toJSONString()).
		when().
		put("/users/4").
		then().
		statusCode(200).
		log().all();		
		
		
	}
	@Test
	public void test_delete() {
		baseURI ="http://localhost:3000/";
		
		when().
		delete("/users/4").
		then().
		statusCode(200);
		
		
		
	}

}
