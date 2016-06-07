/**
 * 
 */
package web.mpp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mpp.webpages.ObjectMap;

import junit.framework.Assert;

/**
 * @author SHREEJI
 *
 */
public class ObjectMapLogin {
	
	public WebDriver driver;
	public ObjectMap obmap;
	String url ="http://www.gcrit.com/build3/admin/login.php?osCAdminID=23fhggrn9l9c06pltmeo88nvl1";
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	
	@Test
	public void login() throws Exception{
		String workingDir = System.getProperty("user.dir");
		obmap = new ObjectMap(workingDir +"\\Configration\\Property.property");
		
		WebElement username = driver.findElement(obmap.getLocator("Username_filed"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(obmap.getLocator("Password_filed"));
		password.sendKeys("admin@123");
		WebElement login =driver.findElement(obmap.getLocator("Login_bitton"));
		login.click();
		
		WebElement onlineuser =driver.findElement(obmap.getLocator("online_user"));
		
		Assert.assertEquals("Online users", onlineuser);
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
