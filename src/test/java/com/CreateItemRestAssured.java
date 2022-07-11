package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import core.model.request.createitem.CreateItemRequestModel;
import core.model.response.createitem.CreateItemResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import core.constant.Constant;
import core.constant.Constant.Request.RequestApiCreateItem;


public class CreateItemRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_CREATE_ITEM;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest000.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
      
	        //assertFalse("code != 1000", resObj.getCode() != 1000);
			//assertFalse("mess != OK", !resObj.getMessage().equals("OK"));
	        //assertNotNull(resObj.getData());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	
	@Test
    public static ResponseUnitTest UnitTest001() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest001.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest001.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
			//assertFalse("code != 1007", resObj.getCode() != 1007);
			

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	@Test
	public static ResponseUnitTest UnitTest002() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest002.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest002.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[2]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
			//assertFalse("code != 1001", resObj.getCode() != 1001);
			

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	public static ResponseUnitTest UnitTest003() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest003.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given()
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest003.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[3]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
			//assertFalse("code != 1004", resObj.getCode() != 1004);
			

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	@Test
	public static ResponseUnitTest UnitTest004() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest004.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest004.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[4]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
			//assertFalse("code != 1001", resObj.getCode() != 1001);
			

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	@Test
	public static ResponseUnitTest UnitTest005() {
    	
		CreateItemRequestModel requestBody = RequestApiCreateItem.UnitTest005.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateItem.apiPath + "/" + RequestApiCreateItem.UnitTest005.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[5]);
	        rut.setOutput(res.asPrettyString());
			
			CreateItemResponseModel resObj = mapper.readValue(res.asString(), CreateItemResponseModel.class);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	
	public static ResponseUnitTest runUnitTest(int unitTestId) {
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	switch (unitTestId) {
    		case (0):
    			rut = UnitTest000();
    			break;
    		case (1):
    			rut = UnitTest001();
    			break;
			case (2):
				rut = UnitTest002();
				break;
			case (3):
				rut = UnitTest003();
				break;
			case (4):
				rut = UnitTest004();
				break;
			case (5):
				rut = UnitTest005();
				break;
    		default: 
    			break;
    	}
    	return rut;
    	
    	
    }
    public static List<ResponseUnitTest> run(int checkUnit, int unitTestId) {
    	
    	init();
    	List<ResponseUnitTest> listRut = new ArrayList<ResponseUnitTest>();
    	if (checkUnit == 0) {
    		for (int i = 0; i < listUnitTest.length; i++) {
    			ResponseUnitTest rut = runUnitTest(i);
    			listRut.add(rut);
    		}
    	}
    	else {
    		ResponseUnitTest rut = runUnitTest(unitTestId);
    		listRut.add(rut);
    	}
    	return listRut;
    }
 

}