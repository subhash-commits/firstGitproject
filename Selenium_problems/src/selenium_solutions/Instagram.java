package selenium_solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		

	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUBHASH KALVAKOLU\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		
	 driver.findElement(By.name("username")).sendKeys("kaluvakolu subhash"+Keys.TAB+"Subahsh"+Keys.ENTER);
     // driver.findElement(By.name("password")).sendKeys("4Subhash");
     
      
       
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[4]")).click();
		
	
	} 
	}

