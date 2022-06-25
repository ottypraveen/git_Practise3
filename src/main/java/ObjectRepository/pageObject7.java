package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject7 {
	
	WebDriver driver;
	
	By mouseHover=By.xpath("//button[@id='mousehover']");
	
	public pageObject7(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getMouseHover()
	{
		return driver.findElement(mouseHover);
	}

}
