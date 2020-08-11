package testNGmethods;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void signup()
	{
	   Reporter.log("user signup",true);
	
	}
	
    @Test(dependsOnMethods = "signup")
	public void login()
	{
	Reporter.log("user login",true);
	}
	
	@Test(dependsOnMethods = {"signup","login"},priority=0)
	public void performtask()
	{
	Reporter.log("user perform",true);
	}
	@Test(dependsOnMethods = "login",priority=1)
	public void logout()
	{
	Reporter.log("user logout",true);
	}

}
