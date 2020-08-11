package javaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.craftsvilla.com");
		//driver.manage().window().maximize();
		
		WebElement tillsuits = driver.findElement(By.xpath("//img[@title='Suits']"));
		Point loc = tillsuits.getLocation();
		int x = loc.getX();
		int y =loc.getY();
		//explicit type casting to javascriptexecutor from Webdriver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeAsyncScript("scrollBy("+x+","+y+")");
		js.executeScript("scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		driver.close();
		
		
}
}
