package Academy;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject2;
import resources.BaseToAll;

public class testCase2 extends BaseToAll{
	public WebDriver driver;
	
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void getTestCase2() throws IOException, InterruptedException
	{
		
		excelDriven data=new excelDriven();
		pageObject2 po2=new pageObject2(driver);
		ArrayList<String> d=data.getDataFromExcel("ThirdTestCase");
	
		po2.getAutosuggestiveTextbox().sendKeys(d.get(3));
		Thread.sleep(3000);
		for(int i=0;i<po2.getAutoSuggestingDropdown().size();i++)
		{
			if(po2.getAutoSuggestingDropdown().get(i).getText().equalsIgnoreCase("India"))
			{
				po2.getAutoSuggestingDropdown().get(i).click();
				break;
			}
		}
		
		
	}
	
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}
	

}
