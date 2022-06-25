package Academy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject4;
import resources.BaseToAll;

public class testCase4 extends BaseToAll {
	public WebDriver driver;
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	public void getTestCase4() throws IOException, InterruptedException
	{

		Thread.sleep(2000);
		pageObject4 po4=new pageObject4(driver);
		po4.getOpenWindowButton().click();
		Thread.sleep(10000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		String parentID=iterator.next();
		String childId=iterator.next();
		driver.switchTo().window(childId);
		String text=po4.getFeaturedTest().getText().split(" ")[0];
		System.out.println(text);
		driver.switchTo().window(parentID);
		po4.getAlertTextBox().sendKeys(text);
		po4.getalertButton().click();
		driver.switchTo().alert().accept();
		
		
		
		
	}
	@AfterTest
	public void getTeardown()
	{
		driver.quit();
	}

}
