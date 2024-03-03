package com.thetestingacademy.misc.gson.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;

public class SimpleSer {

    //    {
//            "firstName" : "Pramod",
//                "lastName" : "Dutta",
//                "gender" : "M",
//                "age" : 31,
//                "salary" : 500.00,
//                "married" : false
//        }

    @Test
    public void test1(){
         // Object -> JSON String - Ser ( Client -> Server ) Ser manner - 1
        Employee employeeObject = new Employee();
        employeeObject.setFirstName("Pramod");
        employeeObject.setLastName("Dutta");
        employeeObject.setAge(31);
        employeeObject.setSalary(500.00);
        employeeObject.setMarried(false);
        employeeObject.setGender("M");

        // Create a Gson object
        Gson gson = new Gson();
        String jsonEmployye =  gson.toJson(employeeObject);
        System.out.println(jsonEmployye);


        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String employeeJsonSringUsingJsonBuilder = gsonBuilder.toJson(employeeObject);
        System.out.println("Pretty JSON String :- ");
        System.out.println(employeeJsonSringUsingJsonBuilder);











    }



}
