import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.he	rokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("JavaScript Alerts")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert.accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert.dismiss();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		alert = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String jsAlertText = alert.getText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert.sendKeys("How are you?" + jsAlertText);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		alert.accept();
		
		
		
	}
	
	

}
