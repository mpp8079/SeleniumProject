package com.mpp.webpages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLink {
		
	public static  void testBrokenlink(WebDriver driver){
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link is :"+link.size());
		
		for(int i=0;i<link.size();i++){
			
			WebElement ele = link.get(i);
			String urllink = ele.getAttribute("href");
		}
		
	}
	
		public static void verifyActivelink(String links){
			try {
				URL url = new URL(links);
				
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				
				if(connection.getResponseCode()==200){
					System.out.println(links +"---"+connection.getResponseMessage());
				}if(connection.getResponseCode()==connection.HTTP_NOT_FOUND){
					System.out.println(links +"---"+connection.getResponseMessage());
				
			} }catch (Exception exceptionn) {
				
			}
			
		
		}
}	

