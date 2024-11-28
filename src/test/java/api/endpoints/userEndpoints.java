package api.endpoints;

import api.payload.user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class userEndpoints {
//POJO class//
	
	public static Response Createuser(user payload)
	 {
		Response response = given()
		     .accept(ContentType.JSON)
		     .contentType(ContentType.JSON)
		     .body(payload)
		 
		     .when()
		     .post(Routes.POSTURL);
		
		return response;
		  
	 }
	
	public static Response GETuser(String userName)
	 {
		Response response = given()
		     .accept(ContentType.JSON)
		     .pathParam("username",userName)
		    
		 
		     .when()
		     .get(Routes.GETURL);
		
		return response;
		  
	 }
	
	public static Response Putuser(user payload, String userName)
	 {
		Response response = given()
		     .accept(ContentType.JSON)
		     .contentType(ContentType.JSON)
		     .pathParam("username",userName)
		     .body(payload)
		 
		     .when()
		     .put(Routes.PUTURL);
		
		return response;
		  
	 }
	
	
	
	public static Response DELETEuser(String userName)
	 {
		Response response = given()
		     .accept(ContentType.JSON)
		     .pathParam("username",userName)
		     
		 
		     .when()
		     .delete(Routes.DELETEURL);
		
		return response;
		  
	 }
}
