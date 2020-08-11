package atomation_scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoruntimpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter browser ? GC / FC");
		String browser  = sc.next();
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("GC"))
				{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
				}
		else if(browser.equalsIgnoreCase("FC"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid data");
		}
		driver.get("https://www.google.com");
	}

}
