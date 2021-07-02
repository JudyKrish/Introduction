import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScroll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window(). maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Infinite Scroll")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Boolean loadingBtn = driver.findElement(By.xpath("//small[contains(text(),'Loading...')]")).isDisplayed();
	while (loadingBtn) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	}
	}


