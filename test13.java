package testng4;

import org.testng.annotations.Test;


public class test13 {
	
	@Test(groups = {"smoke"})
	public void testCase1() {
		System.out.println("smoke test 1");
	}

	@Test(groups = {"smoke","regression"})
	public void testCase2() {
		System.out.println("smoke test 2");
	}

	@Test(groups = {"smoke"})
	public void testCase3() {
		System.out.println("smoke test 3");
	}
}
