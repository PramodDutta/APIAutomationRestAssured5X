package com.thetestingacademy.testng.ddt;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class vwoTest {

    RequestSpecification r2;
    ValidatableResponse vR2;
    Integer ID;
    Response res2;

    @Test()
    public void test_login(String email,String pass){
        System.out.println("--Login to App.vwo--");
        VWOLoginPojo vwoLoginPojo = new VWOLoginPojo();
        vwoLoginPojo.setUsername(email);
        vwoLoginPojo.setPassword(pass);
        vwoLoginPojo.setRecaptchaResponseField("");
        vwoLoginPojo.setRemember(false);

        r2= RestAssured.given();
        r2.baseUri("https://app.vwo.com");
        r2.basePath("/login");
        r2.contentType(ContentType.JSON);
        r2.body(vwoLoginPojo).log().all();
        res2=r2.when().post();
        vR2=res2.then();
        String resString= res2.asString();
        System.out.println(resString);
        vR2.body("id", Matchers.notNullValue());
        vR2.statusCode(200);
        ID=res2.then().log().all().extract().path("id");
        System.out.println(ID);
    }

}