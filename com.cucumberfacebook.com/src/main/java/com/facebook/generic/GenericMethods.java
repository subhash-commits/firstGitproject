package com.facebook.generic;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods extends SetUp {

	/**
	 * Reads data from specified cell in a specified WorkBook Sheet
	 * 
	 * @param path @param sheetname @param row @param cell @return @throws
	 * EncryptedDocumentException @throws IOException @throws
	 */
	public String getExcelData(String path, String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	/**
	 * it will takes checks for the web element
	 * @param element
	 */
	public void waitFor(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

/**
 * it waits the execution for a given time
 * @param i
 * @throws InterruptedException
 */

	public void waitInSeconds(int i) throws InterruptedException {
		Thread.sleep(i * 1000);
	}
/**
 * it will verify the title
 * @param expectedTitle
 */
	public void pageToLoad(String expectedTitle) {
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}

}
