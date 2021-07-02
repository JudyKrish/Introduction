import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTest {

	WebDriver driver;
	

	@ BeforeMethod
	public void StartBrowser () { 
		System.out.println("Starting in Browser");
		
	}
	
	@Test
	public void Input() {
		
	By google = By.name("q");
	By getYoutube = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3");
	By YTSearch = By.id("search");
	By getInput1 = By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon");
	By getInput2 = By.xpath("//*[@id='video-title']/yt-formatted-string");
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window(). maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(google).sendKeys("youtube", Keys.ENTER);
	driver.findElement(getYoutube).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(YTSearch).sendKeys("Viswasam songs");
	driver.findElement(getInput1).click();
	driver.findElement(getInput2).click();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	System.out.println("Closing Browser");
}
}