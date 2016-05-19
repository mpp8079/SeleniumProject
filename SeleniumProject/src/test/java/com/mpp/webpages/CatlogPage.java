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
public class CatlogPage {
	private static WebElement element= null;
	
	
	public static WebElement Cartlinktxt(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='tdb1']/span[2]"));
		return element;
		
	}
	
	public static WebElement CategorisManlink(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='columnLeft']/div[1]/div[2]/a[1]/strong"));
		return element;
		
	}

}
