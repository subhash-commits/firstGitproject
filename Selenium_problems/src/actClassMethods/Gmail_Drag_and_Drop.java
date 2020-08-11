package actClassMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_Drag_and_Drop {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	//WebElement var = driver.findElement(By.xpath("//a[text()='Sign in']"));
	//var.click();
		
		WebElement var = driver.findElement(By.xpath("//a[text()='Gmail']"));
				
			    var.click();
			   WebElement d = driver.findElement(By.xpath("(//a[@class=\"h-c-header__nav-li-link \"])[4]"));
			   d.click();
		
WebElement w1 =	driver.findElement(By.xpath("(//div[@class='aCsJod oJeWuf'])[1]"));
w1.sendKeys("kalvakolusubhash@gmail.com"+Keys.ENTER);
	//Actions act = new Actions(driver);
	//WebElement var1 = driver.findElement(By.xpath("//span[text()='Next']"));
	//var1.click();
	
/*	Thread.sleep(4000);
	driver.navigate().refresh();
	driver.findElement(By.id("identifierId")).sendKeys("kalvakolusubhash@gmail.com");
	WebElement var11 = driver.findElement(By.xpath("//span[text()='Next']"));
	var11.click();
	
	//act.moveToElement(var1).perform();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement var = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//driver.get("https://www.gmail.com");
	   // var.click();
	 //  WebElement d = driver.findElement(By.xpath("(//a[@class=\"h-c-header__nav-li-link \"])[4]"));
	   // d.click();
	    //Thread.sleep(2000);
	   // driver.switchTo().activeElement().sendKeys("subhash@gmail.com");
	    //Thread.sleep(2000);
	    //driver.close();
	    
	    
	    
	    
		//WebElement var1 = driver.findElement(By.xpath("//tr[@class=\"zA zE x7\"]"));
		//WebElement var2 = driver.findElement(By.xpath("//a[.='Starred']"));
		//Actions act = new Actions(driver);
		//act.dragAndDrop(var1, var2).perform();
		
		
		
		
		
		
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("subhash@gmail.com");
		//driver.switchTo().activeElement().sendKeys("subhash@gmail.com");
		//WebElement d = driver.findElement(By.xpath("//span[.='Next']"));
		//d.click();

}
}
