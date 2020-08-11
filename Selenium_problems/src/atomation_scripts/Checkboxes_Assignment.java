package atomation_scripts;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_Assignment {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\SUBHASH KALVAKOLU\\Capgemini\\day-6\\Demo.html");
	List<WebElement> var = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	int count = var.size();
	System.out.println(count);
	//clicking the checkboxes from bottom
	/*for(int i=count-1;i>=0;i--)
	{
		var.get(i).click();
		Thread.sleep(2000);
	}*/
	//clicking the checkboxes of even places
	/*for(int i=0;i<count;i=i+2)
	{
		var.get(i).click();
		Thread.sleep(2000);
	}*/
	//clicking the chechboxes of odd places
	/*for(int i=1;i<count;i=i+2)
	{
		var.get(i).click();
		Thread.sleep(2000);
	}*/
	
	//clicking the checkboxes of non duplicates
	for(int i=0;i<=var.size()-1;i++)
	{
		int sum=0;
		for(int j=0;j<=var.size()-1;j++)
		{
			if(var.get(i).getAttribute("id").equals(var.get(j).getAttribute("id")))
			{
				sum++;
			}
		}
		
		if(sum==1)
		{
			var.get(i).click();
			Thread.sleep(1000);
			System.out.println(var.get(i).isSelected());
			
		}
	}
	
	//clicking the checkboxes of duplicates only
		/*for(int i=0;i<=var.size()-1;i++)
		{
			int sum=0;
			for(int j=0;j<=var.size()-1;j++)
			{
				if(var.get(i).getAttribute("id").equals(var.get(j).getAttribute("id")))
				{
					sum++;
				}
			}
		if(sum>1)
		{
			var.get(i).click();
			System.out.println(var.get(i).isSelected());
			
		}
}*/

		}
	
}
	
