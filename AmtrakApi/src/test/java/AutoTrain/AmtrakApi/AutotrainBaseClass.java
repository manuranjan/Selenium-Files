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
public  class  AutotrainBaseClass {
	

	@Test
	public static void FirstAmtrakApi()
	{
		 RestAssured.baseURI= "https://ridertest.amtrak.com/v3";
		Response res=given().header("Content-Type", "application/json").
				header("request-id", "AMT1234").
				header("client_id", "78ae45f2d97449d18fc05bce1e0592fe").
				header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
				body("{\"reservableAccomodationOptions\":\"CHEAPEST\","+
						"\"journeyRequest\":{\"fare\":{\"pricingUnit\":\"DOLLARS\"},"+
						"\"type\":\"OW\","+
						"\"journeyLegRequests\":[{\"origin\":{\"code\":\"NFL\",\"schedule\":{\"departureDateTime\":\"2019-08-30T00:00:00\"}},"+
						"\"destination\":{\"code\":\"NFS\"},"+
						"\"passengers\":[{\"type\":\"F\",\"id\":\"P1\"}]}]},"+
						"\"initialJourneyLegOnly\":false,"+
						"\"versionNumber\":\"3.2.4\","+
						"\"appType\":\"AND\"} ").
		when().
		post("/journey-solution-option").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("data.journeyRequest.fare.pricingUnit",equalTo("DOLLARS")).
		extract().response();
		
	
		
		/*
		 * String responseString=res.asString(); System.out.println(responseString);
		 * JsonPath js= new JsonPath(responseString); String
		 * placeid=js.get("data.journeySolutionOption.journeyLegs[0].id");
		 * System.out.println(placeid);
		 */
		
		Response res1=given().header("Content-Type", "application/json").
				header("request-id", "AMT1234").
				header("client_id", "78ae45f2d97449d18fc05bce1e0592fe").
				header("client_secret", "03Dd272F7805412C9d395c6322cDb8CF").
				body("{\"{  \r\n" + 
						"   \\\"ancillaryProduct\\\":[  \r\n" + 
						"\r\n" + 
						"   ],\r\n" + 
						"   \\\"journeyRequest\\\":[  \r\n" + 
						"      {  \r\n" + 
						"         \\\"fare\\\":{  \r\n" + 
						"            \\\"pricingUnit\\\":\\\"DOLLARS\\\"\r\n" + 
						"         },\r\n" + 
						"         \\\"journeyLegRequests\\\":[  \r\n" + 
						"            {  \r\n" + 
						"               \\\"destination\\\":{  \r\n" + 
						"                  \\\"code\\\":\\\"LOR\\\",\r\n" + 
						"                  \\\"schedule\\\":{  \r\n" + 
						"                     \\\"arrivalDateTime\\\":\\\"NA\\\"\r\n" + 
						"                  }\r\n" + 
						"               },\r\n" + 
						"               \\\"origin\\\":{  \r\n" + 
						"                  \\\"code\\\":\\\"SFA\\\",\r\n" + 
						"                  \\\"schedule\\\":{  \r\n" + 
						"                     \\\"departureDateTime\\\":\\\"2019-03-27T00:00:00\\\"\r\n" + 
						"                  }\r\n" + 
						"               },\r\n" + 
						"               \\\"passengers\\\":[  \r\n" + 
						"                  {  \r\n" + 
						"                     \\\"id\\\":\\\"P1\\\",\r\n" + 
						"                     \\\"isDiscounted\\\":false,\r\n" + 
						"                     \\\"isModified\\\":false,\r\n" + 
						"                     \\\"type\\\":\\\"F\\\"\r\n" + 
						"                  }\r\n" + 
						"               ]\r\n" + 
						"            }\r\n" + 
						"         ],\r\n" + 
						"         \\\"type\\\":\\\"One-Way\\\"\r\n" + 
						"      }\r\n" + 
						"   ],\r\n" + 
						"   \\\"customerId\\\":\\\"ANONYMOUS\\\",\r\n" + 
						"   \\\"journeySolution\\\":{  \r\n" + 
						"      \\\"id\\\":\\\"3935d564-cdc9-4864-a348-2ceed92728b5\\\",\r\n" + 
						"      \\\"action\\\":\\\"NN\\\",\r\n" + 
						"      \\\"journeyLegs\\\":[  \r\n" + 
						"         {  \r\n" + 
						"            \\\"id\\\":\\\"journeyLeg-1\\\",\r\n" + 
						"            \\\"selectedJourneyLegOption\\\":{  \r\n" + 
						"               \\\"selectedAccommodations\\\":[  \r\n" + 
						"                  {  \r\n" + 
						"                     \\\"travelLegAccommodations\\\":[  \r\n" + 
						"                        {  \r\n" + 
						"                           \\\"isUnaccompaniedChild\\\":false,\r\n" + 
						"                           \\\"selectedProduct\\\":{  \r\n" + 
						"                              \\\"availableInventory\\\":53,\r\n" + 
						"                              \\\"capacity\\\":1,\r\n" + 
						"                              \\\"code\\\":\\\"1027\\\",\r\n" + 
						"                              \\\"count\\\":1,\r\n" + 
						"                              \\\"lowAvailabilityThreshold\\\":4,\r\n" + 
						"                              \\\"maxAllowedCount\\\":1,\r\n" + 
						"                              \\\"name\\\":\\\"Reserved Coach Seat\\\",\r\n" + 
						"                              \\\"position\\\":\\\"U\\\",\r\n" + 
						"                              \\\"rbd\\\":\\\"YA\\\",\r\n" + 
						"                              \\\"rbdType\\\":\\\"Coach\\\",\r\n" + 
						"                              \\\"fareFamilyName\\\":\\\"Value Reserved Coach\\\",\r\n" + 
						"                              \\\"fareFamilyDescription\\\":\\\"Refundability options. Cancel fee may apply.\\\"\r\n" + 
						"                           },\r\n" + 
						"                           \\\"passengers\\\":[  \r\n" + 
						"                              {  \r\n" + 
						"                                 \\\"id\\\":\\\"P1\\\",\r\n" + 
						"                                 \\\"initialType\\\":\\\"F\\\",\r\n" + 
						"                                 \\\"isDiscounted\\\":false,\r\n" + 
						"                                 \\\"isModified\\\":false,\r\n" + 
						"                                 \\\"passengerFare\\\":{  \r\n" + 
						"                                    \\\"dollarsAmount\\\":{  \r\n" + 
						"                                       \\\"accommodation\\\":\\\"0.00\\\",\r\n" + 
						"                                       \\\"rail\\\":\\\"219.00\\\",\r\n" + 
						"                                       \\\"total\\\":\\\"219.00\\\"\r\n" + 
						"                                    },\r\n" + 
						"                                    \\\"pricingUnit\\\":\\\"DOLLARS\\\"\r\n" + 
						"                                 },\r\n" + 
						"                                 \\\"type\\\":\\\"F\\\"\r\n" + 
						"                              }\r\n" + 
						"                           ],\r\n" + 
						"                           \\\"travelLegFare\\\":{  \r\n" + 
						"                              \\\"dollarsAmount\\\":{  \r\n" + 
						"                                 \\\"accommodation\\\":\\\"0.00\\\",\r\n" + 
						"                                 \\\"rail\\\":\\\"219.00\\\",\r\n" + 
						"                                 \\\"total\\\":\\\"219.00\\\"\r\n" + 
						"                              },\r\n" + 
						"                              \\\"farePlan\\\":\\\"AOAT\\\",\r\n" + 
						"                              \\\"pricingUnit\\\":\\\"DOLLARS\\\"\r\n" + 
						"                           },\r\n" + 
						"                           \\\"travelLegId\\\":\\\"AFA2094D0-43DD-11E9-81C3-010630C72965\\\",\r\n" + 
						"                           \\\"vehicles\\\":[  \r\n" + 
						"\r\n" + 
						"                           ]\r\n" + 
						"                        }\r\n" + 
						"                     ],\r\n" + 
						"                     \\\"accommodationFare\\\":{  \r\n" + 
						"                        \\\"pricingUnit\\\":\\\"DOLLARS\\\",\r\n" + 
						"                        \\\"dollarsAmount\\\":{  \r\n" + 
						"                           \\\"rail\\\":\\\"219.00\\\",\r\n" + 
						"                           \\\"accommodation\\\":\\\"0.00\\\",\r\n" + 
						"                           \\\"total\\\":\\\"219.00\\\"\r\n" + 
						"                        }\r\n" + 
						"                     },\r\n" + 
						"                     \\\"category\\\":\\\"RG\\\",\r\n" + 
						"                     \\\"fareFamily\\\":\\\"VAL\\\",\r\n" + 
						"                     \\\"isMixedClass\\\":false,\r\n" + 
						"                     \\\"isThroughfare\\\":false,\r\n" + 
						"                     \\\"travelClass\\\":\\\"Coach\\\"\r\n" + 
						"                  }\r\n" + 
						"               ],\r\n" + 
						"               \\\"destination\\\":{  \r\n" + 
						"                  \\\"code\\\":\\\"LOR\\\",\r\n" + 
						"                  \\\"name\\\":\\\"Lorton (Auto Train), Virginia\\\",\r\n" + 
						"                  \\\"schedule\\\":{  \r\n" + 
						"                     \\\"arrivalDateTime\\\":\\\"2019-03-28T08:59:00\\\"\r\n" + 
						"                  }\r\n" + 
						"               },\r\n" + 
						"               \\\"origin\\\":{  \r\n" + 
						"                  \\\"code\\\":\\\"SFA\\\",\r\n" + 
						"                  \\\"name\\\":\\\"Sanford (Auto Train), Florida\\\",\r\n" + 
						"                  \\\"schedule\\\":{  \r\n" + 
						"                     \\\"departureDateTime\\\":\\\"2019-03-27T16:00:00\\\"\r\n" + 
						"                  }\r\n" + 
						"               },\r\n" + 
						"               \\\"elapsedTime\\\":\\\"P0DT16H59M\\\",\r\n" + 
						"               \\\"id\\\":\\\"AFA209426-43DD-11E9-81C3-010630C72965\\\",\r\n" + 
						"               \\\"isAncillaryAvailable\\\":false,\r\n" + 
						"               \\\"isBorderCross\\\":false,\r\n" + 
						"               \\\"isCancelled\\\":false,\r\n" + 
						"               \\\"isRTDiscountAvailable\\\":false,\r\n" + 
						"               \\\"isRestricted\\\":false,\r\n" + 
						"               \\\"isSegPriceAvailable\\\":false,\r\n" + 
						"               \\\"travelLegs\\\":[  \r\n" + 
						"                  {  \r\n" + 
						"                     \\\"destination\\\":{  \r\n" + 
						"                        \\\"code\\\":\\\"LOR\\\",\r\n" + 
						"                        \\\"name\\\":\\\"Lorton (Auto Train), Virginia\\\",\r\n" + 
						"                        \\\"schedule\\\":{  \r\n" + 
						"                           \\\"arrivalDateTime\\\":\\\"2019-03-28T08:59:00\\\"\r\n" + 
						"                        }\r\n" + 
						"                     },\r\n" + 
						"                     \\\"elapsedTime\\\":\\\"P0DT16H59M\\\",\r\n" + 
						"                     \\\"id\\\":\\\"AFA2094D0-43DD-11E9-81C3-010630C72965\\\",\r\n" + 
						"                     \\\"isAncillaryAvailable\\\":false,\r\n" + 
						"                     \\\"isBorderCross\\\":false,\r\n" + 
						"                     \\\"isCancelled\\\":false,\r\n" + 
						"                     \\\"isRestricted\\\":false,\r\n" + 
						"                     \\\"isSelfTransfer\\\":false,\r\n" + 
						"                     \\\"numberOfStops\\\":0,\r\n" + 
						"                     \\\"origin\\\":{  \r\n" + 
						"                        \\\"code\\\":\\\"SFA\\\",\r\n" + 
						"                        \\\"name\\\":\\\"Sanford (Auto Train), Florida\\\",\r\n" + 
						"                        \\\"schedule\\\":{  \r\n" + 
						"                           \\\"departureDateTime\\\":\\\"2019-03-27T16:00:00\\\"\r\n" + 
						"                        }\r\n" + 
						"                     },\r\n" + 
						"                     \\\"travelService\\\":{  \r\n" + 
						"                        \\\"amenities\\\":[  \r\n" + 
						"                           {  \r\n" + 
						"                              \\\"code\\\":\\\"L\\\",\r\n" + 
						"                              \\\"name\\\":\\\"Lounge\\\"\r\n" + 
						"                           },\r\n" + 
						"                           {  \r\n" + 
						"                              \\\"code\\\":\\\"D\\\",\r\n" + 
						"                              \\\"name\\\":\\\"Dining car\\\"\r\n" + 
						"                           },\r\n" + 
						"                           {  \r\n" + 
						"                              \\\"code\\\":\\\"N\\\",\r\n" + 
						"                              \\\"name\\\":\\\"WiFi\\\"\r\n" + 
						"                           },\r\n" + 
						"                           {  \r\n" + 
						"                              \\\"code\\\":\\\"R\\\",\r\n" + 
						"                              \\\"name\\\":\\\"Onboard Wheelchair Ramp\\\"\r\n" + 
						"                           }\r\n" + 
						"                        ],\r\n" + 
						"                        \\\"carrier\\\":\\\"AMTRAK\\\",\r\n" + 
						"                        \\\"isAcela\\\":false,\r\n" + 
						"                        \\\"name\\\":\\\"Auto Train\\\",\r\n" + 
						"                        \\\"number\\\":\\\"52\\\",\r\n" + 
						"                        \\\"type\\\":\\\"Train\\\"\r\n" + 
						"                     },\r\n" + 
						"                     \\\"isOvernight\\\":true,\r\n" + 
						"                     \\\"isThruway\\\":false,\r\n" + 
						"                     \\\"typeIcon\\\":\\\"assets/icon/train-white.svg\\\",\r\n" + 
						"                     \\\"typeIconAlt\\\":\\\"train\\\",\r\n" + 
						"                     \\\"segmentNum\\\":1\r\n" + 
						"                  }\r\n" + 
						"               ],\r\n" + 
						"               \\\"logicalId\\\":\\\"52_SFA-1S\\\"\r\n" + 
						"            }\r\n" + 
						"         }\r\n" + 
						"      ]\r\n" + 
						"   }\r\n" + 
						"}\"").
		when().
		post("/cart").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("data.journeyRequest.fare.pricingUnit",equalTo("DOLLARS")).
		extract().response();
		
		
		 
		
		
		
		
	}
}
