package Academy;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.pageObject6;
import resources.BaseToAll;

public class testCase6 extends BaseToAll {
	
	public WebDriver driver;
	
	@BeforeTest
	public void getInitializeTestCase() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void getTestCase6() throws IOException, InterruptedException
	{
		
		Thread.sleep(2000);
		pageObject6 po6=new pageObject6(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,100)");
		int nameCount=po6.getTableNames().size();
		
		
//		List<WebElement> names=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[1]"));
//		int namesSize=names.size();
//		System.out.println(namesSize);
//		for(WebElement name:names)
//		{
//			System.out.println(name.getText());
//		}
//		
//		Assert.assertEquals(nameCount, 9,"Counts not matching");
		
		
		List<WebElement> names=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[2]//preceding-sibling::td"));
		for(WebElement name:names)
		{
			System.out.println(name.getText());
			
		}
		
		
		System.out.println(driver.findElement(By.xpath("//td[text()='Mechanic']/preceding-sibling::td")).getText());
		String amountofJack=driver.findElement(By.xpath("//td[text()='Jack']/following-sibling::td[3]")).getText();
		System.out.println(amountofJack);
		int amountofJackint=Integer.parseInt(amountofJack);
		System.out.println(amountofJackint);
		List<WebElement> amounts=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[1]/following-sibling::td[3]"));
		int sum=0;
		for(WebElement amount:amounts)
		{
			String amountonTable=amount.getText();
			
			System.out.println(Integer.parseInt(amountonTable));
			sum=sum+Integer.parseInt(amountonTable);
			
			
		}
		System.out.println(sum);
		int expectedSumAmount=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).
				getText().split(":")[1].trim());
		Assert.assertEquals(sum, 295);
		
	}
	@AfterTest
	public void getTeardown()
	{
		driver.close();
	}
	

}
