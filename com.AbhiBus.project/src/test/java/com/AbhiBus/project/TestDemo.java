package com.AbhiBus.project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Abhibus.Analyzer.RetryAnalyzer;
import com.Abhibus.Base.TestBase;
import com.Abhibus.TestUtils.TestUtil;
import com.Abhibus.pages.LoginPage;


public class TestDemo extends TestBase {
	
	LoginPage loginpage;
	@Test(priority=0,retryAnalyzer = RetryAnalyzer.class)
	public void demo () throws InterruptedException
	{
		logger = extent.startTest("demo");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		Thread.sleep(3000);
	}
//  @Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
//	public void VerifyLogo() throws InterruptedException
//	{
//	  logger = extent.startTest("VerifyLogo");
//		boolean b = loginpage.VerifyFaceBookLogo();
//		System.out.println(b);
//		Thread.sleep(3000);
//		Assert.assertTrue(b);
//	}	
	
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData("subhash");
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getCRMTestData")
	 public void VerifyLofin(String username1, String password1) throws IOException { 
		
	 loginpage.setCredentials(username1, password1);
	 }
	 
	}

	/*
	 * @Test(priority=1) public void VerifyLofin(String username1, String password1)
	 * throws IOException { String username11=TestUtil.readData(); String password11
	 * = TestUtil.readData(); loginpage.setCredentials(username11, password11); }
	 */
