package testng4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


// Assignment - how may total links on the page and 
// how many broken links their on page.
// selenium 
public class test15brokenlinks {
	
	    WebDriver driver;
	     int brokenLinksCount = 0;

	    @BeforeClass
	    public void setUp() {
	        
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void findtotalLinks() {
	        driver.get("http://www.webdriveruniversity.com/");

	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        links.addAll(driver.findElements(By.tagName("img")));

	        System.out.println("Total links are " + links.size());
	    }
	        @Test
	        public void findBrokenLinks() {
	        	

	 	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url == null || url.isEmpty()) {
	                System.out.println("URL is either null or it is empty");
	                continue;
	            }

	           

	            try {
	                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
	                httpURLConnection.setRequestMethod("HEAD");
	                httpURLConnection.connect();
	                int responseCode = httpURLConnection.getResponseCode();

	                if (responseCode >= 400) {
	                    System.out.println(url + " is a broken link");
	                    brokenLinksCount++;
	                } else {
	                    System.out.println(url + " is a valid link");
	                }

	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Total broken links are " + brokenLinksCount);
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

}
