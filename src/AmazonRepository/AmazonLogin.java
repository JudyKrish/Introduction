package AmazonRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLogin {
	
	WebDriver driver;

	public AmazonLogin(WebDriver driver) {

		this.driver = driver;
		
	}

	By productSearch = By.id("twotabsearchtextbox");
	By productSubmit = By.id("nav-search-submit-button");
	By productLandingPage = By.xpath("//*[@id='search']/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span");
	By productToCart = By.xpath("//*[@id='a-autoid-18']/span/input");
	By productInCart = By.xpath("//*[@id=\"nav-cart-count-container\"]");
	By productQuantity = By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[1]");
	By quantityRaise= By.xpath("//*[@id=\"dropdown1_3\"]");

public WebElement productSearch() {
	
	return driver.findElement(productSearch);
	
}

public void productSubmit() {
	
	 driver.findElement(productSubmit).click();
	
}

public void productLandingPage() {
	
	driver.findElement(productLandingPage).click();
}

public WebElement productToCart() {
	
	return driver.findElement(productToCart);
	
}
public WebElement productInCart() {
	
	return driver.findElement(productInCart);
}
public void productQuantity() {
	
	driver.findElement(productQuantity).click();
		
}
public WebElement quantityRaise() {
	
	return driver.findElement(quantityRaise);
}
}

