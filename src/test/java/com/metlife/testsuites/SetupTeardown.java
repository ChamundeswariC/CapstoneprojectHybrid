package com.metlife.testsuites;



import java.io.File;
import com.metlife.utilities.WebdriverUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class SetupTeardown {
    static ExtentReports extent;
    static ExtentTest test;

    @BeforeClass
    public void setup() {

        WebdriverUtility.initialize();
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        WebdriverUtility.quit();

    }


    @BeforeMethod
    public  void initialisingbroswer() throws InterruptedException {
        WebdriverUtility.navigate("https://d5g00000kmznieax-dev-ed.develop.lightning.force.com/");
        Thread.sleep(1000);
    }


    @BeforeTest
    public static void setConfiguration()
    {
        extent=new ExtentReports("src/test/Report/SampleReport.html",true);
        extent.addSystemInfo("Environment","QA");
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
    }
    @AfterMethod
    public static void getReport(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            test.log(LogStatus.FAIL,result.getThrowable()+"Test Failed");
        }
        else if(result.getStatus()==ITestResult.SKIP)
        {
            test.log(LogStatus.SKIP,result.getThrowable()+"Test Skipped");
        }
        else if(result.getStatus()==ITestResult.SUCCESS)
        {
            test.log(LogStatus.PASS,result.getThrowable()+"Test Passed");
        }
        extent.endTest(test);
    }
    @AfterTest
    public static void cleanUp()
    {
        extent.flush();
    }
    }


