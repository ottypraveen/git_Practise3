package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject1 {
	
	public WebDriver driver;
	
	 By radioButton=By.xpath("//input[@value='radio2']");
	
	
	public pageObject1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getRadioButton()
	{
		return driver.findElement(radioButton);
	}
	
	

}
