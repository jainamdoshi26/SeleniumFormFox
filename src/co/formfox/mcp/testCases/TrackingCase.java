package co.formfox.mcp.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Driver.ReturnDriver;
import co.formfox.mcp.events.events;
import co.formfox.mcp.pages.Login_Logout;
import co.formfox.mcp.pages.OrderPage;
import co.formfox.mcp.pages.TrackingPage;
import co.formfox.mcp.paths.Constants;

public class TrackingCase {
	
	WebDriver driver=ReturnDriver.getDriver();
	TrackingPage trackingObj=new TrackingPage();
	events eventCall=new events();

	@Test
	public void Tracking() throws InterruptedException {
		eventCall.clickOnElementByXpath(Constants.TRACKING_PAGE);
		Thread.sleep(5000);
		trackingObj.searchSSN();
		trackingObj.verifySSN();
		trackingObj.employeeDetails();
	}
	

}
