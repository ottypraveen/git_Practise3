package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObject6 {
	
	WebDriver driver;
	
	
	By tableNames=By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[1]");
	By Amounts=By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[1]/following-sibling::td[3]");
	
	
	public pageObject6(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public List<WebElement> getTableNames()
	{
		return driver.findElements(tableNames);
	}
	
	public List<WebElement> getAmount()
	{
		return driver.findElements(Amounts);
	}
	

}
