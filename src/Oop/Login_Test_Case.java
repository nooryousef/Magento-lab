package Oop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_Case  extends Parameters  {
	
	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setUp() {
		
		driver.get(myURL);
		
		
	}
	
	@Test()
	public void theTest() {
		
		
	}
	
	@AfterTest
	public void myPostTest() {}

}
