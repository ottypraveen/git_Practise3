package Academy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject5;
import resources.BaseToAll;

public class testCase5 extends BaseToAll{
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	@Test
	
	public void getTestCase5() throws IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		pageObject5 po5=new pageObject5(driver);
		Actions a=new Actions(driver);
		String keyboardaction=Keys.chord(Keys.CONTROL,Keys.ENTER);
		a.moveToElement(po5.getOpenTabButton()).click().build().perform();
		
		
		
		
		
		
	}
	
	@AfterTest
	public void getTeardown()
	{
		driver.quit();
	}
	

}
