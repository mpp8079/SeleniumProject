/**
 * 
 */
package web.mpp.tests;


import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mpp.webpages.ConfigReader;
import com.mpp.webpages.HomePage;

/**
 * @author SHREEJI
 *
 */
public class LoginTest {
	
	ConfigReader conf = new ConfigReader();
	
	
	@Test
	public void login() throws Exception{
		
		
		WebDriver driver;		
		;
		
		//lunch firefox browser
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//lunch url page 
		driver.get(conf.getApplicationURL());
		
		// click on Catlog link 
		HomePage.Catloglinktxt(driver).click();
		
		// Navigate back to home page from catlog page 
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// click on Administration link
		HomePage.Administrationlinktxt(driver).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Click on SupportSide link
		HomePage.SupportSidelinktxt(driver).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		// Enter UserName 
		HomePage.txtbxUserName(driver).sendKeys("admin");
		
		// Enter Password
		HomePage.txtbxPassw(driver).sendKeys("admin@123");
		
		// click sign button
		HomePage.txtbtLogin(driver).click();
		
		driver.close();
	}
	
	
		

}
