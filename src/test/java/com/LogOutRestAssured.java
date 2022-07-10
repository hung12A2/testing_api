package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.model.responseunittest.ResponseUnitTest;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertFalse;

import core.constant.Constant;
import core.constant.Constant.Request.RequestApiLogOut;

import core.model.response.logout.LogOutResponseModel;


public class LogOutRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_LOG_OUT;
	
	//API LOG OUT CHAY DUNG KQ
	// CHAY API LOGIN DE LAY TOKEN ROI MOI LOG OUT
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
		ResponseUnitTest rut = new ResponseUnitTest();
		ObjectMapper mapper = new ObjectMapper();
    	
		try {
			
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiLogOut.apiPath);
			
			rut.setInput("ACCESS_TOKEN: " + Constant.ACCESS_TOKEN);
	        rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
	        LogOutResponseModel resObj = mapper.readValue(res.asString(), LogOutResponseModel.class);
	        
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage() == "OK";
			assertFalse("code != 1000", resObj.getCode() != 1000);
			assertFalse("Mess != OK", !resObj.getMessage().equals("OK"));
	        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	//API LOG OUT KHI KHONG CO ACCESS_TOKEN HOAC ACCESSTOKEN da logout
	// 1004 - chua dang nhap
	@Test
    public static ResponseUnitTest UnitTest001() {
    	
		ResponseUnitTest rut = new ResponseUnitTest();
		ObjectMapper mapper = new ObjectMapper();
    	
		try {
			
			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiLogOut.apiPath);
			
			rut.setInput("ACCESS_TOKEN: " + "khong co token");
	        rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
	        LogOutResponseModel resObj = mapper.readValue(res.asString(), LogOutResponseModel.class);
	        
	        assert resObj.getCode() == 1004;
			assertFalse("code != 1004", resObj.getCode() != 1004);
	        
	        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }

	@Test
    public static ResponseUnitTest UnitTest002() {
    	
		ResponseUnitTest rut = new ResponseUnitTest();
		ObjectMapper mapper = new ObjectMapper();
    	
		try {
			
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiLogOut.apiPath);
			
			rut.setInput("ACCESS_TOKEN: " + "token da logout roi");
	        rut.setName(listUnitTest[2]);
	        rut.setOutput(res.asPrettyString());
	        LogOutResponseModel resObj = mapper.readValue(res.asString(), LogOutResponseModel.class);
	        
	        assert resObj.getCode() == 1004;
			assertFalse("code != 1004", resObj.getCode() != 1004);
	        
	        
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