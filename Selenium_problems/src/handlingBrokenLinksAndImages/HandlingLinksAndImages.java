package handlingBrokenLinksAndImages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingLinksAndImages {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("7286965251");
		driver.findElement(By.id("pass")).sendKeys("Subhash@1");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		System.out.println(images.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		List<WebElement> activeimages = new ArrayList<WebElement>();
		for(int i=0;i<=links.size()-1;i++)
		{
			if(links.get(i).getAttribute("href")!=null)
			{
				activelinks.add(links.get(i));
			}
		}
		System.out.println(activelinks.size());
	
		for(int i=0;i<=images.size()-1;i++)
		{
			if(images.get(i).getAttribute("src")==null)
			{
				activeimages.add(images.get(i));
			}
		}
		System.out.println(activeimages.size());
		
		for(int i=0;i<=activelinks.size()-1;i++)
		{
			 HttpURLConnection connection = ( HttpURLConnection) new URL(activelinks.get(i).getAttribute("href")).openConnection();
			 connection.connect();
			 String message = connection.getResponseMessage();
			 connection.disconnect();
			 System.out.println(activelinks.get(i).getAttribute("href")+"----->"+message);		
			
		}
		
	}

}
