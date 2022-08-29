package Mytests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.Configreader;
import Factory.Driverfactory;
import Pages.Homepage;

public class Homepagetest {

	Driverfactory df;
    WebDriver driver;
	Configreader gr;
	Properties prop;
	Homepage hm;
	
	@BeforeTest
	public void setup() {
		gr = new Configreader();
		prop = gr.initLangProp("english");
		df = new Driverfactory();
		driver =df.intidriver("chrome", prop);
		hm = new Homepage(driver);
	}
	
	
	@Test
	public void headertest()
	{
		Assert.assertTrue(hm.HeaderValueisexsists(prop.getProperty("Header")));
	}
	
	@Test
	public void contacttest()
	{
		Assert.assertTrue(hm.contactValueisexsists(prop.getProperty("Header")));
	}
	
	@AfterTest
	public void shutdown()
	{
		driver.quit();
	}
	
	
	
}
