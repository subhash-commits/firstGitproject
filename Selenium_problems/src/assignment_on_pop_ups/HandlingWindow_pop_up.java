package assignment_on_pop_ups;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindow_pop_up {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("C:\\Users\\SUBHASH KALVAKOLU\\Capgemini\\Day-8\\upload.html");
		WebElement uploadBtn = driver.findElement(By.id("i1"));
		Actions act = new Actions(driver);
		act.click(uploadBtn).perform();
		File f=new File("C:\\Users\\SUBHASH KALVAKOLU\\Capgemini\\autoit.exe");
		Runtime.getRuntime().exec(f.getAbsolutePath());
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("C:\\Users\\SUBHASH KALVAKOLU\\Capgemini\\autoit.exe");	
	}

}
