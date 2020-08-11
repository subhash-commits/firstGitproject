package selenium_solutions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUBHASH KALVAKOLU\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.getTitle();
//	driver.get("https://youtu.be/qz9tKlF431k");
	//driver.getPageSource();
	//driver.navigate().forward();
	//driver.get("https://facebook.com");
	//driver.navigate().back();
	//driver.navigate().refresh();
//	driver.navigate().to("https://www.amazon.com");
	driver.navigate().to("https://www.myntra.com");
//	driver.getTitle();
	//String s = driver.getPageSource();
	//System.out.println(s);
//	String s = driver.getTitle();
  //   System.out.println(s);
	String s2 = driver.getCurrentUrl();
	System.out.println(s2);
     String s3 = driver.getWindowHandle();
     System.out.println(s3);
   Set<String> s4 =  driver.getWindowHandles();
   System.out.println(s4);
  TargetLocator s5 = driver.switchTo();
  System.out.println(s5);
  driver.wait(10000);
	driver.close();


	}

}
