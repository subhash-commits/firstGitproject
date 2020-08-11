package selenium_solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.linkText("Images")).click();
	    WebElement w2 =  driver.findElement(By.cssSelector("input[class*='gsfi']"));
	    w2.sendKeys("justin");
	    w2.submit();
		Thread.sleep(10000);
		WebElement w1 = driver.findElement(By.name("q"));
		w1.sendKeys("justin bieber");
	w1.submit();
	driver.findElement(By.cssSelector("div[jsname*='Cj4MSe']")).click();
	Thread.sleep(20000);
	
//	System.out.println(driver.findElement(By.linkText("Gmail")).isSelected());
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/div[2]/div[1]/div[1]/button[1]/div[1]/span[1]/*[local-name()='svg'][1]")).click();
	//	driver.findElement(By.name("q")).sendKeys("mobile phones");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[3]/center[1]/input[1]")).click();
		
		
		
		
		
	}

}
