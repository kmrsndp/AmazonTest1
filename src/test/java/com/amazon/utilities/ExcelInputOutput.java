package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ExcelInputOutput {
	
    
    WebDriver driver;
    String ExcelIOFilePath = "../MavenTest/src/test/java/amazon/com/config/SeleniumInput.xlsx";
	File file = new File(ExcelIOFilePath);
	String SheetName = "Data";
	String url;
	String userName;
	String password;
	String searchItemLaptop;
	String searchItemKeyBoard;
	
	public void excelRead() throws Exception {
		
	FileInputStream inputStream = new FileInputStream(file);
	XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
	XSSFSheet sheet = workBook.getSheet(SheetName);
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell = row.getCell(1);
		
	url = cell.getStringCellValue();
	userName = workBook.getSheet(SheetName).getRow(1).getCell(1).getStringCellValue();
	password = workBook.getSheet(SheetName).getRow(2).getCell(1).getStringCellValue();
	searchItemLaptop = workBook.getSheet(SheetName).getRow(3).getCell(1).getStringCellValue();
	searchItemKeyBoard = workBook.getSheet(SheetName).getRow(4).getCell(1).getStringCellValue();
	}

	public String getUrl() throws Exception {
		excelRead();
		return url;
	}
	public String getUserName() throws Exception {
		excelRead();
		return userName;
	}
	public String getPassword() throws Exception {
		excelRead();
		return password;
	}
	public String getsearchItemLaptop() throws Exception {
		excelRead();
		return searchItemLaptop;
	}
	public String getsearchItemKeyBoard() throws Exception {
		excelRead();
		return searchItemKeyBoard;
	}
	
	public void writeDataToExcel() {
		
		
	}
}
    
    
