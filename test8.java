package testng4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test8 {
	
	// Hard assertion and Soft assertion
		WebDriver driver;
		
		@Test
		public void testcase1() {
		// Hard Assertion
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		
		// verify title 
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle,"WebDriverUniversity.com");
		
		// verify url
		boolean avail =driver.getCurrentUrl().contains("more");
		Assert.assertTrue(avail);
		
		// VERIFY element displayed
		boolean avail2 =driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		Assert.assertTrue(avail2);
		driver.close();

		}
		
		@Test
		public void testcase2() {
		// soft Assertion
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
		SoftAssert ss = new SoftAssert();
		
		// verify title 
		String actualtitle = driver.getTitle();
		ss.assertEquals(actualtitle,"WebDriverUniversity.com");
		
		// verify url
		boolean avail =driver.getCurrentUrl().contains("more");
		ss.assertTrue(avail);
		
		// VERIFY element displayed
		boolean avail2 =driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		ss.assertTrue(avail2);
		
		driver.close();
		
		ss.assertAll();
		
		         // fail - any assertion is fail
				// pass - if any assertion is pass

		}

}
