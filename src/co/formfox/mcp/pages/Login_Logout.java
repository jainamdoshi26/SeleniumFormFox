package co.formfox.mcp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Driver.ReadCSVWithScanner;
import Driver.ReturnDriver;
import Driver.assignData;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

/**
 *Its a class provides the login() and logout() functions. 
 *
 */
public class Login_Logout {

	events eventCall=new events();
	WebDriver driver=ReturnDriver.getDriver();
	List<assignData> datalist=ReadCSVWithScanner.getDataList();
	
	/**
	 * It navigates to the URL and logins the site.
	 */
	public void login() throws InterruptedException {
		driver.get(Constants.URL);
		Thread.sleep(5000);
		eventCall.sendKeysToElementByXpath(Constants.USERNAME_TEXT_FIELD,datalist.get(1).getUsername().toString());
		eventCall.sendKeysToElementByXpath(Constants.PASSWORD_TEXT_FIELD,datalist.get(1).getPassword().toString());
		eventCall.clickOnElementByXpath(Constants.LOGIN_BUTTON);		
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(Constants.MENU_HOVER)).isDisplayed()== true) {
		Thread.sleep(2000);
		}
		else
		System.out.println("Login Fail");
	}
	
	/**
	 * It logout the site.
	 * @throws InterruptedException
	 */
	public void logout() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(Constants.MENU_HOVER));
		Thread.sleep(3000);
		action.moveToElement(we).build().perform();
		Thread.sleep(2000);
		eventCall.clickOnElementByXpath(Constants.LOGOUT_LINK);	
	}
}
