package Rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePF {
	
	WebDriver driver;
	
	@FindBy(linkText= "NEWS")
	WebElement news;
	@FindBy(linkText= "BUSINESS")
	WebElement business;
	@FindBy(linkText= "MOVIES")
	WebElement movies;
	@FindBy(linkText= "CRICKET")
	WebElement cricket;
	@FindBy(linkText= "SPORTS")
	WebElement sports;
	
	public RediffHomePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement news() {
		return news;
	}
	public WebElement business() {
		return business;
	}
	public WebElement movies() {
		return movies;
	}
	public WebElement cricket() {
		return cricket;
	}
	public WebElement sports() {
		return sports;
	}
	
}
