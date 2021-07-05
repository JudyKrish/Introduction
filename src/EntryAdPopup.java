import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Entry Ad")).sendKeys(Keys.ENTER);
		
		// Approach 1 - Using Explicit Wait
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement closeButton = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[3]/p[1]")));
		closeButton.click();
		
		// Approach 2 - Using Java Wait
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[3]/p[1]")).click();

		
		Thread.sleep(5000);
		driver.close();
	}

}
