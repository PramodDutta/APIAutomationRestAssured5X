package com.thetestingacademy.misc.gson;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.thetestingacademy.misc.gson.example.BookingRespons;
import com.thetestingacademy.misc.gson.example.Employee;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class POSTReqTC {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;

    @Test
    public void testPositive(){
        // Step1 - POST
        // URL -> Base URI + base Path
        // HEADER
        // BODY
        // Auth - NO


        // Step 2
        // prepare the Payload ( Object -> JSON String)
        // send the request

        //Step 3
        // Validate Response ( JSON String -> Object)
        // FirstName,
        // Status Code
        // Time Response


        // Prepare your Payload
        Faker faker = new Faker();
        Booking booking = new Booking();
        String expectFirstName = faker.name().firstName();


        booking.setFirstname(expectFirstName);
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        // Object -> JSON String (GSON)
        Gson gson = new Gson();
        String jsonStringBooking =  gson.toJson(booking);
        System.out.println(jsonStringBooking);





        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonStringBooking).log().all();

        Response response = requestSpecification.when().post();
        String jsonResponseString  = response.asString();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


        // Validate Response ( JSON String -> Object)
        BookingRespons bookingResponseObject = gson.fromJson(jsonResponseString,BookingRespons.class);

        assertThat(bookingResponseObject.getBookingid()).isNotNull();
        assertThat(bookingResponseObject.getBooking().getFirstname()).isEqualTo(expectFirstName);




        // Request Payload - Response - - 3 Class
        // 1. Booking -> Bookingdates
            // 2 Response - BookingResponse  - Booking









    }




}
