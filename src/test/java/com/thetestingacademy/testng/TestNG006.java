package com.thetestingacademy.testng;

import org.testng.annotations.Test;
//Package1 - Class1 - Test1, Test2 - Execute ?
//Package2 - Class2 - Test3, Test4 - Execute ?
public class TestNG006 {

    @Test(priority = 1)
    public void t1(){
        System.out.println("1");
    }

    @Test(priority = 0)
    public void t2(){
        System.out.println("3");
    }

    @Test(priority = 3)
    public void t3(){
        System.out.println("2");
    }
}
