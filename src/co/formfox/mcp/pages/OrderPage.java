package co.formfox.mcp.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import Driver.ReadCSVWithScanner;
import Driver.ReturnDriver;
import Driver.assignData;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;


/**
 * Its a class provides orderPage1(), orderPage2(), orderPage3() functions.
 *
 */
public class OrderPage {
	
	events eventCall=new events();
	List<assignData> datalist=ReadCSVWithScanner.getDataList();
		
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
//		addDrugTest();
		addAlcoholTest();
		addBackgroundTest();
		addPhysicalTest();
//		addPOCTTest();
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.SERVICE_ORDER_CONFIRM_BUTTON);
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.NEXT_BUTTON_ORDER_PAGE_1);
		Thread.sleep(3000);
	}
	
	/**
	 * The Order Page 2 is filled using this function.
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public void orderPage2() throws InterruptedException, IOException {
//		List<assignData> listOfData = temdata.readCSV();
		eventCall.sendKeysToElementByXpath(Constants.DONOR_ID_TEXT_FIELD, datalist.get(1).getSSN().toString());
		eventCall.clickOnElementByXpath(Constants.SEARCH_BUTTON_DONOR_ID);
		Thread.sleep(2000);
		String firstName=ReturnDriver.getDriver().findElement(By.xpath(Constants.FIRST_NAME_TEXT_FIELD)).getAttribute("value");
		if(firstName.isEmpty()) 
		{
			eventCall.sendKeysToElementByXpath(Constants.FIRST_NAME_TEXT_FIELD, datalist.get(1).getFirstName().toString());
			eventCall.sendKeysToElementByXpath(Constants.LAST_NAME_TEXT_FIELD, datalist.get(1).getLastName().toString());
			eventCall.sendKeysToElementByXpath(Constants.BIRTHDATE_TEXT_FIELD, datalist.get(1).getBirthdate().toString());
			System.out.println("Adding new donor information");	
			commonActivity();
		}else
		{
		System.out.println("Order is pending for this donor in the system");	
		commonActivity();
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.CONFIRM_BUTTON_ORDER_CONFIRMATION_POPUP);
		Thread.sleep(2000);
		}
	}
	
	/**
	 * The Order Page 3 is filled using this function.
	 * @throws InterruptedException
	 */
	public void orderPage3() throws InterruptedException {
		Thread.sleep(2000);
		eventCall.sendKeysToElementByXpath(Constants.EMAIL_FORM_TEXT_FIELD_ORDER_PAGE_3, datalist.get(1).getEmailID().toString());
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.SEND_EMAIL_BUTTON_ORDER_PAGE_3);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.NEXT_BUTTON_ORDER_PAGE_3);
		Thread.sleep(3000);
	}	
	
	public void orderPageBG() throws InterruptedException {
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.CONTINUE_BUTTON_ORDER_PAGE_BG);
		Thread.sleep(3000);
	}
	
	/**
	 * Purpose: Used to fill the order expiration details.
	 */
	private void commonActivity() throws InterruptedException {
		eventCall.clickOnElementByXpath(Constants.FIND_A_COLLECTION_SITE_BUTTON);
		eventCall.sendKeysToElementByXpath(Constants.FIND_A_LOCATION_SEARCH, datalist.get(1).getSiteAddress().toString());
		eventCall.clickOnElementByXpath(Constants.FIND_A_LOCATION_SEARCH_BUTTON);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.SELECT_SITE);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.TIME_ZONE_TEXT_FIELD);
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.SELECT_TIME_ZONE);
		eventCall.sendKeysToElementByXpath(Constants.ORDER_EXPIRATION_DATE_TEXT_FIELD, "11112022");
		eventCall.sendKeysToElementByXpath(Constants.PREFERRED_SCHEDULE_DATE_TEXT_FIELD, "11112021");
		eventCall.sendKeysToElementByXpath(Constants.COMMENTS_TEXT_AREA, "Comments are in this field.");
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.SUBMIT_BUTTON_ORDER_PAGE_2);
		Thread.sleep(5000);
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
