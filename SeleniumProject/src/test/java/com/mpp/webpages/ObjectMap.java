/**
 * 
 */
package com.mpp.webpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;

/**
 * @author SHREEJI
 *
 */
public class ObjectMap {
	
	Properties pro;
	
	public ObjectMap(String mapFile) {
		pro = new Properties();
		try {
			FileInputStream master = new FileInputStream(mapFile);
			pro.load(master);
			master.close();
		} catch (Exception e) {
			System.out.println("File not find exception:  "+e.getMessage());
		}		
	}
	
	
	public By getLocator(String ElementName) throws Exception{
		String Locator = pro.getProperty(ElementName);
		String LocatorType = Locator.split(":")[0];
		String LocatorValue = Locator.split(":")[1];
		
		if(LocatorType.toLowerCase().equals("id"))
			return By.id(LocatorValue);
		
		else if (LocatorType.toLowerCase().equals("name"))
			return By.name(LocatorValue);
		
		else if ((LocatorType.toLowerCase().equals("className")) || (LocatorType.toLowerCase().equals("class")))
			return By.className(LocatorValue);
		else if ((LocatorType.toLowerCase().equals("tagName")) || (LocatorType.toLowerCase().equals("tag")))
			return By.tagName(LocatorValue);
		else if ((LocatorType.toLowerCase().equals("linktext")) || (LocatorType.toLowerCase().equals("link")))
			return By.linkText(LocatorValue);
		
		else if (LocatorType.toLowerCase().equals("partialinktext"))
			return By.partialLinkText(LocatorValue);
		
		else if ((LocatorType.toLowerCase().equals("cssselector")) || (LocatorType.toLowerCase().equals("css")))
			return By.cssSelector(LocatorValue);
		
		else if (LocatorType.toLowerCase().equals("xpath"))
			return By.xpath(LocatorValue);
	
		else throw new Exception("Locator Type "+LocatorType +"not defiend");
	}
	
	

}
