package AutoTrain.AmtrakApi;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@SuppressWarnings("unused")
public class travelDetails {

	static Properties prop = new Properties();

	@BeforeTest
	public void getData() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\manuranjan.prasad\\eclipse-workspace\\AmtrakApi\\Base.properties");
		prop.load(fis);

		// prop.get("HOST");
	}

	@Test
	public static void FirstAmtrakApi() {
		RestAssured.baseURI = "https://ridertest.amtrak.com/v3";
		Response res = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
				.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
				.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
				body(").
				when().post("/cart/5b6cf873-9280-41ea-9991-066ea4646aab/traveler-information").
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
				extract().response();

		
		
		
		
		  String responseString=res.asString(); 
		  System.out.println(responseString);
		
		  JsonPath js= new JsonPath(responseString); 
		  
		  String  cartID=js.get("data.balanceDue"); 
		  System.out.println(cartID);
		  
		  
		  
		  Response res1 = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
					.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
					.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
					body("{"+ 
							"  \"cartId\": \"5b6cf873-9280-41ea-9991-066ea4646aab\"," + 
							"  \"tncVersion\": \"1.0.0\"," + 
							"  \"contactpref\" : {" + 
							"               \"contactType\": \"E\"," + 
							"              \"intervalBeforeDeparture\": \"00:30\"" + 
							"  }" + 
							"} ").
					when().post("v3/order/reservation").
					then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
					extract().response();

			
			
			
			
			  String responseString1=res1.asString(); 
			  System.out.println(responseString1);
			
			  JsonPath js1= new JsonPath(responseString); 
			  
			  String  cartID1=js1.get("data.balanceDue"); 
			  System.out.println(cartID1);
			  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 }
}