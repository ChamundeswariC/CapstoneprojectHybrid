package com.metlife.testsuites;

import com.google.j2objc.annotations.AutoreleasePool;
import com.metlife.data.Exceldatafile;
import com.metlife.pageobjects.Appointmentpage;
import com.metlife.pageobjects.Homepage;
import com.metlife.pageobjects.Loginpage;
import com.metlife.utilities.WebdriverUtility;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;


import static com.metlife.utilities.ExcelUtils.StaticIndexesCellValue;


public class testsuite1 extends SetupTeardown {


    @Test(priority = -2, dataProviderClass = Exceldatafile.class, dataProvider = "ExcelData")
    public static void invalidLogin(String User_Excel, String Pass_Excel) throws InterruptedException {
        WebdriverUtility.type(Loginpage.username, User_Excel);
        WebdriverUtility.type(Loginpage.pwd, Pass_Excel);
        WebdriverUtility.click(Loginpage.login_btn);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");



    }

    @Test(priority = -1)
    public void validLogin() throws InterruptedException, IOException, InvalidFormatException {
        WebdriverUtility.type(Loginpage.username, StaticIndexesCellValue(1, 0));
        WebdriverUtility.type(Loginpage.pwd, StaticIndexesCellValue(1, 1));
        WebdriverUtility.click(Loginpage.login_btn);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");


    }

    @Test(priority = 1)
    public void lighting() {
        try {
            WebdriverUtility.click(Loginpage.lightning);
            System.out.println("switching to Lightning experience!");
        } catch (Exception e) {
            System.out.println("Lightning experience is directly launching!");
        }
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 0)
    public void dashBoardOpen() throws Exception {
        Thread.sleep(3000);
        WebdriverUtility.click(Homepage.appopen);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");




    }


    @Test(priority = 2)
    public void itemsSearching() throws InterruptedException {
        WebdriverUtility.type(Homepage.search, "Salesforce Scheduler");
        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");

    }

    @Test(priority = 3)
    public void searchFunctionality() throws InterruptedException {
        WebdriverUtility.click(Homepage.textarea);
        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 4)
    public void ActionClass() throws InterruptedException {
        WebdriverUtility.click(Homepage.schedulelink);
        Thread.sleep(3000);
        WebdriverUtility.ScrollintoView(Homepage.schedulelink);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");

    }

    @Test(priority = 5)
    public void workTypeGroup() throws InterruptedException {


        WebdriverUtility.click(Appointmentpage.Parent);

        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");


    }

    @Test(priority = 6)
    public void parentType() throws InterruptedException {
        WebdriverUtility.type(Appointmentpage.Parent, "Ajay");
        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 7)
    public static void navigatingtoopen() throws InterruptedException {
        WebdriverUtility.click(Appointmentpage.Accounttype);
        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 8)
    public void salesforceboard() throws InterruptedException {
        WebdriverUtility.click(Appointmentpage.Next);
        Thread.sleep(3000);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 9)
    public void patientsrerecord() throws InterruptedException {
        WebdriverUtility.click(Appointmentpage.Selectworktype);
        Thread.sleep(3000);
        WebdriverUtility.click(Appointmentpage.Next1);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 10)
    public void typeofworkkkload() throws InterruptedException {
        WebdriverUtility.clickjs(Appointmentpage.Appointmenttype);
        Thread.sleep(3000);
        WebdriverUtility.click(Appointmentpage.Next2);
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }

    @Test(priority = 11)
    public void typeoftypeofc() throws InterruptedException {
        WebdriverUtility.click(Appointmentpage.Next3);
        Thread.sleep(3000);
        System.out.println(WebdriverUtility.getText(Appointmentpage.errormsg));
        test = extent.startTest("Salesforce Scheduler ", "Testcases passed");
        test.log(LogStatus.PASS, "Salesforce Scheduler", "Testcases failed");
    }


}











