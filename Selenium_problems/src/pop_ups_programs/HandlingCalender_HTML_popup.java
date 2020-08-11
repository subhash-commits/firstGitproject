package pop_ups_programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCalender_HTML_popup {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/policies/instantpay/renew");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("scrollBy(0,200)");
		WebElement polnum = driver.findElement(By.id("policyNumber"));
		polnum.sendKeys("i dont know");
		driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
		
		
		
		
		

}
}
