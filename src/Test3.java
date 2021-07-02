import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	 public void LaunchBrowser() {
	try {
	String URL = "https://www.facebook.com";	
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);	
	
	String expectedTitle = "Post on Facebook|Facebook";
	String actualTitle = driver.getTitle();
	System.out.println("Display " + actualTitle);
	driver.quit();
	//Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	catch(Exception e){
		System.out.println("This is an error");
	}

	}
	
}
