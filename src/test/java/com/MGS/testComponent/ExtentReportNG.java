package com.MGS.testComponent;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {

	public static ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir")+"//reports//ExtentTestReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");

		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("UserName", "Milind");
		extent.setSystemInfo("OS ", "Linux");
		extent.setSystemInfo("OS Version", "Ubuntu 21.0.18");
		extent.setSystemInfo("Java Version", " 11.0.13");
		extent.setSystemInfo("TimeZome", "Asia/Calcuta");
		extent.setSystemInfo("Author", "Milind");
		return extent;

	}
}