package testng4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void testOne() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		
		WebElement login = driver.findElement(By.cssSelector("#login-button"));
		
		// dashboard elements #user-name, #password, #login-button, #header_container > div.header_secondary_container > span
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		System.out.println("hello");
	}
	

}
