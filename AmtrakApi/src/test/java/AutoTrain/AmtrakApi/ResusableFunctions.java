package AutoTrain.AmtrakApi;

public class ResusableFunctions {
	
	public static String getPostDataCartIDDollars()
	{
	
		String b ="{   " + 
				"   \"ancillaryProduct\":[   " + 
				" " + 
				"   ], " + 
				"   \"journeyRequest\":[   " + 
				"      {   " + 
				"         \"fare\":{   " + 
				"            \"pricingUnit\":\"DOLLARS\" " + 
				"         }, " + 
				"         \"journeyLegRequests\":[   " + 
				"            {   " + 
				"               \"destination\":{   " + 
				"                  \"code\":\"LOR\", " + 
				"                  \"schedule\":{   " + 
				"                     \"arrivalDateTime\":\"NA\" " + 
				"                  } " + 
				"               }, " + 
				"               \"origin\":{   " + 
				"                  \"code\":\"SFA\", " + 
				"                  \"schedule\":{   " + 
				"                     \"departureDateTime\":\"2019-07-27T00:00:00\" " + 
				"                  } " + 
				"               }, " + 
				"               \"passengers\":[   " + 
				"                  {   " + 
				"                     \"id\":\"P1\", " + 
				"                     \"isDiscounted\":false, " + 
				"                     \"isModified\":false, " + 
				"                     \"type\":\"F\" " + 
				"                  } " + 
				"               ] " + 
				"            } " + 
				"         ], " + 
				"         \"type\":\"One-Way\" " + 
				"      } " + 
				"   ], " + 
				"   \"customerId\":\"ANONYMOUS\", " + 
				"   \"journeySolution\":{   " + 
				"      \"id\":\"3935d564-cdc9-4864-a348-2ceed92728b5\", " + 
				"      \"action\":\"NN\", " + 
				"      \"journeyLegs\":[   " + 
				"         {   " + 
				"            \"id\":\"journeyLeg-1\", " + 
				"            \"selectedJourneyLegOption\":{   " + 
				"               \"selectedAccommodations\":[   " + 
				"                  {   " + 
				"                     \"travelLegAccommodations\":[   " + 
				"                        {   " + 
				"                           \"isUnaccompaniedChild\":false, " + 
				"                           \"selectedProduct\":{   " + 
				"                              \"availableInventory\":53, " + 
				"                              \"capacity\":1, " + 
				"                              \"code\":\"1027\", " + 
				"                              \"count\":1, " + 
				"                              \"lowAvailabilityThreshold\":4, " + 
				"                              \"maxAllowedCount\":1, " + 
				"                              \"name\":\"Reserved Coach Seat\", " + 
				"                              \"position\":\"U\", " + 
				"                              \"rbd\":\"YA\", " + 
				"                              \"rbdType\":\"Coach\", " + 
				"                              \"fareFamilyName\":\"Value Reserved Coach\", " + 
				"                              \"fareFamilyDescription\":\"Refundability options. Cancel fee may apply.\" " + 
				"                           }, " + 
				"                           \"passengers\":[   " + 
				"                              {   " + 
				"                                 \"id\":\"P1\", " + 
				"                                 \"initialType\":\"F\", " + 
				"                                 \"isDiscounted\":false, " + 
				"                                 \"isModified\":false, " + 
				"                                 \"passengerFare\":{   " + 
				"                                    \"dollarsAmount\":{   " + 
				"                                       \"accommodation\":\"0.00\", " + 
				"                                       \"rail\":\"219.00\", " + 
				"                                       \"total\":\"219.00\" " + 
				"                                    }, " + 
				"                                    \"pricingUnit\":\"DOLLARS\" " + 
				"                                 }, " + 
				"                                 \"type\":\"F\" " + 
				"                              } " + 
				"                           ], " + 
				"                           \"travelLegFare\":{   " + 
				"                              \"dollarsAmount\":{   " + 
				"                                 \"accommodation\":\"0.00\", " + 
				"                                 \"rail\":\"219.00\", " + 
				"                                 \"total\":\"219.00\" " + 
				"                              }, " + 
				"                              \"farePlan\":\"AOAT\", " + 
				"                              \"pricingUnit\":\"DOLLARS\" " + 
				"                           }, " + 
				"                           \"travelLegId\":\"AFA2094D0-43DD-11E9-81C3-010630C72965\", " + 
				"                           \"vehicles\":[   " + 
				" " + 
				"                           ] " + 
				"                        } " + 
				"                     ], " + 
				"                     \"accommodationFare\":{   " + 
				"                        \"pricingUnit\":\"DOLLARS\", " + 
				"                        \"dollarsAmount\":{   " + 
				"                           \"rail\":\"219.00\", " + 
				"                           \"accommodation\":\"0.00\", " + 
				"                           \"total\":\"219.00\" " + 
				"                        } " + 
				"                     }, " + 
				"                     \"category\":\"RG\", " + 
				"                     \"fareFamily\":\"VAL\", " + 
				"                     \"isMixedClass\":false, " + 
				"                     \"isThroughfare\":false, " + 
				"                     \"travelClass\":\"Coach\" " + 
				"                  } " + 
				"               ], " + 
				"               \"destination\":{   " + 
				"                  \"code\":\"LOR\", " + 
				"                  \"name\":\"Lorton (Auto Train), Virginia\", " + 
				"                  \"schedule\":{   " + 
				"                     \"arrivalDateTime\":\"2019-07-28T08:59:00\" " + 
				"                  } " + 
				"               }, " + 
				"               \"origin\":{   " + 
				"                  \"code\":\"SFA\", " + 
				"                  \"name\":\"Sanford (Auto Train), Florida\", " + 
				"                  \"schedule\":{   " + 
				"                     \"departureDateTime\":\"2019-07-27T16:00:00\" " + 
				"                  } " + 
				"               }, " + 
				"               \"elapsedTime\":\"P0DT16H59M\", " + 
				"               \"id\":\"AFA209426-43DD-11E9-81C3-010630C72965\", " + 
				"               \"isAncillaryAvailable\":false, " + 
				"               \"isBorderCross\":false, " + 
				"               \"isCancelled\":false, " + 
				"               \"isRTDiscountAvailable\":false, " + 
				"               \"isRestricted\":false, " + 
				"               \"isSegPriceAvailable\":false, " + 
				"               \"travelLegs\":[   " + 
				"                  {   " + 
				"                     \"destination\":{   " + 
				"                        \"code\":\"LOR\", " + 
				"                        \"name\":\"Lorton (Auto Train), Virginia\", " + 
				"                        \"schedule\":{   " + 
				"                           \"arrivalDateTime\":\"2019-07-28T08:59:00\" " + 
				"                        } " + 
				"                     }, " + 
				"                     \"elapsedTime\":\"P0DT16H59M\", " + 
				"                     \"id\":\"AFA2094D0-43DD-11E9-81C3-010630C72965\", " + 
				"                     \"isAncillaryAvailable\":false, " + 
				"                     \"isBorderCross\":false, " + 
				"                     \"isCancelled\":false, " + 
				"                     \"isRestricted\":false, " + 
				"                     \"isSelfTransfer\":false, " + 
				"                     \"numberOfStops\":0, " + 
				"                     \"origin\":{   " + 
				"                        \"code\":\"SFA\", " + 
				"                        \"name\":\"Sanford (Auto Train), Florida\", " + 
				"                        \"schedule\":{   " + 
				"                           \"departureDateTime\":\"2019-07-27T16:00:00\" " + 
				"                        } " + 
				"                     }, " + 
				"                     \"travelService\":{   " + 
				"                        \"amenities\":[   " + 
				"                           {   " + 
				"                              \"code\":\"L\", " + 
				"                              \"name\":\"Lounge\" " + 
				"                           }, " + 
				"                           {   " + 
				"                              \"code\":\"D\", " + 
				"                              \"name\":\"Dining car\" " + 
				"                           }, " + 
				"                           {   " + 
				"                              \"code\":\"N\", " + 
				"                              \"name\":\"WiFi\" " + 
				"                           }, " + 
				"                           {   " + 
				"                              \"code\":\"R\", " + 
				"                              \"name\":\"Onboard Wheelchair Ramp\" " + 
				"                           } " + 
				"                        ], " + 
				"                        \"carrier\":\"AMTRAK\", " + 
				"                        \"isAcela\":false, " + 
				"                        \"name\":\"Auto Train\", " + 
				"                        \"number\":\"52\", " + 
				"                        \"type\":\"Train\" " + 
				"                     }, " + 
				"                     \"isOvernight\":true, " + 
				"                     \"isThruway\":false, " + 
				"                     \"typeIcon\":\"assets/icon/train-white.svg\", " + 
				"                     \"typeIconAlt\":\"train\", " + 
				"                     \"segmentNum\":1 " + 
				"                  } " + 
				"               ], " + 
				"               \"logicalId\":\"52_SFA-1S\" " + 
				"            } " + 
				"         } " + 
				"      ] " + 
				"   } " + 
				"}";
		
		
		return b;
	}


public static String getPostDataTravelersInfo()
{

	String b ="{   " + 
			"   \"customerId\":\"ANONYMOUS\", " + 
			"   \"consumers\":[   " + 
			"      {   " + 
			"         \"passengerId\":\"P1\", " + 
			"         \"profile\":{   " + 
			"            \"discounted\":false, " + 
			"            \"lastName\":\"Abc\", " + 
			"            \"firstName\":\"abc\", " + 
			"            \"preferences\":{   " + 
			"               \"emailAddress\":\"manuranjan.prasad@amtrak.com\", " + 
			"               \"phoneNumber\":{   " + 
			"                  \"areaCode\":\"202\", " + 
			"                  \"extension\":\"\", " + 
			"                  \"phoneNbr\":\"9064406\", " + 
			"                  \"type\":\"C\", " + 
			"                  \"text\":\"Mobile\", " + 
			"                  \"isInternational\":false " + 
			"               } " + 
			"            }, " + 
			"            \"agrNum\":null, " + 
			"            \"primaryContact\":true, " + 
			"            \"type\":\"F\", " + 
			"            \"contact\":{   " + 
			"               \"type\":\"P\" " + 
			"            } " + 
			"         } " + 
			"      } " + 
			"   ] " + 
			"}";
	
	
	return b;
}


public static String getPostOrderTeservation( String cartID)
{

	String b ="{ " + 
			"  \"cartId\": \""+cartID+"\", " + 
			"  \"tncVersion\": \"1.0.0\", " + 
			"  \"contactpref\" : { " + 
			"               \"contactType\": \"E\", " + 
			"              \"intervalBeforeDeparture\": \"00:30\" " + 
			"  } " + 
			"} ";
	
	
	return b;
}



public static String getPostDataCartIDPoints()
{

	String b ="{ " + 
			"   \"ancillaryProduct\": [], " + 
			"   \"journeyRequest\": [ " + 
			"      { " + 
			"         \"fare\": { " + 
			"            \"pricingUnit\": \"POINTS\" " + 
			"         }, " + 
			"         \"isPassRider\": false, " + 
			"         \"journeyLegRequests\": [ " + 
			"            { " + 
			"               \"destination\": { " + 
			"                  \"code\": \"SFA\", " + 
			"                  \"schedule\": { " + 
			"                     \"arrivalDateTime\": \"NA\" " + 
			"                  } " + 
			"               }, " + 
			"               \"origin\": { " + 
			"                  \"code\": \"LOR\", " + 
			"                  \"schedule\": { " + 
			"                     \"departureDateTime\": \"2019-06-24T00:00:00\" " + 
			"                  } " + 
			"               }, " + 
			"               \"passengers\": [ " + 
			"                  { " + 
			"                     \"id\": \"P1\", " + 
			"                     \"isDiscounted\": false, " + 
			"                     \"isModified\": false, " + 
			"                     \"type\": \"F\" " + 
			"                  } " + 
			"               ] " + 
			"            } " + 
			"         ], " + 
			"         \"type\": \"One-Way\" " + 
			"      } " + 
			"   ], " + 
			"   \"customerId\": \"7100417422\", " + 
			"   \"journeySolution\": { " + 
			"      \"id\": \"08c3b2de-3a22-48e3-be7d-87b705f9b6d6\", " + 
			"      \"action\": \"NN\", " + 
			"      \"journeyLegs\": [ " + 
			"         { " + 
			"            \"id\": \"journeyLeg-1\", " + 
			"            \"selectedJourneyLegOption\": { " + 
			"               \"selectedAccommodations\": [ " + 
			"                  { " + 
			"                     \"travelLegAccommodations\": [ " + 
			"                        { " + 
			"                           \"isUnaccompaniedChild\": false, " + 
			"                           \"selectedProduct\": { " + 
			"                              \"availableInventory\": 4, " + 
			"                              \"capacity\": 1, " + 
			"                              \"code\": \"1027\", " + 
			"                              \"count\": 1, " + 
			"                              \"lowAvailabilityThreshold\": 4, " + 
			"                              \"maxAllowedCount\": 1, " + 
			"                              \"name\": \"Reserved Coach Seat\", " + 
			"                              \"position\": \"U\", " + 
			"                              \"rbd\": \"YG\", " + 
			"                              \"rbdType\": \"Coach\", " + 
			"                              \"fareFamilyName\": \"Value Reserved Coach\", " + 
			"                              \"fareFamilyDescription\": \"Refundability options. Cancel fee may apply.\" " + 
			"                           }, " + 
			"                           \"passengers\": [ " + 
			"                              { " + 
			"                                 \"id\": \"P1\", " + 
			"                                 \"initialType\": \"F\", " + 
			"                                 \"isDiscounted\": false, " + 
			"                                 \"isModified\": false, " + 
			"                                 \"passengerFare\": { " + 
			"                                    \"pointsAmount\": { " + 
			"                                       \"isDisqualified\": false, " + 
			"                                       \"value\": 3864 " + 
			"                                    }, " + 
			"                                    \"pricingUnit\": \"POINTS\", " + 
			"                                    \"promotion\": { " + 
			"                                       \"code\": \"A975\", " + 
			"                                       \"isApplied\": true, " + 
			"                                       \"type\": \"P\" " + 
			"                                    } " + 
			"                                 }, " + 
			"                                 \"type\": \"F\" " + 
			"                              } " + 
			"                           ], " + 
			"                           \"travelLegFare\": { " + 
			"                              \"farePlan\": \"GOAT\", " + 
			"                              \"pointsAmount\": { " + 
			"                                 \"isDisqualified\": false, " + 
			"                                 \"value\": 3864 " + 
			"                              }, " + 
			"                              \"pricingUnit\": \"POINTS\", " + 
			"                              \"promotion\": { " + 
			"                                 \"code\": \"A975\", " + 
			"                                 \"isApplied\": true, " + 
			"                                 \"type\": \"P\" " + 
			"                              } " + 
			"                           }, " + 
			"                           \"travelLegId\": \"A84C3ED16-7BB6-11E9-81C3-010630C72965\", " + 
			"                           \"hasLowerLevel\": true, " + 
			"                           \"vehicles\": [] " + 
			"                        } " + 
			"                     ], " + 
			"                     \"accommodationFare\": { " + 
			"                        \"pricingUnit\": \"POINTS\", " + 
			"                        \"promotion\": { " + 
			"                           \"code\": \"A975\", " + 
			"                           \"isApplied\": true, " + 
			"                           \"type\": \"P\" " + 
			"                        }, " + 
			"                        \"pointsAmount\": { " + 
			"                           \"value\": \"3864\" " + 
			"                        } " + 
			"                     }, " + 
			"                     \"category\": \"RG\", " + 
			"                     \"fareFamily\": \"VAL\", " + 
			"                     \"isMixedClass\": false, " + 
			"                     \"isThroughfare\": false, " + 
			"                     \"travelClass\": \"Coach\" " + 
			"                  } " + 
			"               ], " + 
			"               \"destination\": { " + 
			"                  \"code\": \"SFA\", " + 
			"                  \"name\": \"Sanford (Auto Train), Florida\", " + 
			"                  \"schedule\": { " + 
			"                     \"arrivalDateTime\": \"2019-06-25T08:58:00\" " + 
			"                  } " + 
			"               }, " + 
			"               \"origin\": { " + 
			"                  \"code\": \"LOR\", " + 
			"                  \"name\": \"Lorton (Auto Train), Virginia\", " + 
			"                  \"schedule\": { " + 
			"                     \"departureDateTime\": \"2019-06-24T16:00:00\" " + 
			"                  } " + 
			"               }, " + 
			"               \"elapsedTime\": \"P0DT16H58M\", " + 
			"               \"id\": \"A84C3ECDA-7BB6-11E9-81C3-010630C72965\", " + 
			"               \"isAncillaryAvailable\": false, " + 
			"               \"isBorderCross\": false, " + 
			"               \"isCancelled\": false, " + 
			"               \"isRTDiscountAvailable\": false, " + 
			"               \"isRestricted\": false, " + 
			"               \"isSegPriceAvailable\": false, " + 
			"               \"travelLegs\": [ " + 
			"                  { " + 
			"                     \"destination\": { " + 
			"                        \"code\": \"SFA\", " + 
			"                        \"name\": \"Sanford (Auto Train), Florida\", " + 
			"                        \"schedule\": { " + 
			"                           \"arrivalDateTime\": \"2019-06-25T08:58:00\" " + 
			"                        } " + 
			"                     }, " + 
			"                     \"elapsedTime\": \"P0DT16H58M\", " + 
			"                     \"id\": \"A84C3ED16-7BB6-11E9-81C3-010630C72965\", " + 
			"                     \"isAncillaryAvailable\": false, " + 
			"                     \"isBorderCross\": false, " + 
			"                     \"isCancelled\": false, " + 
			"                     \"isRestricted\": false, " + 
			"                     \"isSelfTransfer\": false, " + 
			"                     \"numberOfStops\": 0, " + 
			"                     \"origin\": { " + 
			"                        \"code\": \"LOR\", " + 
			"                        \"name\": \"Lorton (Auto Train), Virginia\", " + 
			"                        \"schedule\": { " + 
			"                           \"departureDateTime\": \"2019-06-24T16:00:00\" " + 
			"                        } " + 
			"                     }, " + 
			"                     \"travelService\": { " + 
			"                        \"amenities\": [ " + 
			"                           { " + 
			"                              \"code\": \"L\", " + 
			"                              \"name\": \"Lounge\" " + 
			"                           }, " + 
			"                           { " + 
			"                              \"code\": \"D\", " + 
			"                              \"name\": \"Dining car\" " + 
			"                           }, " + 
			"                           { " + 
			"                              \"code\": \"N\", " + 
			"                              \"name\": \"WiFi\" " + 
			"                           }, " + 
			"                           { " + 
			"                              \"code\": \"R\", " + 
			"                              \"name\": \"Onboard Wheelchair Ramp\" " + 
			"                           } " + 
			"                        ], " + 
			"                        \"carrier\": \"AMTRAK\", " + 
			"                        \"isAcela\": false, " + 
			"                        \"name\": \"Auto Train\", " + 
			"                        \"number\": \"53\", " + 
			"                        \"type\": \"Train\" " + 
			"                     }, " + 
			"                     \"isOvernight\": true, " + 
			"                     \"isThruway\": false, " + 
			"                     \"typeIcon\": \"assets/icon/train-white.svg\", " + 
			"                     \"typeIconAlt\": \"train\", " + 
			"                     \"segmentNum\": 1 " + 
			"                  } " + 
			"               ], " + 
			"               \"logicalId\": \"53_LOR-1S\" " + 
			"            } " + 
			"         } " + 
			"      ] " + 
			"   } " + 
			"}";
	
	
	return b;
}

}




