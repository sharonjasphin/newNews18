package com.news18.api.init;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class RestAssuredUtils {
	
	public List<String> getJsonPath(JsonPath jsonPathEvaluator, String jsonPathExpr) {
		List Url=jsonPathEvaluator.get(jsonPathExpr);
		return Url;
		
	}


}
