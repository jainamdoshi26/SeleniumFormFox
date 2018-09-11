package co.formfox.mcp.events;

import org.openqa.selenium.WebDriver;

import co.formfox.mcp.paths.Constants;

/**
 * Purpose: Is to Add the Services in the order.
 */
public class addServices {

	WebDriver driver;
	events eventCall = new events();

	/**
	 * Purpose: Is to Add Drug Test.
	 */
	public void addDrugTest() throws InterruptedException {
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.DRUG_TAB);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.LAB_ACCOUNT);
		eventCall.clickOnElementByXpath(Constants.SELECT_LAB_ACCOUNT_PAML);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.ADD_BUTTON_DRUG_TEST);
	}

	/**
	 * Purpose: Is to Add Alcohol Test.
	 */
	public void addAlcoholTest() throws InterruptedException {
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.ALCOHOL_TEST_TAB);
		eventCall.clickOnElementByXpath(Constants.TEST_TO_BE_PERFORMED_TEXT_FIELD);
		eventCall.clickOnElementByXpath(Constants.BLOOD_TEST_TO_BE_PERFORMED);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.ADD_BUTTON_ALCOHOL_TEST);
	}

	/**
	 * Purpose: Is to Add POCT Test.
	 */
	public void addPOCTTest() {
		eventCall.clickOnElementByXpath(Constants.POINT_OF_CARE_TEST_TAB);
	}

	/**
	 * Purpose: Is to Add Physical Test.
	 */
	public void addPhysicalTest() {
		eventCall.clickOnElementByXpath(Constants.PHYSICAL_EXAM_TAB);
	}

	/**
	 * Purpose: Is to Add Background Test.
	 */
	public void addBackgroundTest() {
		eventCall.clickOnElementByXpath(Constants.BACKGROUND_CHECK_TAB);
	}
}
