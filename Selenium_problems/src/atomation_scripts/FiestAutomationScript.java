package atomation_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiestAutomationScript {
	static
	{
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		
	WebDriver driver;

		driver = new ChromeDriver();
	
		driver = new FirefoxDriver();
		
		driver = new EdgeDriver();

	}

}
