package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnDriver {
	
	static WebDriver driver = setDriver();
	
	public static WebDriver setDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
