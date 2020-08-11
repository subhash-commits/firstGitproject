package handleFrames;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

	public class Frames {

		@Test
		public void testFrame() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			/**
			 * HtmllUnitDriver is nothing but a headless browser or ghost brower
			 * earlier it is a part of selenium but not from selenium 3.0
			 * due to this we cannot see the execution the only output we can see
			 * performance of test cases will be increased.
			 */
			WebDriver driver = new HtmlUnitDriver();
			
		    driver.get("https://www.google.com");
		    System.out.println(driver.getTitle());
			/*
			 * driver.findElement(By.id("username")).sendKeys("sagar"); WebElement p =
			 * driver.findElement(By.id("password")); p.sendKeys("nag");
			 * 
			 * WebElement frameElement =
			 * driver.findElement(By.xpath("//iframe[@title='i_frame']"));
			 * driver.switchTo().frame(2); //
			 * driver.switchTo().frame("ID or name Attribute value"); //
			 * driver.switchTo().frame(WEbElement); //driver.switchTo().frame(frameElement);
			 * 
			 * driver.findElement(By.id("deptInfo")).sendKeys("Automation"); //
			 * driver.switchTo().parentFrame(); driver.switchTo().defaultContent();
			 * 
			 * p.clear();
			 * 
			 * 
			 * Thread.sleep(5000);
			 */
		}
		
		

	}


