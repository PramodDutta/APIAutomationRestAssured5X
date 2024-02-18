package com.thetestingacademy.tests.crud.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOST {


    @Test
    public void testBDDStylePOSTPositive() {
        // POST Request
        // URL
        // BODY - PAYLOAD - JSON
        // HEADER - Content Type

        String payload = "{\n" +
                "        \"username\": \"admin\",\n" +
                "        \"password\": \"password123\"\n" +
                "}";

        // Hashmap, Class - Automation ?- Class - 60-70%


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload).when().post().then().log().all().statusCode(200);


    }

}
