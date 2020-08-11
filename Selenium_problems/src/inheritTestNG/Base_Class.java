package inheritTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Base_Class {
	public static WebDriver driver;
	
	/**
	 * @Beforesuite,@AfterSuite,@BeforeTest,@AfterTest,@BeforeClass,@Afterclass will execute only once with any no of test cases in a single file
	 * 
	 */
	
	/**
	 * But @Beforemethod,@Aftermethod will execute for each and every test case in a single file
	 */
	
	@BeforeSuite
	public void document()
	{
		System.out.println("generate tha project document");
	}
	@BeforeTest
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("open the application");
	}
	@Test(description="verifying gmail link")
	public void gmailLink()
	{
		driver.findElement(By.linkText("Gmail")).click();
	}
	@Test(description="verifying Images link")
	public void imagesLink()
	{
		driver.findElement(By.linkText("Images")).click();
	}
	@Test(description="verifying google logo")
	public void googleLogo() throws InterruptedException
	{
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
//		SoftAssert sa = new SoftAssert();
//		sa.assertTrue(b);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void close()
	{
		System.out.println("close the application");
		driver.close();
	}
	@AfterSuite
	public void report()
	{
		System.out.println("excel report is generated");
	}
}
