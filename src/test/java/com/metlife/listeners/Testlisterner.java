package com.metlife.listeners;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.metlife.Reports.ExtentReports;
import com.metlife.utilities.WebdriverUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Testlisterner extends WebdriverUtility implements ITestListener {
    private static com.aventstack.extentreports.ExtentReports extent;
    public com.aventstack.extentreports.ExtentTest eXtTest;

    static {
        try {
            extent = ExtentReports.ssreports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        //itestResult holds the information of Testcase result
        //Before each test case
        eXtTest = extent.createTest("TestCase: " + result.getName());
    }

    public void onStart(ITestResult result) throws IOException {
        //Setup Extent Report
        //extent=ExtentReports.ssreports();
    }

    @Override
    public void onFinish(ITestContext result) {
        //closing Extent

        try {
            eXtTest.log(Status.PASS,"After All Test cases runned successfully :"+result.getName(),
                    MediaEntityBuilder.createScreenCaptureFromBase64String(captureScreenshot()).build());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        extent.flush();

    }

    public void onTestFailure(ITestResult result) {

//        String path = captureScreenshot("scheduler_failedTC.jpg");
        System.out.println("Test failed:  " +
                "Captured Screenshot on test failure:  " + result.getName());
        eXtTest.log(Status.FAIL, "TestCase: " + result.getName() + " is Failed");
        try {
            eXtTest.fail("Test Failure Screenshot: ",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(captureScreenshot()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Case Passed:  " + result.getName());
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Test case Skipped:  "+result.getName());
    }

}
