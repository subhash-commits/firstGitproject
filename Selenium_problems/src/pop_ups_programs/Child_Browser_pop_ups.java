package pop_ups_programs;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Child_Browser_pop_ups {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	//	System.out.println(driver.getWindowHandles());
		Set<String> whs = driver.getWindowHandles();
		Iterator<String> it = whs.iterator();
		String home = it.next();
		String child1 = it.next();
		String child2 = it.next();
		
		driver.switchTo().window(child1).close();
		driver.switchTo().window(child2).close();
		driver.switchTo().window(home);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("allow")));
		driver.switchTo().window(home);
		driver.findElement(By.id("allow")).click();
		

}
}
