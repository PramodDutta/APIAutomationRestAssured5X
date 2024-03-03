package com.thetestingacademy.misc.gson.example;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeSer {

    @Test
    public void DeSerializationTest(){

        String jsonString = "{\r\n" + "  \"firstName\" : \"Pramod\",\r\n" + "  \"lastName\" : \"Dutta\",\r\n"
                + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 31,\r\n" + "  \"salary\" : 3422.33,\r\n"
                + "  \"married\" : false\r\n" + "}";

        Gson gson = new Gson();
        Employee employeeObject = gson.fromJson(jsonString,Employee.class);

        String firstName = employeeObject.getFirstName();
        String lastName = employeeObject.getLastName();

        Assert.assertEquals(firstName,"Pramod");







    }



}
