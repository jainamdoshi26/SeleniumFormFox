package co.formfox.mcp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import Driver.ReadCSVWithScanner;
import Driver.ReturnDriver;
import Driver.assignData;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

public class TrackingPage {

events eventCall=new events();
List<assignData> datalist=ReadCSVWithScanner.getDataList();
	
	/**
	 * The Tracking page search function.
	 * @throws InterruptedException
	 */
	public void searchSSN() throws InterruptedException {
		Thread.sleep(5000);
		eventCall.clickOnElementByXpath(Constants.SEARCH_DROPDOWN_TRACKING_PAGE);
		eventCall.clickOnElementByXpath(Constants.SEARCH_SSN_TRACKING_PAGE);
		eventCall.sendKeysToElementByXpath(Constants.SEARCH_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getSSN().toString());
		eventCall.clickOnElementByXpath(Constants.SEARCH_BUTTON_TRACKING_PAGE);
		Thread.sleep(3000);
	}

	public void verifySSN() throws InterruptedException {
		String foundSSN = ReturnDriver.getDriver().findElement(By.xpath(Constants.SSN_VERIFY_TRACKING_PAGE)).getText();
		Assert.assertNotNull(foundSSN,"The SSN is not found, you may have to place order again");
		System.out.println("Successfully found");
		Thread.sleep(3000);
		}

	public void employeeDetails() throws InterruptedException {
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.SSN_VERIFY_TRACKING_PAGE);
		String generalInformation = ReturnDriver.getDriver().findElement(By.xpath(Constants.GENERAL_INFORMATION_TAB)).getText();
		Assert.assertNotNull(generalInformation);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.EDIT_GENERAL_INFORMATION_TAB);
		Thread.sleep(5000);
	}
}
	
