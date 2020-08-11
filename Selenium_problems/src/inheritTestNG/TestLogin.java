package inheritTestNG;

import org.testng.annotations.Test;

import page.LoginPage;

public class TestLogin extends Base_Class{
	
	@Test
	public void ValidLogin() throws Exception
	{
		LoginPage lp = new LoginPage(driver);
		lp.setCredentials("subhash", "7286965251");
		lp.login();	
		Thread.sleep(10000);
	}
	
	@Test
	public void InValidLogin() throws Exception
	{
		LoginPage lp = new LoginPage(driver);
		lp.setCredentials("7286965251", "Subhash@1");
		lp.login();	
		Thread.sleep(10000);
	}
	
	

}
