package testng4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test12 {
	@Parameters({"browser","username","password"})
	@Test
	public void testCaseOne(String bw, String un, String pwd) {
		System.out.println("test case one pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pwd);
		//System.out.println(db);
	}

	@Test
	public void testCaseTwo() {
		System.out.println("test case two pass");
	}
	@Test
	public void testCaseThree() {
		System.out.println("test case three pass");
	}

}
