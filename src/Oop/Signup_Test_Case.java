package Oop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup_Test_Case extends Parameters {
	WebDriver driver = new ChromeDriver();
	
	Parameters myMagento= new Parameters();
	@BeforeTest
	public void setUp() {
		driver.get(myMagento.myURL);

	}

	@Test()
	public void theTest() {

		WebElement createAccount = driver
				.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
		createAccount.click();
		
		WebElement firstName=driver.findElement(By.id("firstname"));
		firstName.sendKeys(myMagento.myString); 
		}

	@AfterTest
	public void myPostTest() {
	}

}
