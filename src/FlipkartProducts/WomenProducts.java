package FlipkartProducts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenProducts {
	
	WebDriver driver;
	
	public WomenProducts (WebDriver driver) {
	this. driver = driver;
	}
	
	By popupClose = By.className("_2doB4z");
	By fashion = By.xpath("/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div/div");
	By women = By.xpath("//a[contains(text(),'Women Western')]");
	By productsLink = By.xpath("//a[contains(text(),'Women T-shirts & Polo T-shirts')]");
	
	
	
	public void popupClose() {
		 driver.findElement(popupClose).click();
	}
	
	public WebElement fashion() {
		return driver.findElement(fashion);
	}
	
	public WebElement getWomenLink() {
		return driver.findElement(women);
	}
	public void productsLink() {
		driver.findElement(productsLink).click();
	}
	
	
		
		

}

