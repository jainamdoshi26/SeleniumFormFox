package co.formfox.mcp.order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Driver.ReturnDriver;
import co.formfox.mcp.events.addServices;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

public class Order {

	events eventCall=new events();
	addServices service=new addServices();
	WebDriver driver=ReturnDriver.getDriver();
	
	@BeforeTest
	public void beforeEeveyTest() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		System.out.println("Before every Test (2)");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		String URL="http://63.236.215.40/webapp/#/login?clientFolder=RAPromotionQATest";
		ReturnDriver.getDriver().get(URL);
		Thread.sleep(3000);
		eventCall.sendKeysToElementByXpath(Constants.USERNAME_TEXT_FIELD, "Masterweb");
		eventCall.sendKeysToElementByXpath(Constants.PASSWORD_TEXT_FIELD,"Test12345");
		eventCall.clickOnElementByXpath(Constants.LOGIN_BUTTON);
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(Constants.ORDER_PAGE)).isDisplayed()== true) {
			eventCall.clickOnElementByXpath(Constants.ORDER_PAGE);
			System.out.println("Before every class (2)");
		}
		else
		{
			System.out.println("Before every class (2) is fail");		
		}	

	}
	
	@Test
	public void orderPage1() throws InterruptedException {
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.SELECT_COMPANY_OPTION);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.REASON_TEXT_FIELD);
		Thread.sleep(3000);
		eventCall.clickOnElementByXpath(Constants.SELECT_REASON_COMPANY);
		service.addDrugTest();
		service.addAlcoholTest();
		service.addBackgroundTest();
		service.addPhysicalTest();
		service.addPOCTTest();
		System.out.println("Order Page 1");
	}

	@Test(dependsOnMethods = {"orderPage1"})
	public void orderPage2() {
		System.out.println("Order Page 2");
	}

	@Test(dependsOnMethods = {"orderPage2"})
	public void orderPage3() {
		System.out.println("Order Page 3");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After every class (2)");
		driver.close();
	}

	@AfterTest
	public void afterAllTest() throws InterruptedException {
		System.out.println("After every Test (2)");		
		driver.quit();
	}
	
	
	
}
