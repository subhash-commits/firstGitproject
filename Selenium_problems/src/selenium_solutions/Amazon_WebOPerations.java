package selenium_solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_WebOPerations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung ear earphones original");
		Thread.sleep(2000);
		driver.findElement(By.className("nav-input")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='p_n_is_cod_eligible/4931671031']//i[@class='a-icon a-icon-checkbox']")).click();
	boolean d1 = driver.findElement(By.xpath("//li[@id='p_n_is_cod_eligible/4931671031']//i[@class='a-icon a-icon-checkbox']")).isSelected();
		System.out.println(d1);
		
		Thread.sleep(2000);
		driver.navigate().to("https://edureka.co/blog");
		Thread.sleep(2000);
		driver.navigate().back();

	}

}
