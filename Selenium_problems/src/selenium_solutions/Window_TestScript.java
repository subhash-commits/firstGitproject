package selenium_solutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_TestScript {
	WebDriver driver;
	public void browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUBHASH KALVAKOLU\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to("https://www.myntra.com");
	 Thread.sleep(1000);
	}
	
	public void window() throws InterruptedException
	{
		System.out.println("the current url is :"+driver.getCurrentUrl());
		System.out.println("the title is :"+driver.getTitle());
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	public void search()
	{
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Window_TestScript ts = new Window_TestScript();
		ts.browser();
		ts.window();
		ts.search();

	}

}
