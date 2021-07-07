import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Dropdown")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		WebElement drop = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div/select/option[2]")));
		drop.click();
	}

}
