package testng4;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test7 {
	// asserts in testNg
			// soft assertion and hard assertion
		WebDriver driver;
		@BeforeMethod
		public void beforeMethod() {
			driver = new ChromeDriver();
			driver.get("http://www.webdriveruniversity.com");
			
		}
		@Test
		public void testcaseOne() {
			// WebDriverUniversity.com
					//assertEquals(expected,actual)
					//assertNotEquals(expected,actual)
					//assertTrue(condition)
					//assertFalse(condition)
			
			String actualTitle =driver.getTitle();
			String expectedTitle = "WebDriverUniversity.com";
			assertEquals(actualTitle,expectedTitle);
			//WebDriver | Contact Us
			WebElement contactus = driver.findElement(By.id("contact-us"));
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].removeAttribute('target')", contactus);
			contactus.click();
			actualTitle= driver.getTitle();
			assertNotEquals(actualTitle,expectedTitle);
			
		}
		@Test
		public void testcasetwo() {
			String currenturl =driver.getCurrentUrl();
			boolean avail = currenturl.contains("university");
			assertTrue(avail);
			driver.get("https://www.google.com");
			avail = driver.getCurrentUrl().contains("university");
			assertFalse(avail);
			
			
		}
		
		
		@AfterMethod
		public void afterMethod() {
			driver.close();
		}

}
