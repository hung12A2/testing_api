package com;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.constant.Constant;
import core.constant.Constant.Request.RequestApiGetListAuctions;
import core.model.response.getlistauctions.AuctionsResponseModel;
import core.model.responseunittest.ResponseUnitTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import java.util.ArrayList;

public class GetListAuctionsRestAssured extends BaseRestAssuredClass {
    private static String[] listUnitTest = Constant.API_GET_LIST_AUCTIONS;

    @Test
    public static ResponseUnitTest UnitTest000() {
        Map <String, String> params = RequestApiGetListAuctions.UnitTest000.params;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            Response res = given()
                            .contentType(ContentType.JSON)
                            .params(params)
                            .when()
                            .get(RequestApiGetListAuctions.apiPath + "/" +
                            RequestApiGetListAuctions.UnitTest000.typeId);

            rut.setInput(params.toString());
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString());

            AuctionsResponseModel resObj = mapper.readValue(res.asString(), AuctionsResponseModel.class);

            assertNotNull(resObj.getData());
            assertFalse("code != 1000", resObj.getCode() != 1000);
            assertFalse("message != OK ", !resObj.getMessage().equals("OK"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rut;
    }

    public static ResponseUnitTest UnitTest001() {
        Map <String, String> params = RequestApiGetListAuctions.UnitTest001.params;
        ResponseUnitTest rut = new ResponseUnitTest();
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
                            .contentType(ContentType.JSON)
                            .params(params)
                            .when()
                            .get(RequestApiGetListAuctions.apiPath + "/" +
                            RequestApiGetListAuctions.UnitTest001.typeId);

            rut.setInput(params.toString());
            rut.setName(listUnitTest[1]);
            rut.setOutput(res.asPrettyString());

            AuctionsResponseModel resObj = mapper.readValue(res.asString(), AuctionsResponseModel.class);

            assertNotNull(resObj.getData());
            assertFalse("code != 1000", resObj.getCode() != 1000);
            assertFalse("message != OK ", !resObj.getMessage().equals("OK"));

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
