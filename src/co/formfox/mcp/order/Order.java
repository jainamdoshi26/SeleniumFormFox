package co.formfox.mcp.order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Order {

	WebDriver driver;

	@BeforeTest
	public void beforeEeveyTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		System.out.println("Before every Test (2)");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver.get("http://63.236.215.40/webapp/#/login?clientFolder=RAPromotionQATest");
		Thread.sleep(3000);
		System.out.println("Before every class (2)");
	}
	
	@Test
	public void orderPage1() {
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
