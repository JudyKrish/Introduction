package NewProductTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import NewProduct.IphoneProduct;

public class TestProduct {
	
@Test
	public void product() {
		String URL = "https://www.amazon.com";	
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		IphoneProduct product = new IphoneProduct(driver);
		product.productSearch().sendKeys("closet storage");
		product.productSubmit();
		product.productLandingPage();
		product.productQuantity();
		product.quantityRaise().click();
		product.productToCart().click();
		product.productInCart().click();
	
		
}
}
