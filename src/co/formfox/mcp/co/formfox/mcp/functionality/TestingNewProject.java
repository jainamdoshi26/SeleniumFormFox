package co.formfox.mcp.co.formfox.mcp.functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.formfox.mcp.paths.*;

public class TestingNewProject {

	WebDriver driver;

	/**
	 *The methods invokes the browser driver.
	 *@return The driver connection.
	 */
	public void InvokeChromeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			driver.get(url);
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickElementByXpath(String path) {
		driver.findElement(By.xpath(path)).click();
	}
	
	public void SendKeysByXpath(String path, String message) {
		driver.findElement(By.xpath(path)).sendKeys(message);
	}
	
	public static void main(String[] args) throws InterruptedException {
		try {
			TestingNewProject order1=new TestingNewProject();
			String firstname = "Peter";
			String searchcomp = "Four";
			String donorid = "654239518";
			String path="http://63.236.215.40/webapp/#/login?clientFolder=RAPromotionQATest";
			order1.InvokeChromeBrowser(path);
			order1.SendKeysByXpath(Constants.USERNAME_TEXT_FIELD,"Masterweb");
			order1.SendKeysByXpath(Constants.PASSWORD_TEXT_FIELD,"Test12345");
			order1.ClickElementByXpath(Constants.LOGIN_BUTTON);
//			order1.ClickElementByXpath(Constants.ORDER_TAB);
			Thread.sleep(3000);	
			order1.ClickElementByXpath(Constants.SELECT_COMPANY_OPTION);
			Thread.sleep(3000);
			order1.ClickElementByXpath(Constants.REASON_TEXT_FIELD);
			order1.ClickElementByXpath(Constants.SELECT_REASON_COMPANY);
//			order1.ClickElementByXpath(Constants.POINT_OF_CARE_TEST);
			order1.ClickElementByXpath(Constants.SERVICE_ORDER_CONFIRM);
			Thread.sleep(3000);
			order1.ClickElementByXpath(Constants.NEXT_BUTTON_ORDER_PAGE_1);
			order1.ClickElementByXpath(Constants.DONOR_ID);
			order1.SendKeysByXpath(Constants.DONOR_ID, donorid);
			order1.ClickElementByXpath(Constants.SEARCH_BUTTON_DONOR_ID);
			Thread.sleep(3000);
			order1.SendKeysByXpath(Constants.FIRST_NAME_TEXT_FIELD,firstname);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
