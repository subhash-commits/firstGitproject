package atomation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLocators {
	static WebDriver driver;
	
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    Thread.sleep(2000);
 //   driver = new FirefoxDriver();
    
   // driver.get("https://www.facebook.com");
	//driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("subhash");
	driver.findElement(By.id("pass")).sendKeys("7286965251");
	driver.findElement(By.cssSelector("#u_0_b")).click();
	
	}

}
