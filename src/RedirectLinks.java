import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Redirect")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("redirect")).click();
	}

}
