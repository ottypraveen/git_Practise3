package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseToAll {
	public static WebDriver driver;
	public WebDriverWait w;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\FrameWorkNew\\E2E_Selenium_Practise\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chromedriver.exe");
			driver=new ChromeDriver();
			w=new WebDriverWait(driver, 30);
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/User/Desktop/chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/User/Desktop/chromedriver.exe");
			driver=new FirefoxDriver();
		}
		return driver;
		
	}
	
	
	public  void getScreenshot(String testCase,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination="./screenshot/"+testCase+System.currentTimeMillis()+".png";
		File fis=new File(destination);
		FileUtils.copyFile(source, fis);
	}
	

}
