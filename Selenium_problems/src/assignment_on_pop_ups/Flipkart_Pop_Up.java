package assignment_on_pop_ups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Pop_Up {
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		WebElement var = driver.findElement(By.name("q"));
		var.sendKeys("samsung mobiles");
		var.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Samsung Galaxy A21s (Black, 64 GB)']")).click();
		
		 Set<String> set = driver.getWindowHandles();
		 Iterator<String> it = set.iterator();
		String home = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='ADD TO CART']")));
	   
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//div[.='Remove']")).click();
		driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
		driver.switchTo().window(home);
		
		

}
}
