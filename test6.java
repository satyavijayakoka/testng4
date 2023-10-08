package testng4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test6 {

	WebDriver driver;
	
	@Test
	public void testcase1() {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		//driver.findElement(By.id("contact-us")).click();
		WebElement contactUsLink= driver.findElement(By.id("contact-us"));
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].click()",contactUsLink );
		driver.close();	
		
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].scrollIntoView(true)",scrollelement );
		Thread.sleep(5000);
		driver.close();
		
		// setup new attribute for element
		//<h1 id ="hello">Hello</h1>
	
	}
	@Test
	public void testcase3() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('data-cy','two')", scrollelement);
		// je.executeScript("arguments[0].removeAttribute('data-cy')", scrollelement);
		String attributevalue = scrollelement.getAttribute("data-cy"); // two
		System.out.println(attributevalue);
		Assert.assertEquals(attributevalue, "two");
		driver.close();
		
	}
	@Test
	public void testcase4() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollelement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String title = (String)je.executeScript("return document.title;");
		// first parameter of javascriptexecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	
	}
	@Test
	public void testcase5() throws InterruptedException {
		// javascript executor to click on element
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	 WebElement e =  driver.findElement(By.id("double-click"));
	   ac.doubleClick(e).build().perform();
	  String className = e.getAttribute("class");
	  Assert.assertEquals(className, "div-double-click double");
	  driver.close();
	
	}
	@Test
	public void testcase6() throws InterruptedException {
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   WebElement draggable = driver.findElement(By.id("draggable"));
	   WebElement droppable = driver.findElement(By.id("droppable"));
	   ac.dragAndDrop(draggable, droppable).build().perform();
	   Assert.assertEquals(droppable.getText(), "Dropped!");
	   driver.close();
	
	}
	
	@Test
	public void testcase7() throws InterruptedException {
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   WebElement clickable = driver.findElement(By.id("click-box"));
	   ac.clickAndHold(clickable).build().perform();
	   Assert.assertEquals(clickable.getText(), "Well done! keep holding that click now.....");
	   driver.close();
	
	}
	@Test
	public void testcase8() throws InterruptedException {
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   WebElement e = driver.findElement(By.cssSelector("#double-click"));
	   ac.doubleClick(e).build().perform();
	  Thread.sleep(5000);
	  driver.close();
	  
	}
	@Test
	public void testcase9() throws InterruptedException { 
		driver= new ChromeDriver();
	   driver.get("http://www.webdriveruniversity.com/Actions/index.html");
	   Actions ac = new Actions(driver);
	   // the webelement hoverover me : #div-hover > div.dropdown.hover > button
	   WebElement e =driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		ac.moveToElement(e).build().perform();
		//the webelement link: #div-hover > div.dropdown.hover > div > a
		WebElement e2 = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
		Assert.assertEquals(true, e2.isDisplayed());
		 driver.close();	
		
	}


}
