package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getreports() {
		String path="C:\\Users\\santo\\eclipse-workspace\\Framework_Batch7\\Reports\\index.html";
		
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("Batch 7 Test Reports");
		reporter.config().setTheme(Theme.DARK);
		
        extent=new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("System", "Capital Market");
        extent.setSystemInfo("QA", "XYZ");
        extent.setSystemInfo("O.S", "Windows");
		return extent;
		
		
	}
	

}
