import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;

public class Tests_POST {
	@Test
	public void test_1_post() {
		
	//first will create a body with the use of map.
//		
//		Map<String, Object> map =new HashMap<String, Object>();
//        map.put("name", "Neha");
//        map.put("job", "QA");
//		
//	System.out.println(map);
	
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
     post("https://reqres.in/api/users").
	then().
	statusCode(200).
	log().all();
	

}
}
