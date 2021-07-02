package NewProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphoneProduct {
		
		WebDriver driver;
		
		public IphoneProduct(WebDriver driver) {

			this.driver = driver;
			
		}
		By productSearch = By.id("twotabsearchtextbox");
		By productSubmit = By.id("nav-search-submit-button");
		By productLandingPage = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/h2/a/span");
		By productQuantity = By.xpath("//*[@id='a-autoid-0-announce']/span[1]");
		By quantityRaise= By.xpath("//*[@id=\'quantity_1\']");
		By productToCart = By.xpath("//*[@id=\"add-to-cart-button\"]");
		By productInCart = By.xpath("//*[@id=\"nav-cart-count-container\"]");

	public WebElement productSearch() {
		
		return driver.findElement(productSearch);
		
	}

	public void productSubmit() {
		
		 driver.findElement(productSubmit).click();
		
	}

	public void productLandingPage() {
		
		driver.findElement(productLandingPage).click();
	}
	public void productQuantity() {
		
		driver.findElement(productQuantity).click();
			
	}
	public WebElement quantityRaise() {
		
		return driver.findElement(quantityRaise);
	}

	public WebElement productToCart() {
		
		return driver.findElement(productToCart);
		
	}
	public WebElement productInCart() {
		
		return driver.findElement(productInCart);
	}

	}
	


