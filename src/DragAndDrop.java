import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Drag and Drop")).sendKeys(Keys.ENTER);
		WebElement drag = driver.findElement(By.id("column-a"));
		WebElement drop = driver.findElement(By.id("column-b"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.clickAndHold(drag)
		.moveToElement(drop)
	    .release(drop)
	    .build()
	    .perform();
		
	}

}
