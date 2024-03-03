package com.thetestingacademy.testng.ddt;

import org.testng.annotations.Test;

public class DDT01 {

    // Test Data - from the Excel File - Data Provider
    // Read the Excel File
    // Apache POI, - 60-70% - little difficult to understand first time.
    // Fillo Library - 30% - Super Easy!


    // Test case  login where we will inject the username and password

    // Excel -> There is not support direclty in Java to Read the Excel file
    // Apache POI library -
    // Excel - 2007 - xls, 2007 -> xlsx , CSV - comma seperated values
    //

    // username, password , ER , AR, name, age, phone, CSV
    // JSON file it will be different
    // JSON Object -> Gson, Jackson you can



    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void testLoginData(String username, String password, String ER , String AR, String name, String ge, String phone ) {
        System.out.println("UserName - " + username);
        System.out.println("Password - " + password);
        System.out.println("ER - " + ER);

        // Login to app API


        // Write the code the Login POST request
        //

    }


}
