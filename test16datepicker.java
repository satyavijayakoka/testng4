package testng4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test16datepicker {
	
	WebDriver driver;
	@Test
	
	public void calendarMonth() {
		String month = "January";
		String year = "2024";
		String date = "1";
		
		driver = new ChromeDriver();
		  driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");
		  driver.findElement(By.id("datepicker")).click();
		  selectDate(driver,date,month,year);
		
		
	}
	public static void selectDate(WebDriver driver, String date, String month, String year) {
		String text = driver.findElement(By.className("datepicker-switch")).getText();
		String actualMonth = text.split(" ")[0];
		String actualYear = text.split(" ")[1];
		System.out.println(actualMonth);
		System.out.println(actualYear);
		
		while(!(actualMonth.equals(month)&& actualYear.equals(year) )) {
			driver.findElement(By.className("next")).click();
			text = driver.findElement(By.className("datepicker-switch")).getText();
			actualMonth = text.split(" ")[0];
			actualYear = text.split(" ")[1];
			
			System.out.println(actualMonth);
			System.out.println(actualYear);
			
		}
		List<WebElement> ele =driver.findElements(By.className("day"));
		for(int i=0; i< ele.size(); i++) {
			if(ele.get(i).getText().equals(date)) {
				ele.get(i).click();
				break;
			}
			
		}
		System.out.println(date);
		
	}
	
	

}
