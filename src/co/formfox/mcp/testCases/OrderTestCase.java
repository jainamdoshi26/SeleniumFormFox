package co.formfox.mcp.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Driver.ReturnDriver;
import co.formfox.mcp.pages.Login_Logout;
import co.formfox.mcp.pages.OrderPage;

public class OrderTestCase {

	WebDriver driver=ReturnDriver.getDriver();
	OrderPage orderObj=new OrderPage();
		
	@Test
	public void orderPage() throws InterruptedException, IOException {
//		orderObj.orderPage1();
//		System.out.println("Order Page 1");
//		orderObj.orderPage2();
//		System.out.println("Order Page 2");
//		orderObj.orderPage3();
//		System.out.println("Order Page 3");
//		orderObj.orderPageBG();
		System.out.println("Order placed successfully");
		Thread.sleep(3000);
	}	
	
}
