package co.formfox.mcp.order;

import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

/**
 * Its a class provides orderPage1(), orderPage2(), orderPage3() functions.
 *
 */
public class OrderPage {
	
	events eventCall=new events();
	AddServices addServiceObj=new AddServices();
	
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
		addServiceObj.addDrugTest();
		addServiceObj.addAlcoholTest();
		addServiceObj.addBackgroundTest();
		addServiceObj.addPhysicalTest();
		addServiceObj.addPOCTTest();
		eventCall.clickOnElementByXpath(Constants.SERVICE_ORDER_CONFIRM_BUTTON);
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.NEXT_BUTTON_ORDER_PAGE_1);
		System.out.println("Order Page 1");
	}
	
}
