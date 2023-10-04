package Oop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_Case  extends Parameters  {
	Parameters  myMagento= new Parameters();
	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void setUp() {
		
		driver.get(myURL);
		
		
	}
	
	@Test()
	public void theTest() {
		
		WebElement signIn=driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		signIn.click();	
		
		WebElement logIn=driver.findElement(By.id("email"));
		logIn.sendKeys(myMagento.logInEmail);
		
		WebElement pAssword=driver.findElement(By.id("pass"));
		pAssword.sendKeys(myMagento.confiRm);
		
		
		WebElement eNter=driver.findElement(By.id("send2"));
		eNter.click();		
		
		
		
		
	}
	
	@AfterTest
	public void myPostTest() {}

}
