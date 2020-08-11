package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement username;
	private WebElement password;
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		username = driver.findElement(By.id("email"));
		password = driver.findElement(By.id("pass"));
		loginbtn = driver.findElement(By.id("u_0_b"));	
	}


	public void setCredentials(String UN,String pw) {
		username.sendKeys(UN);
		password.sendKeys(pw);
	}
	
	public void login()
	{
		loginbtn.click();
	}


	
	
	
	

}
