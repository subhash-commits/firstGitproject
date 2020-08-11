package atomation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement var = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(var.isEnabled());
		System.out.println(driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed());
		System.out.println(var.getAttribute("type"));
		var.sendKeys("selenium");
		Thread.sleep(3000);
		var.clear();
		Thread.sleep(3000);
		var.sendKeys("selenium");
		var.sendKeys(Keys.ENTER);
		//var.click();
		//System.out.println(var.getAttribute("type"));
		
		
		
	}

}
