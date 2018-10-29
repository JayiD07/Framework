package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	// Invoke Browser

	public static WebDriver getBrowser(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KS\\Framework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}

	// Passing Values

	public static void passingValues(WebElement element, String name) {
		element.sendKeys(name);
	}

	// Click

	public static void clickMethod(WebElement element) {
		element.click();
	}

	// Reading values from Excel
	
public static String getData(int rownum, int cellnum) throws IOException {
	
	File f=new File("C:\\Users\\KS\\Sample\\excel\\sample.xlsx");
	FileInputStream str=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(str);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(rownum);
	Cell c = r.getCell(cellnum);
	int ct = c.getCellType();
	String name="";
	if(ct==1) {
		name = c.getStringCellValue();
	}
	if(ct==0)
	{
		if(DateUtil.isCellDateFormatted(c))
		{
			SimpleDateFormat form=new SimpleDateFormat("dd-MMM-yy");
			 name = form.format(c.getDateCellValue());
		}
		
		else
		{
			double d = c.getNumericCellValue();
			long l=(long) d;
			name = String.valueOf(l);
		}
	}
	
	return name;
	

}
	
	// Quit
	public static void quitApp(WebDriver driver) {
		driver.quit();
	}

}
