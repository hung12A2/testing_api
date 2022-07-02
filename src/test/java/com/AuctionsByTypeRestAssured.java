package com;

import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.constant.Constant;
import core.constant.Constant.Request.RequestApiGetAuctionsByType;
import core.model.response.auctionsbytype.AuctionsByTypeModel;
import core.model.responseunittest.ResponseUnitTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.ArrayList;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
public class AuctionsByTypeRestAssured extends BaseRestAssuredClass {
    private static String[] listUnitTest = Constant.API_GET_AUCTIONS_BY_TYPE;

    @Test
    public static ResponseUnitTest UnitTest000(){
        Map <String,String> params = RequestApiGetAuctionsByType.UnitTest000.params;
        ObjectMapper mapper = new ObjectMapper();
        ResponseUnitTest rut = new ResponseUnitTest();

        try {
            Response res = given()
                        .contentType(ContentType.JSON)
                        .params(params)
                        .when()
                        .get(RequestApiGetAuctionsByType.apiPath + "/" +
                        RequestApiGetAuctionsByType.UnitTest000.typeId + "/"
                        + RequestApiGetAuctionsByType.UnitTest000.status);

            rut.setInput(params.toString());
            rut.setName(listUnitTest[0]);
            rut.setOutput(res.asPrettyString());

            AuctionsByTypeModel resObj = mapper.readValue(res.asString(), AuctionsByTypeModel.class);

            assertNotNull(resObj);
            assertFalse( "Code != 1000", resObj.getCode() != 1000);
            assertFalse( "Message != OK", !resObj.getMessage().equals("OK"));
            
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
