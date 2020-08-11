package testNGmethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoProgram2 {
	
	@Test(priority=1)
	public void test()
	{
		Reporter.log("india",true);
	}
	@Test(priority=1)
	public void test2()
	{
		Reporter.log("telangana",true);
	}

}
