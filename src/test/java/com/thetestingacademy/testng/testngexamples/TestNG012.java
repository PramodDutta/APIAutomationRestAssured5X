package com.thetestingacademy.testng.testngexamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG012 {

    @Parameters("browser")
    @Test(priority = 1)
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }
}
