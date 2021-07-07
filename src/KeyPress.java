import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPress {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	
	String URL = "https://the-internet.herokuapp.com/key_presses";
	By getText = By.xpath("//input[@id = 'target']");
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(getText).sendKeys(Keys.ALT);
	
}
}