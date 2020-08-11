package assignment_on_pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CraftsVilla_popup {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		//To mouse hover on the sarees
		WebElement saree = driver.findElement(By.xpath("//a[text()='SAREES']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(saree).perform();
		Thread.sleep(2000);
		//To click on the cotton sarees
		WebElement cotton_sar = driver.findElement(By.xpath("(//a[text()='Cotton Sarees'])[1]"));
		Thread.sleep(2000);
		cotton_sar.click();
		//To click on the imgae of the product
		driver.findElement(By.xpath("(//img[@title=\"Off White Color ...\"])[1]")).click();
		Thread.sleep(2000);
		//To add to cart
		driver.findElement(By.id("addtocart")).click();
		Thread.sleep(2000);
		//To click on the remove button
		driver.findElement(By.id("open-remove-item-modal")).click();
		Thread.sleep(3000);
		//To handle the remove pop up
		driver.findElement(By.id("remove-item-btn")).click();
	}
}