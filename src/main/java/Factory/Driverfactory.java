package Factory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverfactory {
   
	
	public WebDriver driver;
	
	public WebDriver intidriver(String browsername , Properties prop)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.\\chromedriver.exe");
				driver = new ChromeDriver();
		}
			else
			{
				System.out.println("browser not found");
			}
	          
		}
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	
}
