package com.thetestingacademy.testng.listenerDemo;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomListener implements IExecutionListener, ISuiteListener {
    @Override
    public void onExecutionFinish() {

        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");

        // Send email to the QA lead
        // Write Java code to write the Email to QA lead
        //






    }

    @Override
    public void onExecutionStart() {
        // Excel File Read , JSON File, Allure Report Start, Reporting, Logs starting

        // Email to QA lead automation started!!



        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");

    }
}
