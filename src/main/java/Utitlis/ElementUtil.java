package Utitlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ElementUtil {
    
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public WebElement getElement(String locatortype , String locatorvalue )
	{
		return driver.findElement(getBy(locatortype, locatorvalue));
	}
	
	public By getBy(String locatortype , String locatorvalue )
	{
		By locator= null;
		switch (locatortype) {
		case "id":
			locator= By.id(locatorvalue);
			break;
		case "name":
			locator= By.name(locatorvalue);
			break;
		case "xpath":
			locator= By.xpath(locatorvalue);
			break;

		default:
			break;
		}
		return locator;
	}
	
	
}
