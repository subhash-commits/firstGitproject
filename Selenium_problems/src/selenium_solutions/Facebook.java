package selenium_solutions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("7286965251");
		driver.findElement(By.id("pass")).sendKeys("Ksubhash@5251");
		 WebElement lgnbtn = driver.findElement(By.id("loginbutton"));
		 WebElement end = driver.findElement(By.xpath("//span[text()=' Facebook © 2020']"));
		 
		highlight(lgnbtn,driver);
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("./snapshot/loginbutton.png"));
//		
		//alert(driver,"problem with login button");
		
		System.out.println(getTitlebyjs(driver));
		scrolltillDown(driver,end);
		scrolltillDownWithoutElements(driver);
		
		
	}
		public static void highlight(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='3px solid red'",element);
			js.executeScript("arguments[0].style.backgroundColor='yellow'",element);
		}
		
		
		public static void alert(WebDriver driver,String message)
		{
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("alert('"+message+"')");
		}
		
		public static void scrolltillDown(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		
		public static void scrolltillDownWithoutElements(WebDriver driver)
		{
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		}
		
		public static String getTitlebyjs(WebDriver driver)
		{
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		/*
		 * WebElement d1 = driver.findElement(By.id("day")); Select s1 = new Select(d1);
		 * s1.selectByIndex(20);
		 * 
		 * it is used to get no of items are present in object int count =
		 * s1.getOptions().size(); System.out.println(count);
		 * 
		 * WebElement d2 = driver.findElement(By.id("month")); Select s2 = new
		 * Select(d2); //System.out.println(s2.getFirstSelectedOption());
		 * //s2.selectByValue("2"); s2.selectByIndex(8);
		 * 
		 * WebElement d3 = driver.findElement(By.id("year")); Select s3 = new
		 * Select(d3); s3.selectByVisibleText("2015");
		 * System.out.println(s3.isMultiple());//to check whether it is accepting
		 * multiple values or not to get the values of the options
		 * //java.util.List<WebElement>a1 = s3.getOptions(); for(int
		 * i=0;i<=a1.size()-1;i++) { String d= a1.get(i).getText();
		 * System.out.print(d+" "); } int count1 = s3.getOptions().size();
		 * System.out.println(count1)
		 */;

	}


