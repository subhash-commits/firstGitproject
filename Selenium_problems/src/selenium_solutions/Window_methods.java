package selenium_solutions;

import java.awt.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUBHASH KALVAKOLU\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
		// driver.manage().window().fullscreen();//it will restore to fullscreen automatically
		// driver.wait(1000);
		//System.out.println(s);
		 Thread.sleep(1000);
		driver.close();

	}

}
