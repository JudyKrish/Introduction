package RediffTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Rediff.RediffHome;

public class RediffTestCase {
	@Test
	public void TestCase() {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		RediffHome Testcase = new RediffHome(driver);
		Testcase.news().click();
		Testcase.business().click();
		Testcase.movies().click();
		Testcase.cricket().click();
		Testcase.sports().click();
	
	
	
	}
	

}
