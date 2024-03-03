package com.thetestingacademy.testng.listenerDemo;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TC001 {


    @Test(groups = "sanity")
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(false);
    }

    @Test(groups = "sanity")
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(true);

    }


    @AfterSuite
    public void emailToQALead(){
        // Send the email
    }

}
