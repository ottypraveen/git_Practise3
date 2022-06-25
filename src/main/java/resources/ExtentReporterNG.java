package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	
	public static ExtentReports getextentReportConfig()
	{
		report=new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReports/AutomationReport.html");
		report.config().setDocumentTitle("Automation Report");
		report.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Praveen");
		return extent;
		
	}
	
	

}
