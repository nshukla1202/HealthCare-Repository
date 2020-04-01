import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class Test_delete {
	
	@Test
	public void test_delete() {
		
		 when().
		  delete("https://reqres.in/api/users/2").
		 then().
		 statusCode(200). //when you say its 200 it should fail because delete is for 204 means no content.
		 log().all();
		 
		 
	}

}
