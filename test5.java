package testng4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test5 {
ChromeDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}
	
	
	@Test(priority = 1, description = "login functionality")
	public void testOne() {
		String title = driver.getTitle();
		String expectedtitle = "WebDriverUniversity.com";
	//	if(title.equals("WebDriverUniversity.com")) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		Assert.assertEquals(title,expectedtitle);
	}
	
	@Test(priority = 2, description = "validate the home page url")
	public void testTwo() {
		String url = driver.getCurrentUrl();
		boolean expected = url.contains("webdriveruniversity");
		
		Assert.assertEquals(expected, true);
		
	}
	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}

}
