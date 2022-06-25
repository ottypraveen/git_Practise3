package Academy;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject3;
import resources.BaseToAll;

public class testCase3 extends BaseToAll{
	public WebDriver driver;
	
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	
	@Test
	public void getTestCase3() throws IOException, InterruptedException
	{

		Thread.sleep(2000);
		pageObject3 po3=new pageObject3(driver);
		po3.getCheckBox().click();
		String opt=po3.getCheckBoxTest().getText();
		System.out.println(opt);
		
		Select dropdown=new Select(po3.getStaticDropdown());
		List<WebElement> optionsinDropdown=driver.findElements(By.cssSelector("select[id*='dropdown'] option"));
		for(int i=0;i<optionsinDropdown.size();i++)
		{
			System.out.println(optionsinDropdown.get(i).getText());
		}
		
		dropdown.selectByVisibleText(opt);
		
	}
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}

}
