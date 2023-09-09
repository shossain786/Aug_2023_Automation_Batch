package org.itest.reporter;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
    private ExtentManager() {

    }

    private static ExtentManager instance  = new ExtentManager();

    public static ExtentManager getInstance() {
        return instance;
    }


    //factory design pattern --> define separate factory methods for creating objects and create objects by calling that methods
    ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

    public ExtentTest getExtent() {
        return extent.get();
    }

    public void setExtent(ExtentTest extentTestObject) {
        extent.set(extentTestObject);
    }

    public void removeExtentObject() {
        extent.remove();
    }
}
