package stepDefinitionFiles;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;

import com.facebook.PageObjects.LoginPage;
import com.facebook.PageObjects.TypeMessageAndPost;
import com.facebook.PageObjects.VerifyWatchParty;
import com.facebook.generic.GenericMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends GenericMethods {
	
	LoginPage login = new LoginPage(driver);
	TypeMessageAndPost post = new TypeMessageAndPost(driver);
	VerifyWatchParty watch = new 	VerifyWatchParty(driver);
	
	@Given("^browser is opened$")
	public void browser_is_opened() throws Throwable {
		System.out.println("Chrome Browser is opened");
	   
	}

	@Given("^Application is loaded$")
	public void application_is_loaded() throws Throwable {
		System.out.println("Facebook Application is loaded");
	   
	}

	@When("^the user enters the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_valid_and(String data1, String data2) throws Throwable {
		login.setCredentials(data1, data2);
		 
	}

	@When("^the user clicks on Login button$")
	public void the_user_clicks_on_Login_button() throws Throwable {
		login.login();
	    
	}
	@Then("^HomePage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		String str=driver.getTitle();
		System.out.println(str);
		
	   
	}
	@When("^the user clicks on CreatePost$")
	public void the_user_clicks_on_CreatePost() throws Throwable {
		 post.CreatePost();
		 waitInSeconds(5);
	}
	@When("^the user clicks on Textarea and Write \"([^\"]*)\"$")
	public void the_user_clicks_on_Textarea_and_Write(String message) throws Throwable {
	   post.TypeMessage(message);
	}

	@When("^user click on emoji icon and select one emoji symbol to Post$")
	public void user_click_on_emoji_icon_and_select_one_emoji_symbol_to_Post() throws Throwable {
		post.Emoji();
		waitInSeconds(3);
	   
	}

	@When("^user clicks on BackgroundStyles and add backgroound style to post$")
	public void user_clicks_on_BackgroundStyles_and_add_backgroound_style_to_post() throws Throwable {
	   post.BackgroundStyles();
	}
	@When("^user clicks on TagFriends and tag one of the \"([^\"]*)\"$")
	public void user_clicks_on_TagFriends_and_tag_one_of_the(String name) throws Throwable {
		post.SearchFriends(name);
		waitInSeconds(5);
	  
	}
	@When("^user clicks on Checkin and add \"([^\"]*)\" to post$")
	public void user_clicks_on_Checkin_and_add_to_post(String location) throws Throwable {
        post.VerifyCheckIn(location);
	   	}

	@When("^user clicks on Feeling/Activity and add \"([^\"]*)\" to the post$")
	public void user_clicks_on_Feeling_Activity_and_add_to_the_post(String feeling) throws Throwable {
		post.feeling(feeling);	
	}
	
	
	@When("^user clicks on Post to upload the Post$")
	public void user_clicks_on_Post_to_upload_the_Post() throws Throwable {
		post.ClickPost();
		waitInSeconds(5);
	}
	
	@When("^user clicks his Timeline to verify whether post is uploaded or not$")
	public void user_clicks_his_Timeline_to_verify_whether_post_is_uploaded_or_not() throws Throwable {
	  post.Timeline();
	  post.scrolling();
	  waitInSeconds(5);
	}
	
	@When("^user clicks on more button$")
	public void user_clicks_on_more_button() throws Throwable {
		watch.moreButton();
	   
	}

	@When("^user clicks on Watch party and add videos to the post$")
	public void user_clicks_on_Watch_party_and_add_videos_to_the_post() throws Throwable {
		watch.WatchIcon();
		watch.CheckBoxes();
		watch.NextButton();
		waitInSeconds(5);  
		
	}
	@Then("^WatchParty page is displayed$")
	public void watchparty_page_is_displayed() throws Throwable {
		System.out.println(driver.getTitle());
	}
	
	@Then("^Timeline is displayed$")
	public void timeline_is_displayed() throws Throwable {
	   System.out.println(driver.getTitle());
	}

	@When("^user Clicks on Logout$")
	public void user_Clicks_on_Logout() throws Throwable {
		driver.findElement(By.xpath("(//div[@aria-label=\"Account\"])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}

	@Then("^Login page is displayed$")
	public void login_page_is_displayed() throws Throwable {
	   System.out.println(driver.getTitle());
	}

	
}


	