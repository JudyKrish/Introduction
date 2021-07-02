package FlipkartProducts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenProductsPF {

	WebDriver driver;
	
	@FindBy(className = "_2doB4z")
	WebElement popupClose;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div/div[4]/a/div[2]/div/div")
	WebElement fashion;

	@FindBy(xpath = "//a[contains(text(),'Women Western')]")
	WebElement women;
	
	@FindBy(xpath = "//a[contains(text(),'Women T-shirts & Polo T-shirts')]")
	WebElement productsLink;
	
	public WomenProductsPF(WebDriver driver) {
		
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
	}
	
	public WebElement popupClose() {
		return popupClose;
	}
	public WebElement fashion() {
		return fashion;
	}
	public WebElement women() {
		return women;
	}
	public WebElement productsLink() {
		return productsLink;

	}
	
	
	






}
