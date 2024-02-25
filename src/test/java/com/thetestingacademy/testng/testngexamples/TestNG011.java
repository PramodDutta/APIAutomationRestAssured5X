package com.thetestingacademy.testng.testngexamples;

import org.testng.annotations.Test;

public class TestNG011 {

    @Test(groups = { "init" },priority = 1)
    public void getToken() {
        System.out.println("serverStartedOk");
    }

    @Test(groups = { "init" },priority = 2, enabled = false)
    public void getBookingID() {
        System.out.println("initEnvironment");
    }


    @Test(dependsOnGroups = { "init.*" })
    public void testPutReq() {
        System.out.println("Now I will run");
    }
}
