package handlingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notepad {
	
	public static void main(String[] args)  throws IOException 
	{
		WebDriver driver;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./data/data.properties.txt");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		String url = prop.getProperty("url");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();	
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.firefox.driver","./driver/firefoxdriver.exe");
			driver = new FirefoxDriver();	
		}
		else
		{
			System.setProperty("webdriver.edge.driver","./driver/edgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("phoneno"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("loginbutton")).click();
		}
	}


