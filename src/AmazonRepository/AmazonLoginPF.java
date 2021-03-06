package AmazonRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPF {
		
		WebDriver driver;
		
		@FindBy(xpath= "//*[@id='search']/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span")
		WebElement productLandingPage;
		
		@FindBy(id= "twotabsearchtextbox")
		WebElement productSearch;
		
		@FindBy(id= "nav-search-submit-button")
		WebElement productSubmit;
		
		@FindBy(xpath= "//*[@id=\'a-autoid-17\']/span/input")
		WebElement productToCart;
		
		@FindBy(xpath= "//*[@id=\"nav-cart-count-container\"]")
		WebElement productInCart;
		
		@FindBy(xpath= "//*[@id=\"a-autoid-0-announce\"]/span[1]")
		WebElement productQuantity;
		
		@FindBy(xpath= "//*[@id=\"dropdown1_3\"]")
		WebElement quantityRaise;

		public AmazonLoginPF(WebDriver driver) {

			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
}
		public WebElement productLandingPage() {
			
			return productLandingPage;
		}

		public WebElement productSearch() {
			
			return productSearch;
			
		}

		public WebElement productSubmit() {
			
			return productSubmit;
			
		}
		public WebElement productToCart() {
			
			return productToCart;
			
		}
		public WebElement productInCart() {
			
			return productInCart;
		}
		public WebElement productQuantity() {
			
			return productQuantity;
		}
		public WebElement quantityRaise() {
			
			return quantityRaise;
		}
		
				
			
		}

