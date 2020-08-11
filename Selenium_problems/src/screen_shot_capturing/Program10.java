package screen_shot_capturing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program10 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.craftsvilla.com");
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	//	File dest = new File("./snapshot/craftsvilla.png");
		File dest = new File("./snapshot/snapdeal.png");
		FileUtils.copyFile(src, dest);
		
	

}
}
