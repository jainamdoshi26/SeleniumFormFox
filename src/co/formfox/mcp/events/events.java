package co.formfox.mcp.events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Driver.ReturnDriver;

/**
 * Various activity like click, send keys and navigating to the URL is written
 * in this class
 */
public class events {

	
	/**
	 * Is used to perform a click event using the Xpath of the element.
	 */
	public void clickOnElementByXpath(String path) {
		ReturnDriver.getDriver().findElement(By.xpath(path)).click();
	}

	/**
	 * Is used to perform a sendKeys (pass value) event using the Xpath of the
	 * element.
	 */
	public void sendKeysToElementByXpath(String path, String message) {
		ReturnDriver.getDriver().findElement(By.xpath(path)).sendKeys(message);
	}

}
