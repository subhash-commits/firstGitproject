package testNGmethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_Enabled {
	
	@Test
	public void signup()//it will execute only once
	{
	   Reporter.log("user signup",true);
	
	}
	
    @Test(enabled=false)//it will not execute
	public void login()
	{
	Reporter.log("user login",true);
	}
	
	@Test(invocationCount = 0)//it will not execute
	public void performtask()
	{
	Reporter.log("user perform",true);
	}
	@Test(invocationCount = 5)//it will execute 5 times
	public void logout()
	{
	Reporter.log("user logout",true);
	}


}
