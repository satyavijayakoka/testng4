package testng4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test12b {
	
@Parameters({"browser","username","password"})
	
	@Test
	public void testCaseFour(String bw, String un, String pwd) {
		System.out.println("test case four pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pwd);
		
	}
	
	@Test
	public void testCaseFive() {
		System.out.println("test case five pass");
	}
	

	@Test
	public void testCaseSix() {
		System.out.println("test case six pass");
	}

}
