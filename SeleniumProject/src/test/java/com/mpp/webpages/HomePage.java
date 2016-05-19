/**
 * 
 */
package com.mpp.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author SHREEJI
 *
 */
public class HomePage {	
	
	private static WebElement element =null;
	
	
	public static WebElement txtbxUserName(WebDriver driver){		
		element = driver.findElement(By.name("username"));		
		return element;
		
	}
	
	public static WebElement txtbxPassw(WebDriver driver){		
		element = driver.findElement(By.name("password"));		
		return element;
		
	}
	
	public static WebElement txtbtLogin(WebDriver driver){		
		element = driver.findElement(By.id("tdb1"));		
		return element;
		
	}
	
	public static WebElement Catloglinktxt(WebDriver driver){		
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/a[2]"));		
		return element;
		
	}
	
	
	public static WebElement SupportSidelinktxt(WebDriver driver){		
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/a[3]"));		
		return element;
		
	}
	
	public static WebElement  Administrationlinktxt(WebDriver driver){		
		element = driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/a[1]"));		
		return element;
		
	}
	
}
