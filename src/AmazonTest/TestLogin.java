package AmazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmazonRepository.AmazonLogin;

public class TestLogin {
@Test
public void Login() {
	String URL = "https://www.amazon.com";	
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	AmazonLogin login = new AmazonLogin(driver);
	login.productSearch().sendKeys("JBL Flip 4 speaker");
	login.productSubmit();
	login.productLandingPage();
	login.productToCart().click();
	login.productInCart().click();
	
	
		

	}

}
