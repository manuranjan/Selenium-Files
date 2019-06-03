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
public class AutotrainPoints {

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
		//CardID Extraction
		Response res = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
				.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
				.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
				body(ResusableFunctions.getPostDataCartIDPoints()).  
				when().post("/cart").
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
				extract().response();
		  String responseString=res.asString(); 
		  System.out.println(responseString);		
		  JsonPath js= new JsonPath(responseString); 
		  String  cartID=js.get("data.cartId"); 
		  System.out.println(cartID);
		  //Traveller's Info and Balance due Extraction
		  Response res1 = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
					.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
					.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
					body(ResusableFunctions.getPostDataTravelersInfo()).
					when().post("/cart/"+cartID+"/traveler-information/").
					then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
					extract().response();
		  String responseString1=res1.asString(); 
		  System.out.println(responseString1);		
		  JsonPath js1= new JsonPath(responseString); 
		  String  balancedue=js1.get("data.balanceDue"); 
		  System.out.println(balancedue);

		  //OrderReservation and RCN Extraction
		  Response res2 = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
					.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
					.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
					body("{" + 
							"  \"cartId\": \""+cartID+"\"," + 
							"  \"tncVersion\": \"1.0.0\"," + 
							"  \"contactpref\" : {" + 
							"               \"contactType\": \"E\"," + 
							"              \"intervalBeforeDeparture\": \"00:30\"" + 
							"  }" + 
							"} ").
					when().post("/order/reservation").
					then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
					extract().response();
		  String responseString2=res2.asString(); 
		  System.out.println(responseString2);		
		
		 JsonPath js2= new JsonPath(responseString2); 
		 
		 String rcn=js2.get("rcn"); 
		 System.out.println(rcn);
		 
		 //PNR Extraction 
		 
		 Response last = given().header("Content-Type", "application/json").header("request-id", "AMT1234")
					.header("client_id", "78ae45f2d97449d18fc05bce1e0592fe")
					.header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
					body("{\"cartId\": \""+cartID+"\", " + 
							"	\"deviceId\": \"23aq\", " + 
							"	\"travelInsurance\": false, " + 
							"	\"mfopOptions\": { " + 
							"		\"paymentOptions\": { " + 
							"			\"creditCard\": { " + 
							"				\"amount\": \""+balancedue+"\", " + 
							"				\"cardNumber\": \"4111111111111111\", " + 
							"				\"expireDate\": \"1225\", " + 
							"				\"cardHolderName\": \"Rishikesh Kollipara\", " + 
							"				\"cvv\": \"123\", " + 
							"				\"eciCode\": \"05\", " + 
							"				\"avv\": \"88\", " + 
							"				\"billingZipCode\": \"10001\", " + 
							"				\"cardType\": \"VI\", " + 
							"				\"addressType\": \"B\", " + 
							"				\"addressLine1\": \"asdas\", " + 
							"				\"addressLine2\": \"asdasd\", " + 
							"				\"city\": \"NY\", " + 
							"				\"state\": \"AL\" " + 
							"			} " + 
							"		}, " + 
							"		\"rcn\": \""+rcn+"\" "+ 
							"	}, " + 
							"	\"ticketDeliveryOptions\": [ " + 
							"		\"Barcode\" " + 
							"	], " + 
							"	\"versionNumber\": \"3.2.0\", " + 
							"	\"appType\": \"AND\" " + 
							"}").
					when().post("/order/payment").
					then().assertThat().statusCode(200).and().contentType(ContentType.JSON).			
					extract().response();
		  String responseStringfinal=last.asString(); 
		  System.out.println(responseStringfinal);		
		
		 JsonPath jsfinal= new JsonPath(responseStringfinal); 
		 
		 String PNR=jsfinal.get("data.PNRNumber"); 
		 System.out.println("Genearted PNR  "+  PNR);
		 
		  
		  

	}
}