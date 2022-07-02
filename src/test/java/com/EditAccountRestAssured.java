package com;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.constant.Constant;
import core.constant.Constant.Request.RequestApiEditAccount;
import core.model.request.editacc.editAccRequestModel;
import core.model.response.editacc.editAccResponeModel;
import core.model.responseunittest.ResponseUnitTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class EditAccountRestAssured extends BaseRestAssuredClass{
    private static String [] listUnitTest = Constant.API_EDIT_ACCOUNT;

    // API chạy đúng
    @Test
    public static ResponseUnitTest UnitTest000(){
        editAccRequestModel requestBody = RequestApiEditAccount.UnitTest000.requestBody;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();

        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(requestBody);
            Response res = given()
                        .contentType(ContentType.JSON)
                        .when()
                        .body(jsonString)
                        .post(RequestApiEditAccount.apiPath);
            
            editAccResponeModel resObj = mapper.readValue(res.asString(), editAccResponeModel.class);

            rut.setInput(jsonString);
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString()); 

            assertNotNull(resObj.getData().getAddress());
            assertFalse("code != 1000", resObj.getCode() != 1000);
            assertFalse("message != OK", !resObj.getMessage().equals("OK"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return rut;
    }

    @Test
    public static ResponseUnitTest UnitTest001(){
        editAccRequestModel requestBody = RequestApiEditAccount.UnitTest001.requestBody;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();

        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(requestBody);
            Response res = given()
                        .contentType(ContentType.JSON)
                        .when()
                        .body(jsonString)
                        .post(RequestApiEditAccount.apiPath);
            
            editAccResponeModel resObj = mapper.readValue(res.asString(), editAccResponeModel.class);

            rut.setInput(jsonString);
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString()); 

            assertFalse("code != 1001", resObj.getCode() != 1001);
            assertFalse("message = OK", resObj.getMessage().equals("OK"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return rut;
    }

    @Test
    public static ResponseUnitTest UnitTest002(){
        editAccRequestModel requestBody = RequestApiEditAccount.UnitTest000.requestBody;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();

        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(requestBody);
            Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
                        .contentType(ContentType.JSON)
                        .when()
                        .body(jsonString)
                        .post(RequestApiEditAccount.apiPath);
            
            editAccResponeModel resObj = mapper.readValue(res.asString(), editAccResponeModel.class);

            rut.setInput(jsonString);
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString()); 

            assertFalse("code != 1001", resObj.getCode() != 1001);
            assertFalse("message = OK", resObj.getMessage().equals("OK"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return rut;
    }

    @Test
    public static ResponseUnitTest UnitTest003(){
        editAccRequestModel requestBody = RequestApiEditAccount.UnitTest000.requestBody;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();

        String jsonString;
        try {
            jsonString = mapper.writeValueAsString(requestBody);
            Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
                        .contentType(ContentType.JSON)
                        .when()
                        .body(jsonString)
                        .post(RequestApiEditAccount.apiPath);
            
            editAccResponeModel resObj = mapper.readValue(res.asString(), editAccResponeModel.class);

            rut.setInput(jsonString);
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString()); 

            assertFalse("code != 1001", resObj.getCode() != 1001);
            assertFalse("message = OK", resObj.getMessage().equals("OK"));
            
        } catch (Exception e) {
            e.printStackTrace();
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
