package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject4 {
	
	WebDriver driver;
	
	By openWindowButton=By.xpath("//button[@id='openwindow']");
	By featuredTest=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By alertTextBox=By.cssSelector("input[placeholder*='Name']");
	By alertButton=By.cssSelector("input[id='alertbtn']");
	
	
	public pageObject4(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getOpenWindowButton()
	{
		return driver.findElement(openWindowButton);
	}
	
	public WebElement getFeaturedTest()
	{
		return driver.findElement(featuredTest);
	}
	
	public WebElement getAlertTextBox()
	{
		return driver.findElement(alertTextBox);
	}
	public WebElement getalertButton()
	{
		return driver.findElement(alertButton);
	}


}
