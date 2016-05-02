/**
 * 
 */
package web.mpp.tests;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mpp.webpages.HomePage;

/**
 * @author SHREEJI
 *
 */
public class LoginTest {
	
	WebElement element =null;
	
	@Test
	public void login(){
		WebDriver driver;
		String url = "http://www.gcrit.com/build3/admin/login.php?osCAdminID=23fhggrn9l9c06pltmeo88nvl1";
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		HomePage.txtbxUserName(driver).sendKeys("admin");
		HomePage.txtbxPassw(driver).sendKeys("admin@123");
		HomePage.txtbtLogin(driver).click();
		
		driver.close();
	}
	
	
		

}
