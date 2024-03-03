package com.thetestingacademy.misc.gson;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Demo {

    // Payload
    // String -> Not
    // Hashmap -> Not
    // Class - Which class?

    // POJO
    // ?
    // 1 - diffcult
    // 2. easy!

    //{
    //            "firstname" : "Jim",
    //                "lastname" : "Brown",
    //                "totalprice" : 111,
    //                "depositpaid" : true,
    //                "bookingdates" : {
    //            "checkin" : "2018-01-01",
    //                    "checkout" : "2019-01-01"
    //        },
    //            "additionalneeds" : "Breakfast"
    //        }

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void testPost() {

        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);




//        requestSpecification = RestAssured.given();
//        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//        requestSpecification.basePath("booking");
//        requestSpecification.contentType(ContentType.JSON);
//        requestSpecification.body(payload).log().all();
//
//        Response response = requestSpecification.when().post();
//
//        Integer bookingId = response.then().extract().path("bookingid");
//
//        // Get Validatable response to perform validation
//        validatableResponse = response.then().log().all();
//        validatableResponse.statusCode(200);
//        System.out.println("Your Booking Id is -> " + bookingId);


    }


    //


}
