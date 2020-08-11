package testNGmethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public  class DemoProgram {
	@Test
	public void pro()
	{
		//System.out.println("hii");
		Reporter.log("subhash",true);
		
	}
	@Test
	public static void pro1()
	{
		//System.out.println("hello");
		Reporter.log("kiran",true);
		//DemoProgram dp = new DemoProgram();
		//dp.pro();
	}

}
