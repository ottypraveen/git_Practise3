package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject3 {
	
	WebDriver driver;
	
	By checkBoxTest=By.xpath("//div[@class='right-align']/fieldset/label[2]");
	By checkBox=By.cssSelector("input[value='option2']");
	By staticDropdown=By.cssSelector("Select[id*='dropdown']");
	
	public pageObject3(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getCheckBoxTest()
	{
		return driver.findElement(checkBoxTest);
	}
	
	public WebElement getCheckBox()
	{
		return driver.findElement(checkBox);
	}
	public WebElement getStaticDropdown()
	{
		return driver.findElement(staticDropdown);
	}
	
	
	

}
