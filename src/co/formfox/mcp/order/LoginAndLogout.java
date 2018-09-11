package co.formfox.mcp.order;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

public class LoginAndLogout {

	WebDriver driver;
	events eventCall=new events();

	@BeforeTest
	public void beforeEeveyTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		System.out.println("Before every Test");
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		String URL="http://63.236.215.40/webapp/#/login?clientFolder=RAPromotionQATest";
		driver.get(URL);
		Thread.sleep(3000);
		System.out.println("Before every class");
	}

	@BeforeMethod
	public void beforeMethods() {
		System.out.println("Before every method");			
	}
	
	@Test(priority=1)
	public void testLoginFunctionality() throws InterruptedException {
		eventCall.sendKeysToElementByXpath(Constants.USERNAME_TEXT_FIELD,"Masterweb");
		eventCall.sendKeysToElementByXpath(Constants.PASSWORD_TEXT_FIELD,"Test12345");
		eventCall.clickOnElementByXpath(Constants.LOGIN_BUTTON);		
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(Constants.MENU_HOVER)).isDisplayed()== true) {
		System.out.println("Test Cases 1 passes");
		}
		else
		System.out.println("Test Cases 1 Fail");
	}
	
	@Test(priority=2)
	public void testLogoutFunctionality() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(Constants.MENU_HOVER));
		action.moveToElement(we).build().perform();
		eventCall.clickOnElementByXpath(Constants.LOGOUT_LINK);	
		System.out.println("Test case 2 passed");
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("After every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After every class");
		driver.close();
	}

	@AfterTest
	public void afterAllTest() throws InterruptedException {
		System.out.println("After every Test");		
		driver.quit();
	}

}