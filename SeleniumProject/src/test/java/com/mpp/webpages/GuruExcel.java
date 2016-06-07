package com.mpp.webpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;

public class GuruExcel {
	

	@Test
	public static void testDataTest(){
		
		try {
			FileInputStream file = new FileInputStream("c:\\local\\Book.xls");
			HSSFWorkbook w = new HSSFWorkbook(file);
			HSSFSheet s = w.getSheet("data");
			System.out.println(s);
			
			for(int count=0;count<s.getLastRowNum();count++){
				HSSFRow row = s.getRow(count);
				testRun(row.getCell(1).toString(),row.getCell(2).toString());
			}
		} catch (Exception exception) {
			
		}
		
		
	}
	
	public static void testRun(String strSearchString, String strPageTitle){
		WebDriver driver ;
		String url="https://www.google.com/";
		driver = new FirefoxDriver();
		driver.get(url);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(strSearchString);
		element.submit();
		
		if(driver.getTitle().equals(strPageTitle)){
			System.out.println("As expected");
			
		}else {
			System.out.println("Not as Expected");
		}
		
		driver.quit();
	}

}
