package assignment_on_pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazon_pop_up {
	
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("men shirts");
		System.out.println(driver.getWindowHandles());
		Thread.sleep(10000);
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Thread.sleep(20000);
		 Set<String> set = driver.getWindowHandles();
		 Iterator<String> it = set.iterator();
		String home = it.next();
		String child = it.next();
	 driver.switchTo().window(child);	
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(home);
		System.out.println(driver.getWindowHandles());
}
}
