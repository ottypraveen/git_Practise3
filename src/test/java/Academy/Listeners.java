package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseToAll;
import resources.ExtentReporterNG;

public class Listeners extends BaseToAll implements ITestListener  {
	ExtentReports extent=ExtentReporterNG.getextentReportConfig();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 test=extent.createTest(result.getMethod().getMethodName());
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.log(Status.PASS, "TestCase is Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		test.fail(result.getThrowable());
		
		WebDriver driver=null;
		String TestMethodName=result.getMethod().getMethodName();
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			
		}
		try 
		{
			getScreenshot(TestMethodName,driver);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}


}
