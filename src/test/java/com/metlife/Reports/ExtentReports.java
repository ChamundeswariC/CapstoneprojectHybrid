package com.metlife.Reports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.metlife.utilities.WebdriverUtility;

import java.io.IOException;
import java.util.Date;

public class ExtentReports extends WebdriverUtility {
    public static com.aventstack.extentreports.ExtentReports ssreports() throws IOException {
        Date currentDate = new Date();
        String S_file = currentDate.toString().replace(":", " ");
        String reportPath = "C:\\Users\\cchamundeswari\\capstone\\src\\reports" + "Scheduler.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        com.aventstack.extentreports.ExtentReports extent = new com.aventstack.extentreports.ExtentReports();
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setReportName("Salesforce Bolt Report");
        spark.config().setDocumentTitle("Scheduler Solutions Report");
        return extent;
    }
}