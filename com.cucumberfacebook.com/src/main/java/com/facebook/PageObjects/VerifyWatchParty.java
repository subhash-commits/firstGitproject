package com.facebook.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.GenericMethods;

public class VerifyWatchParty extends GenericMethods {
/**
 * Declaration of elements
 */
	@FindBy(xpath = "//div[@aria-label=\"More\"]")
	private WebElement more;
	@FindBy(xpath = "//span[text()='Watch Party']")
	private WebElement watchPartyIcon;
	@FindBy(xpath = "//div[contains(@aria-label,'checkbox')]")
	private WebElement CheckBoxes;
	@FindBy(xpath = "//div[@aria-label=\"Next\"]")
	private WebElement nextButton;
	@FindBy(xpath = "//div[text()='Add Bio']")
	private WebElement scroll;
/**
 * To initialize the elements
 * @param driver
 */
	public VerifyWatchParty(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
/**
 * to click on more button
 */
  public void moreButton() {
		more.click();
	}
 /**
  * to click on watch party
  */
	public void WatchIcon() {
		waitFor(watchPartyIcon);
		watchPartyIcon.click();
	}
/**
 * Click on check boxes
 */
	public void CheckBoxes() {
		List<WebElement> var = CheckBoxes.findElements(By.xpath("//div[contains(@aria-label,'checkbox')]"));
		System.out.println(var.size());
		for (WebElement we : var) {
			we.click();
		}
	}
/**
 * click on next button
 */
	public void NextButton() {
		nextButton.click();
	}
	
}