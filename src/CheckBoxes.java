import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Checkboxes")).sendKeys(Keys.ENTER);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		WebElement check1 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='checkboxes']/input[1]")));
		check1.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 100);
		WebElement check2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='checkboxes']/input[2]")));
		check2.click();
		
	}

}
