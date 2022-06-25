package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject2 {
	
	WebDriver driver;
	
	By autosuggestiveTextbox=By.xpath("//input[@id='autocomplete']");
	
	
	By autoSuggestingDropdown=By.xpath("//div[@class='ui-menu-item-wrapper']");
	
	
	public pageObject2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getAutosuggestiveTextbox()
	{
		return driver.findElement(autosuggestiveTextbox);
	}
	
	public List<WebElement> getAutoSuggestingDropdown()
	{
		return driver.findElements(autoSuggestingDropdown);
	}

}
