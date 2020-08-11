package group_execution;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class Assertsoft {
	
	@Test
	public void method()
	{
		int a=20;
		int b=20;
		int sum =a+b;
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(sum,50);
	sa.assertAll("ok");

		
	}
}


