package atomation_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoWebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.naukri.com");
		
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
		driver.manage().window().maximize();
		
		//get the current url
	   String s =	driver.getCurrentUrl();
	   System.out.println(s);
	
	   //to get the code of pagesource
	   //System.out.println(driver.getPageSource());
	
	   //to get the title
	    System.out.println(driver.getTitle());
	
		//driver.manage().window().fullscreen();
		//navigate().to() --> to enter the URL
	    
		driver1.navigate().to("https://www.craftsvilla.com");
	
		Thread.sleep(2000);
		//to back
		//.navigate().back();
	   //Thread.sleep(2000);
		
		//to forward
		//driver.navigate().forward();
		//Thread.sleep(2000);
		
		//to refresh
	    //driver.navigate().refresh();
		
		
		//driver.close();
		Thread.sleep(2000);
		driver.quit();
		driver1.quit();
		
		}
	}

