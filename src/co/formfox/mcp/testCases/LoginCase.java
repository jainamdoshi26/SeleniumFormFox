package co.formfox.mcp.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import co.formfox.mcp.pages.Login_Logout;

public class LoginCase {
	
	Login_Logout loginObj=new Login_Logout();

	@Test
	public void login() throws InterruptedException, IOException {
		loginObj.login();
		System.out.println("Login Successfull");
  }
  
}
