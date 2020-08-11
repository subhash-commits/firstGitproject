package HandlingDates;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ByUsingDropDown {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");

		String date = "15-Aug-1996";
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		WebElement forDay = driver.findElement(By.id("day"));
		WebElement forMonth = driver.findElement(By.id("month"));
		WebElement forYear = driver.findElement(By.id("year"));
		Select select = new Select(forDay);
		select.selectByVisibleText(day);
		Select select1 = new Select(forMonth);
		select1.selectByVisibleText("Aug");
		Select select11 = new Select(forYear);
		select11.selectByVisibleText(year);
		System.out.println(datearr[0]);

	}

}
