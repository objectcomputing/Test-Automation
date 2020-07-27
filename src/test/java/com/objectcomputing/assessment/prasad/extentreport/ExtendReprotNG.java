package com.objectcomputing.assessment.prasad.extentreport;

//import java.sql.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Date;

public class ExtendReprotNG {
    ExtentReports extent;

    public static ExtentReports getReportObject() {
        Date d = new Date();

        //Date d = new Date(0);
        String fileName = "Extent_" + d.toString().replace(":", "_") + ".html";
        //String path = System.getProperty("user.dir") + "./reports/prasad.html";
        String path = "./reports/" + fileName;


        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Survey App Automation Report");
        reporter.config().setDocumentTitle("Automation Test Result");
        reporter.config().setTheme(Theme.DARK);

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Prasasd Malamel");
        return extent;
    }

}
