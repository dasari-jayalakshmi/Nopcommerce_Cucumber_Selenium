package restAssured;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

public class HTTPRequests {

	@Test
	void getUsersStatus() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}
	
	@Test
	public void checkFirstNamesInGetUsers() {

		given().get("https://reqres.in/api/users?page=2").then().
		statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael","Lindsay")).
		log().all();

	}
	
	@Test
	public void postUsers() {

		JSONObject request = new JSONObject();
		request.put("first_name", "Jayalakshmi");
		request.put("job", "TestAnalyst");

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );

	}
}
