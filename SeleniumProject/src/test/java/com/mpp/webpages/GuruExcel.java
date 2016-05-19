package com.mpp.webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import jxl.Workbook;

public class GuruExcel {
	
	
	
	public void readExcel(String filePath, String fileName, String sheetName) throws Exception{
		
		File file = new File(filePath+"\\"+fileName);
		
		FileInputStream inputStream = new FileInputStream(file);			
		Workbook workbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx")){
			workbook = new XSSFWorkbook(inputStream);
		}
	}

}
