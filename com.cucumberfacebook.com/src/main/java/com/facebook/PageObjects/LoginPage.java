package com.facebook.PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.GenericMethods;

public class LoginPage extends GenericMethods {

	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(id = "u_0_b")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void setCredentials(String UN, String pw) {
		waitFor(username);
		waitFor(password);
		username.sendKeys(UN);
		password.sendKeys(pw);
	}

	public void login() {
		waitFor(loginbtn);
		loginbtn.click();
	}

}
