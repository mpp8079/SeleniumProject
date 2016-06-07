/**
 * 
 */
package com.mpp.webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author SHREEJI
 *
 */
public class MarcuryRegister {
	Properties pro;
	

	public void getRegister(){
		Properties pro;
		File src = new File(".\\Configration\\Marcury.property");
		
		try {
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();		
				pro.load(file);
		
		} catch (Exception e) {
			System.out.println("file not find "+e.getMessage());
		}
	}
	
	@Test(description="Register Test")
	public void registerLink(){
		
		System.getProperty("wevdriver.chrome.driver", "C:\\local\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText(ObjectRepository.registerLink)).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name(ObjectRepository.firstNamefiled)).sendKeys("Manish");
		driver.findElement(By.name(ObjectRepository.lastNamefiled)).sendKeys("Patel");
		driver.findElement(By.name(ObjectRepository.phonefiled)).sendKeys("633-588-9999");
		driver.findElement(By.id(ObjectRepository.emailid)).sendKeys("abcd@gmail.com");
		driver.findElement(By.name(ObjectRepository.addressfiled)).sendKeys("123 Teest Dr");
		driver.findElement(By.name(ObjectRepository.cityfiled)).sendKeys("Schaumburg");
		driver.findElement(By.name(ObjectRepository.statefiled)).sendKeys("IL");
		driver.findElement(By.id(ObjectRepository.usserid)).sendKeys("abcd");
		driver.findElement(By.name(ObjectRepository.passwordfiled)).sendKeys("abcd123");
		driver.findElement(By.name(ObjectRepository.confirmpassword)).sendKeys("abcd123");
		driver.findElement(By.name(ObjectRepository.submitbutton)).click();
		Assert.assertEquals(driver.getTitle(),ObjectRepository.registerpagetitel);
	}
}
