package assignment_on_pop_ups;

import java.awt.AWTException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_popup {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/upload  ");
		
		WebElement w1 = driver.findElement(By.id("file-upload"));
		File f=new File("./data/SUBHASH_EAF.docx");
		String abs = f.getAbsolutePath();
		w1.sendKeys(abs);
		driver.findElement(By.id("file-submit")).click();

}
}
