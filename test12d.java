package testng4;

import org.testng.annotations.Test;

public class test12d {
	@Test(priority = 1)
	public void testOne() {
		System.out.println("test one");
	}

	@Test(priority = 2)
	public void testTwo() {
		System.out.println("test two");
	}
	@Test(priority = 3, enabled = false)
	public void testThree() {
		System.out.println("test three");
	}

}
