package co.formfox.mcp.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Driver.ReturnDriver;
import co.formfox.mcp.events.events;
import co.formfox.mcp.pages.TrackingPage;

public class TrackingCase {
	
	WebDriver driver=ReturnDriver.getDriver();
	TrackingPage trackingObj=new TrackingPage();
	events eventCall=new events();

	@Test
	public void Tracking() throws InterruptedException {
		trackingObj.generalInformationPopup();
	}
	

}
