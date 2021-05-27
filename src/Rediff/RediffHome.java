package Rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHome {
	
	WebDriver driver;
	
	public RediffHome(WebDriver driver) {
		this.driver = driver;

	}
By news = By.linkText("NEWS");
By business = By.linkText("BUSINESS");
By movies = By.linkText("MOVIES");
By cricket = By.linkText("CRICKET");
By sports = By.linkText("SPORTS");



public WebElement news() {
	return driver.findElement(news);

}
public WebElement business() {
	return driver.findElement(business);

}
public WebElement movies() {
	return driver.findElement(movies);
}
public WebElement cricket() {
	return driver.findElement(cricket);
}
public WebElement sports() {
	return driver.findElement(sports);
}
}