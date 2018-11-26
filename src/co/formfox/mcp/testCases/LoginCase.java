package co.formfox.mcp.testCases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Driver.ReadCSVWithScanner;
import Driver.assignData;
import co.formfox.mcp.pages.Login_Logout;

public class LoginCase {
	
	Login_Logout loginObj=new Login_Logout();

	@Test
	public void login() throws InterruptedException, IOException {
		loginObj.login();
		System.out.println("Login Successfull");
  }
  
}
