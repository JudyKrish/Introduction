import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test2 {

	private static final String SearchBox = null;
	private static String sSearchBox;
	
	public static void main(String[] args) {
		
		String URL = "https://amazon.com";
		
		By productLandingPage = By.xpath("//*[@id='search']/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span");
		By productSearch = By.id("twotabsearchtextbox");
		By productSubmit = By.id("nav-search-submit-button");
		By productToCart = By.xpath("//*[@id=\"mbc-buybutton-addtocart-1\"]/span/input");
		By productInCart = By.xpath("//*[@id=\"nav-cart-count-container\"]");
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(productSearch).sendKeys("JBL Flip 4 speaker");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(productSubmit).click();
		driver.findElement(productLandingPage).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(productToCart).click();
		driver.findElement(productInCart).click();
		driver.quit();
		
		
	}



}
