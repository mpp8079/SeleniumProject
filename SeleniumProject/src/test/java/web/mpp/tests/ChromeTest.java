/**
 * 
 */
package web.mpp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.locators.InternetExplorerLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mpp.webpages.ConfigReader;

/**
 * @author SHREEJI
 *
 */
public class ChromeTest {
	ConfigReader uty = new ConfigReader();
	
	@Test
	public void testChrome(){
		
		System.setProperty("webdriver.chrome.driver",uty.getChromeDriver());
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(uty.getApplicationURL());
		
		driver.quit();
	}
	
	

}
