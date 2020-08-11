package com.Abhibus.TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.IllegalFormatException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Abhibus.Base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\SUBHASH KALVAKOLU"+"\\com.AbhiBus.project\\data\\facebookdata.xlsx";

	static Workbook book;
	static Sheet sheet;

	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	/*
	 * public static String readData() throws IOException { String v = null;
	 * FileInputStream fis = new FileInputStream("./data/facebookdata.xlsx");
	 * //creating this page for excel sheet Workbook w =
	 * WorkbookFactory.create(fis); Sheet s = w.getSheet("subhash");
	 * System.out.println(s.getLastRowNum()); for(int i=0;i<=s.getLastRowNum();i++)
	 * { Row r = s.getRow(i); // System.out.println(r.getLastCellNum()); for(int
	 * j=0;j<r.getLastCellNum();j++) { Cell c = r.getCell(j);
	 * System.out.print(c.toString()+"||"); v=c.toString(); }
	 * System.out.println("");
	 * 
	 * } return v; }
	 */
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IllegalFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		
		  for(int i=0;i<sheet.getLastRowNum();i++) 
		  {
			  Row r = sheet.getRow(i); //
		  System.out.println(r.getLastCellNum());
		  
		  for(int j=0;j<r.getLastCellNum();j++)
		  {
			  Cell c = r.getCell(j);
		  data[i][j]=c.toString();
		  
		  System.out.print(c.toString()+"||");
		  }
		  }
		 
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i).getCell(k).toString();
//				// System.out.println(data[i][k]);
//			}
//		}
		return data;
	}


	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
