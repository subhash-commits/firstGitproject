package assignment_on_pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download_geckoWebDriver {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement w = driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/h3"));
		Point loc = w.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		js.executeScript("scrollBy("+x+","+y+")");
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a/div")).click();
		
		WebElement w1 = driver.findElement(By.xpath("/html/body/div[8]/h2"));
		Point loc1 = w1.getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		js.executeScript("scrollBy("+x1+","+y1+")");
		
		driver.findElement(By.xpath("//*[@id=\"browsersExpand\"]")).click();
		driver.findElement(By.xpath("/html/body/div[11]/p[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/div/p/a")).click();
		
		WebElement w2 = driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div[2]/div[1]/div/div[2]/div[2]/ul[4]/li[2]/p[2]/a"));
		Point loc2 = w2.getLocation();
		int x2 = loc2.getX();
		int y2 = loc2.getY();
		js.executeScript("scrollBy("+x2+","+y2+")");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div[2]/div[1]/div/div[2]/details/div/div/div[5]/a/span")).click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		
		r1.keyPress(KeyEvent.VK_RIGHT);
		r1.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(3000);
		
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		

}
}
