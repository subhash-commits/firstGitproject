package group_execution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertions_example {
	
	@Test
	public void method()
	{
		int a=3;
		int b=6;
		int sum = a+b;
		
		//we cannot use the if and else for pass and fail it shows pass even it is fail
		/*if(sum==90)
			Reporter.log("testcase is pass",true);
		else
			Reporter.log("testcase is fail",true);*/
		
		Assert.assertNotEquals(sum,10);//true
		Assert.assertEquals(sum, 9);//true
		Assert.assertTrue(sum<10);//true
		Assert.assertFalse(sum>10);//true
		Reporter.log("last line is executes",true);
	}
		@Test
		public void m1()
		{
			Reporter.log("second method",true);
		}
			
	}


