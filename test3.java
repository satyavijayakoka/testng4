package testng4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i will run before every method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("i will run after every method");
	}
	@Test(priority = 2)
	public void testcase1() {
		System.out.println("test case one");
		
	}
	
	@Test(priority = 1)
	public void testcase2() {
		System.out.println("test case two");
		
	}
	@Test(priority = 0)
	public void testcase3() {
		System.out.println("test case three");
		
	}
	@Test(priority = -1)
	public void testcase4() {
		System.out.println("test case four");
		
	}
	@Test(priority = -2)
	public void five() {
		System.out.println("test case five");
		
	}

	@Test(priority = -2)
	public void six() {
		System.out.println("test case six");
		
	}

}
