package co.formfox.mcp.pages;

import org.openqa.selenium.By;

import Driver.ReturnDriver;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

/**
 * Its a class provides orderPage1(), orderPage2(), orderPage3() functions.
 *
 */
public class OrderPage {
	
	events eventCall=new events();
	
	/**
	 * The Order Page 1 is filled using this function.
	 * @throws InterruptedException
	 */
	public void orderPage1() throws InterruptedException {
		eventCall.clickOnElementByXpath(Constants.ORDER_PAGE);
		Thread.sleep(5000);
		eventCall.clickOnElementByXpath(Constants.SELECT_COMPANY_OPTION);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.REASON_TEXT_FIELD);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.SELECT_REASON_COMPANY);
		Thread.sleep(3000);
		addDrugTest();
		addAlcoholTest();
		addBackgroundTest();
		addPhysicalTest();
		addPOCTTest();
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.SERVICE_ORDER_CONFIRM_BUTTON);
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.NEXT_BUTTON_ORDER_PAGE_1);
		System.out.println("Order Page 1");
		Thread.sleep(3000);
	}
	public void orderPage2() throws InterruptedException {
		eventCall.clickOnElementByXpath(Constants.DONOR_ID_TEXT_FIELD);
		eventCall.sendKeysToElementByXpath(Constants.DONOR_ID_TEXT_FIELD, "856327021");
		eventCall.clickOnElementByXpath(Constants.SEARCH_BUTTON_DONOR_ID);
		Thread.sleep(2000);
		String firstName=ReturnDriver.getDriver().findElement(By.xpath(Constants.FIRST_NAME_TEXT_FIELD)).getAttribute("value");
		if(firstName.isEmpty()) 
		{
			System.out.println("Adding new donor information");	
			eventCall.sendKeysToElementByXpath(Constants.FIRST_NAME_TEXT_FIELD, "Peter");
			eventCall.sendKeysToElementByXpath(Constants.LAST_NAME_TEXT_FIELD, "Parker");
			eventCall.sendKeysToElementByXpath(Constants.BIRTHDATE_TEXT_FIELD, "11111995");
		}
		eventCall.clickOnElementByXpath(Constants.FIND_A_COLLECTION_SITE_BUTTON);
	}
	
	/**
	 * Purpose: Is to Add Drug Test.
	 */
	public void addDrugTest() throws InterruptedException {
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.DRUG_TAB);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.LAB_ACCOUNT);
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.SELECT_LAB_ACCOUNT_PAML);
		Thread.sleep(5000);
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
