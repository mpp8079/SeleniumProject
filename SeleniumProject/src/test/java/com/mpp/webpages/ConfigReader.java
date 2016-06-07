/**
 * 
 */
package com.mpp.webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author SHREEJI
 *
 */
public class ConfigReader {
	
	Properties pro;
	public ConfigReader() {
		try {
		File src = new File(".\\Configration\\Property.property");		
		FileInputStream file = new FileInputStream(src);
		pro = new Properties();
		pro.load(file);			
		} catch (Exception e) {
			System.err.println("File not found exception=="+e.getMessage());
		} 
		
	}

	public String getChromeDriver(){
		return pro.getProperty("ChromeDriver");
		
	}
	
	
	public String getIEDriver(){
		return pro.getProperty("IEDriver");
		
	}
	
	public String getApplicationURL(){
		return pro.getProperty("Url");
		
	}
	
	public String getUsername(){
		return pro.getProperty("username");
		
	}
	
	public String getpassword(){
		return pro.getProperty("password");
		
	}
}
