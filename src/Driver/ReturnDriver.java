package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Its a class provides a Static getDriver function.
 *
 */
public class ReturnDriver {
	
	static WebDriver driver = setDriver();
	
	/**
	 *It sets the driver property and returns driver object. 
	 */
	public static WebDriver setDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Tudip\\Documents\\Automation Project\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return driver;
	}
	
	/**
	 * Provides a Static ChromeDriver object.
	 * @return driver object
	 */
	public static WebDriver getDriver() {
		return driver;
	}
	
//	public static void close() {
//		driver.close();
//	}
//	
//	public static void quit() {
//		driver.quit();
//	}
}
