package org.itest.reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.itest.driverhandler.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentListeners implements ITestListener {

        static ExtentReports report;
        ExtentTest test;

        public void onTestStart(ITestResult result) {
            //before each test case
            test = report.createTest(result.getMethod().getMethodName());
            ExtentManager.getInstance().setExtent(test);
        }

        public void onTestSuccess(ITestResult result) {
            ExtentManager.getInstance().getExtent().log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ " is Passed.");
            ExtentManager.getInstance().removeExtentObject();
        }

        public void onTestFailure(ITestResult result) {
            ExtentManager.getInstance().getExtent().log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " is Failed.");
            ExtentManager.getInstance().getExtent().log(Status.FAIL, result.getThrowable());

            //add screenshot for failed test.
            File src = ((TakesScreenshot) new DriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
            Date date = new Date();
            String actualDate = format.format(date);

            String screenshotPath = System.getProperty("user.dir")+
                    "/Reports/Screenshots/"+actualDate+".jpeg";
            File dest = new File(screenshotPath);

            try {

                FileUtils.copyFile(src, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ExtentManager.getInstance().getExtent().addScreenCaptureFromPath(screenshotPath, "Test case failure screenshot");
            ExtentManager.getInstance().removeExtentObject();

        }

        public void onTestSkipped(ITestResult result) {
            ExtentManager.getInstance().getExtent().log(Status.SKIP, "Test Case: "+result.getMethod().getMethodName()+ " is skipped.");
            ExtentManager.getInstance().removeExtentObject();
        }

        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        }

        public void onTestFailedWithTimeout(ITestResult result) {
        }

        public void onStart(ITestContext context) {
            try {
                report = ExtentReportNG.setupExtentReport();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFinish(ITestContext context) {
            //close extent
            report.flush();
        }
}
