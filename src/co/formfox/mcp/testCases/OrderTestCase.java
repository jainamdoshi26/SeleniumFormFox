package co.formfox.mcp.testCases;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Driver.ReturnDriver;
import co.formfox.mcp.pages.OrderPage;

public class OrderTestCase {

	WebDriver driver=ReturnDriver.getDriver();
	OrderPage orderObj=new OrderPage();
		
	@Test
	public void orderPage() throws InterruptedException, IOException {
		orderObj.placeOrder();
	}	
	
}
