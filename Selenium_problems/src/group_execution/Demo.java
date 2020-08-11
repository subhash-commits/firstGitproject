package group_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(groups = {"smkTesting"})
	public void method1()
	{
		Reporter.log("perform smoke testing",true);
	}
	@Test(groups = {"smkTesting","FucTesting"})
	public void method2()
	{
		Reporter.log("perform smoke testing/perform functional testing",true);
	}
	@Test(groups = {"intTesting","fucTesting"})
	public void method3()
	{
		Reporter.log("perform integration testing/perform functional testing",true);
	}
	@Test(groups = {"regTesting"})
	public void method4()
	{
		Reporter.log("perform regression testing",true);
	}
	@Test(groups = {"sysTesting","intTesting"})
	public void method5()
	{
		Reporter.log("perform system testing/perform integration testing",true);
	}


}
