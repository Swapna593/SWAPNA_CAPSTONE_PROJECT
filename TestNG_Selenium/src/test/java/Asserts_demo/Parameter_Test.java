package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Parameter_Test {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	  }
  @Test
  @Parameters({"username1","password1"})
  public void login(@Optional("username")String username1,@Optional("password1")String password1) throws InterruptedException {
	  System.out.println("username: "+username1+" Password: "+password1);
	  driver.get("http://zero.webappsecurity.com/login.html");
	  
			driver.findElement(By.id("user_login")).click();
			driver.findElement(By.id("user_login")).sendKeys(username1);
			
			driver.findElement(By.id("user_password")).click();
			driver.findElement(By.id("user_password")).sendKeys(password1);
			
			driver.findElement(By.name("submit")).click();
	  
  }
 
  @AfterTest
  public void afterTest() {
  }

}
