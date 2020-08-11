package selenium_solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLearn {
WebDriver driver;

public void browser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUBHASH KALVAKOLU\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.myntra.com");
}

public void search()
{
	
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1")).sendKeys("kalvakolu subhash");
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/input[1]")).sendKeys("7286965251");
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[4]")).submit();
driver.findElement(By.className("desktop-searchBar")).sendKeys("mobile phones");
WebElement search = driver.findElement(By.className("myntraweb-sprite desktop-iconSearch sprites-search"));
search.click();	
}

	public static void main(String[] args) {
		SimpleLearn sl = new SimpleLearn();
		sl.browser();
		sl.search();

	}

}
