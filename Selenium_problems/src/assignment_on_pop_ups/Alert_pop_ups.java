package assignment_on_pop_ups;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_ups {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver;
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
		//driver.findElement(By.id("confirmBox")).click();
		// WebElement w = driver.findElement(By.id("promptBox"));
				// w.click();
		//	System.out.println(w.getAttribute("href"));
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("subhash");
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		String handle_1 = "subhash";
		driver.switchTo().window(handle_1);
		
}
}
