package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject5 {
	WebDriver driver;
	
	By openTabButton=By.xpath("//a[@id='opentab']");
	
	public pageObject5(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getOpenTabButton()
	{
		return driver.findElement(openTabButton);
	}

}
