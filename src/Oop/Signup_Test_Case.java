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
		firstName.sendKeys(myMagento.firstName);
		
		WebElement lastName=driver.findElement(By.xpath("//input[@id='lastname']"));
		lastName.sendKeys(myMagento.lastName);
		
   WebElement userEmail=driver.findElement(By.xpath("//input[@id='email_address']")) ; 
   userEmail.sendKeys(myMagento.myMail);
   
   
   WebElement myPass=driver.findElement(By.xpath("//input[@id='password']"));
   myPass.sendKeys(myMagento.passWord);
		
   
   WebElement confirmPass=driver.findElement(By.xpath("//input[@id='password-confirmation']"));
   confirmPass.sendKeys(myMagento.confiRm);
   
   WebElement subMit=driver.findElement(By.xpath("//button[@title='Create an Account']"));
   subMit.click();	
   
	}

	@AfterTest
	public void myPostTest() {
	}

}
