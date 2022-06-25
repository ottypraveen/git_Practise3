package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject1;
import resources.BaseToAll;

public class testCase1 extends BaseToAll {
	public WebDriver driver;
	
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void getTestCase1() throws IOException
	{
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@value='radio2']")));
		pageObject1 po1=new pageObject1(driver);
		po1.getRadioButton().click();
		
		
	}
	
	@Test
	public void getsum() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}
	

}
