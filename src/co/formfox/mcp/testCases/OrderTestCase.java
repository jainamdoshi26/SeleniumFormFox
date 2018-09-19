package co.formfox.mcp.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Driver.ReturnDriver;
import co.formfox.mcp.login_logout.Login_Logout;
import co.formfox.mcp.order.OrderPage;

public class OrderTestCase {

	WebDriver driver=ReturnDriver.getDriver();
	Login_Logout loginObj=new Login_Logout();
	OrderPage orderObj=new OrderPage();
	
	@BeforeTest
	public void beforeEeveyTest() throws InterruptedException {
		loginObj.login();
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {	
		
	}
	
	@Test
	public void orderPage1() throws InterruptedException {
		orderObj.orderPage1();
	}

	@Test(dependsOnMethods = {"orderPage1"})
	public void orderPage2() {
		
	}

	@Test(dependsOnMethods = {"orderPage2"})
	public void orderPage3() {

	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		loginObj.logout();
	}

	@AfterTest
	public void afterAllTest() throws InterruptedException {
		driver.close();
		driver.quit();
	}
	
	
	
}
