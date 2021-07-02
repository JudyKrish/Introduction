import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String URL = "https://the-internet.herokuapp.com/upload";
		
	By fileupload = By.id("file-upload");
	By upload = By.id("file-submit");
	By uploadMsg =By.xpath("//*[@id='content']/div/h3");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(fileupload).sendKeys("C:\\Users\\91790\\OneDrive\\Desktop\\Empty\\Empty.txt");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(upload).click();

	
	

}
}