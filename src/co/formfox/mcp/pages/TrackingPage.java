package co.formfox.mcp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import Driver.ReadCSVWithScanner;
import Driver.ReturnDriver;
import Driver.assignData;
import co.formfox.mcp.events.events;
import co.formfox.mcp.events.navigationEvent;
import co.formfox.mcp.paths.Constants;

public class TrackingPage {


events eventCall=new events();
navigationEvent tempnavigation=new navigationEvent();

List<assignData> datalist=ReadCSVWithScanner.getDataList();
	
	/**
 	* The Tracking page search function.
 	* @throws InterruptedException
 	*/
	public void generalInformationPopup() throws InterruptedException {
		tempnavigation.navigationPageEvent("Tracking");
		Thread.sleep(5000);
		searchSSN();
		employeeDetails();
	}
	
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
		verifySSN();
	}

	/**
	 * The Tracking page verify function.
	 * @throws InterruptedException
	 */
	public void verifySSN() throws InterruptedException {
		String foundSSN = ReturnDriver.getDriver().findElement(By.xpath(Constants.SSN_VERIFY_TRACKING_PAGE)).getText();
		Assert.assertNotNull(foundSSN,"The SSN is not found, you may have to place order again");
		System.out.println("Successfully found");
		Thread.sleep(3000);
		}

	/**
	 * Action on the employee details page.
	 * @throws InterruptedException
	 */
	public void employeeDetails() throws InterruptedException {
		operationOnEmployeeDetails();
	}
	
	/**
	 * Opens the Employee Details popup.
	 * @throws InterruptedException
	 */
	public void operationOnEmployeeDetails() throws InterruptedException {
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.SSN_VERIFY_TRACKING_PAGE);
		Thread.sleep(2000);
		String generalInformation = ReturnDriver.getDriver().findElement(By.xpath(Constants.GENERAL_INFORMATION_TAB)).getText();
		Assert.assertNotNull(generalInformation);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.EDIT_GENERAL_INFORMATION_TAB);
		Thread.sleep(5000);
		saveDataInGeneralInformation();	
	}
	
	/**
	 * Saves data in the General Information tab of Employee Details popup.
	 * @throws InterruptedException
	 */
	private void saveDataInGeneralInformation() {
		eventCall.sendKeysToElementByXpath(Constants.EMPLOYER_ID_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getEmployerID().toString());
		eventCall.sendKeysToElementByXpath(Constants.DRIVER_ID_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getDriverID().toString());
		eventCall.sendKeysToElementByXpath(Constants.EMPLOYER_ID_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getEmployerID().toString());
		eventCall.sendKeysToElementByXpath(Constants.ALTERNATE_ID_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getAlternateID().toString());
		eventCall.sendKeysToElementByXpath(Constants.HIRE_DATE_TEXT_FIELD_TRACKING_PAGE, datalist.get(1).getHireDate().toString());
		eventCall.clickOnElementByXpath(Constants.SAVE_BUTTON_GENERAL_INFORMATION_POPUP_TRACKING_PAGE);
		System.out.println("General Information saved");
	}
}
	
