package testng4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test14b {
	@Test(dependsOnMethods = "addToCart")
	public void login() {
		System.out.println("executing the login testcase");
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("executing the search testcase");
		Assert.assertEquals(false, true);
	}
	@Test(dependsOnMethods = "search")
	public void addToCart() {
		System.out.println("adding items to cart");
		
	}

	@Test(dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("adding items to cart");
		
	}
}
