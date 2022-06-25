package Academy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject7;
import resources.BaseToAll;

public class testCase7 extends BaseToAll {
	public WebDriver driver;
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void getTestCase7() throws IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		pageObject7 po7=new pageObject7(driver);
		Actions a=new Actions(driver);
		a.clickAndHold(po7.getMouseHover()).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN,Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.click().build().perform();
		
		
	}
	
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}

}
