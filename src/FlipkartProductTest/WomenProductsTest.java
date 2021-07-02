package FlipkartProductTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import FlipkartProducts.WomenProducts;

public class WomenProductsTest {
	
	WebDriver driver;
	WebElement women = null;
	WebElement fashion = null;


	
	@Test
	public void ProductsTest() throws InterruptedException {
		String URL = "https://www.flipkart.com";	
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WomenProducts womenProducts = new WomenProducts(driver);
		womenProducts.popupClose();
		fashion = womenProducts.fashion();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action1 = new Actions(driver);
		action1.moveToElement(fashion).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		women = womenProducts.getWomenLink();
		action1.moveToElement(women).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		womenProducts.productsLink();
		
		
		
	}

}
