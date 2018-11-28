package co.formfox.mcp.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Driver.ReturnDriver;
import co.formfox.mcp.pages.Login_Logout;

public class LogoutCase {
	
	Login_Logout loginObj=new Login_Logout();
	WebDriver driver=ReturnDriver.getDriver();
	
  @Test
  public void logout() throws InterruptedException {
	  	loginObj.logout();
		System.out.println("Logout Successfull");
		}

  @AfterTest
  public void afterAllTest() throws InterruptedException {
	  	driver.close();
		driver.quit();
		}
 }
