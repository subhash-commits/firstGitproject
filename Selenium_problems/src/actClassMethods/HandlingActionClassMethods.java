package actClassMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActionClassMethods {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.craftsvilla.com");
		
		WebElement saree = driver.findElement(By.xpath("//a[text()='SAREES']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(saree).perform();
		Thread.sleep(2000);
		WebElement cottonsaree = driver.findElement(By.xpath("(//a[text()='Cotton Sarees'])[1]"));
		act.contextClick(cottonsaree).perform();
		

}
}
