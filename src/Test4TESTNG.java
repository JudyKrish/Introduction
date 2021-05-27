
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4TESTNG {
	@Test
	public void Password() {
		System.out.println("Enter Password");
		
	}
	@BeforeTest
	public void ChangePassword() {
	System.out.println("New Password");	
}
	@AfterTest
	public void Successmessage() {
	System.out.println("Password changed Successful");
	
	}
}
