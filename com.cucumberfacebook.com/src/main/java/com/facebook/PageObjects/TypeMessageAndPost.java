package com.facebook.PageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.GenericMethods;

public class TypeMessageAndPost extends GenericMethods {
	
	@FindBy(xpath = "//div[@class='m9osqain a5q79mjw']")
	private WebElement textarea;
	@FindBy(xpath="//div[@aria-describedby=\"placeholder-4iktd\"]")
	private WebElement TypeMessage;
	@FindBy(xpath="//div[@class=\"ihqw7lf3 discj3wi l9j0dhe7\"]")
	private WebElement ClickPost;
	@FindBy(xpath="//div[@aria-label=\"Emoji\"]")
	private WebElement emoji;
	@FindBy(xpath="//img[contains(@src,'1f619')]")
	private WebElement emojiSymbol;
	@FindBy(xpath="//img[@src=\"/images/composer/SATP_Aa_square-2x.png\"]")
	private WebElement BackgroundStyle;
	@FindBy(xpath="(//div[@class=\"j0d6stlx ue3kfks5 pw54ja7n uo3d90p7 l82x9zwi k7cz35w2 bsnbvmp4\"])[1]")
	private WebElement Style;
	@FindBy (xpath="//div[@aria-label=\"Tag Friends\"]")
	private WebElement tagFriends;
	@FindBy(xpath="(//span[text()='Chenna Rao'])[2]")
	private WebElement friend;
	@FindBy(xpath="//input[@placeholder=\"Search for friends\"]")
	private WebElement SearchFriends;
	@FindBy (xpath="//span[text()='Done']")
	private WebElement done;
	@FindBy (xpath="//img[contains(@src,'yE2AX_tcGi5')]")
	private WebElement privacy;
	@FindBy (xpath="//span[text()='Anyone on or off Facebook']")
	private WebElement Public;
	@FindBy(xpath="//div[@aria-label=\"Check In\"]")
	private WebElement checkInIcon;
	@FindBy(xpath="//input[@placeholder=\"Where are you?\"]")
	private WebElement CheckIn_SearchBar;
	@FindBy(xpath="//div[@aria-label=\"Feeling/Activity\"]")
	private WebElement feelingActivity_icon;
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	private WebElement feelingsSearchBar;
	@FindBy(xpath="//a[@aria-label=\"Subhash Kalvakolu's Timeline\"]")
	private WebElement timeline;
	@FindBy(xpath="//div[@class='j83agx80 l9j0dhe7']")
	private WebElement dropdown;
	@FindBy (xpath="//div[@class=\"aov4n071\"]")
	private WebElement profile;
	@FindBy(xpath = "//div[text()='Add Bio']")
	private WebElement scroll;
	@FindBy(xpath="(//div[@aria-label=\"Actions for this post\"])[1]")
	private WebElement deleteMenu;
	@FindBy(xpath="//span[text()='Delete post']")
	private WebElement deletePost;

	
	public TypeMessageAndPost(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public void CreatePost() throws InterruptedException {
		waitFor(textarea);
		textarea.click();
		waitInSeconds(9);
	}
	public void TypeMessage(String message)
	{
	waitFor(TypeMessage);
    TypeMessage.click();
    TypeMessage.sendKeys(message);

	} 
	public void ClickPost()
	{
		System.out.println(ClickPost.isEnabled());
		waitFor(ClickPost);
		ClickPost.submit();
	}
	public void Emoji()
	{
		System.out.println(emoji.isDisplayed());
		waitFor(emoji);
		emoji.click();
		System.out.println(emojiSymbol.isDisplayed());
		waitFor(emojiSymbol);
		emojiSymbol.click();
	}
	public void BackgroundStyles()
	{
		waitFor(BackgroundStyle);
		BackgroundStyle.click();
	    waitFor(Style);
		Style.click();
	}
	
	public void SetPrivacy()
	{
		waitFor(privacy);
		privacy.click();
		waitFor(Public);
		Public.click();
	}
	
	public void SearchFriends(String name) throws InterruptedException
	{ 
		waitFor(tagFriends);
		tagFriends.click();
		SearchFriends.sendKeys(name);
	    Thread.sleep(3000);
		SearchFriends.sendKeys(Keys.ARROW_DOWN);
		SearchFriends.sendKeys(Keys.ENTER);
		//subhash.click();
		waitFor(done);
		done.click();
	}
	
	public void VerifyCheckIn(String location) throws InterruptedException
	{
		waitFor(checkInIcon);
	checkInIcon.click();
	waitFor(CheckIn_SearchBar);
	CheckIn_SearchBar.sendKeys(location);
	CheckIn_SearchBar.sendKeys(Keys.ARROW_DOWN);
	CheckIn_SearchBar.sendKeys(Keys.ENTER);
	
	}
	public void feeling(String feeling) throws InterruptedException
	{
		waitFor(feelingActivity_icon);
		feelingActivity_icon.click();
		waitFor(feelingsSearchBar);
		feelingsSearchBar.sendKeys(feeling);
		feelingsSearchBar.sendKeys(Keys.ARROW_DOWN);
		feelingsSearchBar.sendKeys(Keys.ENTER);
	}
	
	public void Timeline()
	{
		dropdown.click();
		profile.click();
	}
public void scrolling() {
		
		Point loc = scroll.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(" + x + "," + y + ")");

	}
}
