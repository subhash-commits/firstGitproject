package selenium_solutions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("ksai@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		String s = driver.getTitle();
		String s1 = "gmail";
		System.out.println(s.equalsIgnoreCase(s1));
		//String s2= driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).getAttribute("R");
		//System.out.println(s2);

}
}
