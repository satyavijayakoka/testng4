package testng4;

import org.testng.annotations.Test;

public class test13b {
	
	@Test(groups = {"login"})
	public void testCase4() {
		System.out.println("login testcase 1");
	}

	@Test(groups = {"regression"})
	public void testCase5() {
		System.out.println("regression 2");
	}

	@Test(groups = {"login"})
	public void testCase6() {
		System.out.println("login test case 2");
	}

}
