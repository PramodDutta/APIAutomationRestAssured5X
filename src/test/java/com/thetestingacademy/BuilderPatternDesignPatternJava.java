package com.thetestingacademy;

public class BuilderPatternDesignPatternJava {

    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference

    public BuilderPatternDesignPatternJava Stag1()
    {
        System.out.println("Stag 1");
        return this;
    }

    public BuilderPatternDesignPatternJava Stag2(String str)
    {
        System.out.println("Stag 2 String is "+str);
        return this;
    }

    public BuilderPatternDesignPatternJava Stag3()
    {
        System.out.println("Stag 3");
        return this;
    }

    public static void main(String[] args) {

        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.Stag1().Stag2("test").Stag3();

    }



}


