package com.Abhibus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Abhibus.Base.TestBase;

public class LoginPage extends TestBase {  
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_b")
	private WebElement loginbtn;
	@FindBy(xpath="//i[@class=\"fb_logo img sp_R3u_6E07bqo_1_5x sx_7201e2\"]")
	private WebElement FacebookLogo;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public String VerifyBeforeLoginTitle()
	{
		return driver.getTitle();
	}
	
	public boolean VerifyFaceBookLogo()
	{
		return FacebookLogo.isDisplayed();
	}
	public void setCredentials(String username1,String password1) {
		username.sendKeys(username1);
		password.sendKeys(password1);
		loginbtn.click();	
	}
	public String VerifyAfterLoginTitle()
	{
		return driver.getTitle();
	}

}


