package co.formfox.mcp.login_logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Driver.ReturnDriver;
import co.formfox.mcp.events.events;
import co.formfox.mcp.paths.Constants;

/**
 *Its a class provides the login() and logout() functions. 
 *
 */
public class Login_Logout {

	events eventCall=new events();
	WebDriver driver=ReturnDriver.getDriver();
	
	/**
	 * It navigates to the URL and logins the site.
	 */
	public void login() throws InterruptedException {
		driver.get(Constants.URL);
		Thread.sleep(5000);
		eventCall.sendKeysToElementByXpath(Constants.USERNAME_TEXT_FIELD,"Masterweb");
		eventCall.sendKeysToElementByXpath(Constants.PASSWORD_TEXT_FIELD,"Test12345");
		eventCall.clickOnElementByXpath(Constants.LOGIN_BUTTON);		
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(Constants.MENU_HOVER)).isDisplayed()== true) {
		System.out.println("Login Successfull");
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
		action.moveToElement(we).build().perform();
		Thread.sleep(1500);
		eventCall.clickOnElementByXpath(Constants.LOGOUT_LINK);	
		System.out.println("Logout Successfull");
	}
}
