package WebDri_Assignment;
 	

import org.testng.annotations.Test;


public class GmailLoginAnnotation {
	
	@Test
	public void test1()
	{
		System.out.println("Running test1");
	}
	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	public void login()
	{
		int j = 10/0;
		System.out.println("login test...");
	}
	@Test(priority = 2, enabled = false)
	public void alpha() {
		System.out.println("running home test");
	}
	@Test(priority = 3)
	public void home() {
		System.out.println("running home test ");
	}
}
