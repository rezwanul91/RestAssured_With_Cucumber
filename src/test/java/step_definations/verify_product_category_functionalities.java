package step_definations;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import static org.junit.Assert.*;
import org.json.JSONObject;

import base.Base;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

public class verify_product_category_functionalities extends Base{
	int id;
	int catId;
	String categoryName;
	
	@Given("I generate all test random value")
	public void i_generate_all_test_random_value() {
		categoryName = setUp();
	}

	@Given("I create a category")
	public void i_create_a_category() {
		
		HashMap<String, String> requestBody = new HashMap<String, String>();
	
		requestBody.put("categoryName", categoryName);
	Response	response = given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.post("http://skyschooling.com:8081/api/productCategory");
				
				assertEquals(response.statusCode(), 201);
				assertEquals(response.contentType(), "application/json");
				System.out.println(response.contentType());
				System.out.println(response.getHeader("Pragma"));
				System.out.println(response.getStatusLine());
				System.out.println(response.getTime());
	
				
				JSONObject resBody = new JSONObject(response.body().asString());
				System.out.println("Response Body = " + resBody);
				
				id = resBody.getInt("id");
				System.out.println("Id= " + id);
				
	}

	@Given("I verify category id and name")
	public void i_verify_category_id_and_name() {
	Response response =	given()
		.when()
		.get("http://skyschooling.com:8081/api/productCategory/"+ id);
	
		JSONObject resBody = new JSONObject(response.body().asString());
		catId = resBody.getInt("id");
		String catName = resBody.getString("categoryName");
		
		assertEquals(catId, id);
		assertEquals(catName, categoryName);
		
//		.then()
//		.statusCode(200)
//		.log().all();
	}

	@Given("I update category with ABCD1234 as category name")
	public void i_update_category_with_ABCD1234_as_category_name() {
		HashMap<String, String> requestBody = new HashMap<String, String>();
		
		requestBody.put("categoryName", "randomUserName");
		Response response = given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.put("http://skyschooling.com:8081/api/productCategory/" + id);
				
				assertEquals(response.statusCode(), 200);
				assertEquals(response.contentType(), "application/json");
				System.out.println(response.contentType());
				System.out.println(response.getHeader("Pragma"));
				System.out.println(response.getStatusLine());
				System.out.println(response.getTime());
	
				
				JSONObject resBody = new JSONObject(response.body().asString());
				System.out.println("Response Body = " + resBody);
				
				id = resBody.getInt("id");
				System.out.println("Id= " + id);
	}

	@Given("I verify updated category name")
	public void i_verify_updated_category_name() {
		given()
		.when()
		.get("http://skyschooling.com:8081/api/productCategory/"+ id)
		.then()
		.statusCode(200)
		.log().all();
	}

	@Given("I delete that category")
	public void i_delete_that_category() {
		given()
		.when()
		.delete("http://skyschooling.com:8081/api/productCategory/"+ id)
		.then()
		.statusCode(204)
		.log().all();
	}

	@Given("I veriy category is deleted")
	public void i_veriy_category_is_deleted() {
		given()
		.when()
		.get("http://skyschooling.com:8081/api/productCategory/"+ id)
		.then()
		.statusCode(404)
		.log().all();
		
		//ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Test INFO");
	}

}
