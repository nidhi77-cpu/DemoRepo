package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utitlis.ElementUtil;

public class Homepage {
	private WebDriver driver;
	private ElementUtil elementUtil;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	private WebElement getHeadername(String headervalue) {
		String headerxpathvalue = ".//a[contains(text(),'" + headervalue + "')]";
		return elementUtil.getElement("xpath", headerxpathvalue);
	}

	public boolean HeaderValueisexsists(String headervalue) {
		String header = getHeadername(headervalue).getText();
		System.out.println(header);
		return getHeadername(headervalue).isDisplayed();

	}

	private WebElement getcontactname(String contactvalue) {
		String contactxpathvalue = ".//a[contains(text(),'" + contactvalue + "')]";
		return elementUtil.getElement("xpath", contactxpathvalue);
	}

	public boolean contactValueisexsists(String contactvalue) {
		String contact = getcontactname(contactvalue).getText();
		System.out.println(contact);
		return getHeadername(contactvalue).isDisplayed();

	}

}
