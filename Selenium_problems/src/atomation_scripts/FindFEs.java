package atomation_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFEs {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//List<WebElement> fes = driver.findElements(By.xpath("//a"));
		//or
		List<WebElement> fes1 = driver.findElements(By.tagName("a"));
		int count = fes1.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(fes1.get(i).getText());
		}
		
		for(WebElement e : fes1)
		{
			System.out.println(e.getText());
		}

	}

}
