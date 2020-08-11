package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandlingGridDemo {
		
		
		@Test
		@Parameters({"nodeURL","browserName"})
		public void demoGrid(String nodeURL,String browserName) throws MalformedURLException, InterruptedException
		{
			//creating an object of URL class and passing the url in the constructor
			URL url=new URL(nodeURL);
			DesiredCapabilities ds=new DesiredCapabilities();
			ds.setBrowserName(browserName);
			WebDriver driver=new RemoteWebDriver(url, ds);
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			WebElement var = driver.switchTo().activeElement();
			var.sendKeys("selenium grid");
			var.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.close();
		}
		
		

	}

