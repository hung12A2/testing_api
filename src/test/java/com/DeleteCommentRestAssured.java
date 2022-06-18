package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import core.model.response.deletecomment.DeleteCommentResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
import core.constant.Constant.Request.RequestApiDeleteComment;


public class DeleteCommentRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_DELETE_COMMENT;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
		try {
			
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiDeleteComment.apiPath + "/" + RequestApiDeleteComment.UnitTest000.commentId);

			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			DeleteCommentResponseModel resObj = mapper.readValue(res.asString(), DeleteCommentResponseModel.class);
      
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
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
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
		try {
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiDeleteComment.apiPath + "/" + RequestApiDeleteComment.UnitTest001.commentId);

			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
			
			DeleteCommentResponseModel resObj = mapper.readValue(res.asString(), DeleteCommentResponseModel.class);
      
	        assert resObj.getCode() == 1006;
	        //assertNotNull(resObj.getData());

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