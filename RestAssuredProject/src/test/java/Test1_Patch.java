import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class Test1_Patch {
	
	@Test
	public void test_patch() {
		
		JSONObject request= new JSONObject();
		   request.put("name", "Neha");
		   request.put("job", "QA");
		   System.out.println(request);
		  System.out.println(request.toJSONString());
		  given().
		   header("Content-Type","application/json").
		  contentType(ContentType.JSON).
		  accept(ContentType.JSON).
		   body(request.toJSONString()).
		  when().
		  patch("https://reqres.in/api/users/2").
		 then().
		 statusCode(200).
		 log().all();
		  

		
		
	}

}
