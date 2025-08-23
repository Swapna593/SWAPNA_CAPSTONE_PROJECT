package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Task2 {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.get("https://www.ebay.com");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
	}
	
	  @Test(priority=1)
	  public void login() throws InterruptedException {
		  WebElement login=driver.findElement(By.linkText("Sign in"));
		  login.click();
		 Thread.sleep(8000);
		  
		  WebElement sing=driver.findElement(By.id("userid"));
		  sing.sendKeys("swapnaankireddy92@gmail.com");
		  Thread.sleep(5000);
		  
		  WebElement cont=driver.findElement(By.id("signin-continue-btn"));
		  cont.click();
		  Thread.sleep(5000);
		  
		  WebElement password=driver.findElement(By.id("pass"));
		  password.sendKeys("s1234567s");
		  Thread.sleep(3000);
		  
		  WebElement signin=driver.findElement(By.id("sgnBt"));
		  signin.click();
		  Thread.sleep(2000);
		  
	  }
	  @Test (priority=2,dependsOnMethods =  {"login"},invocationCount = 3)
	  public void search() throws InterruptedException {
		  
		  String searchitem[]= {"watch","phone","book"};
		  for(String item:searchitem) {
			  WebElement search=driver.findElement(By.id("gh-ac"));
			  search.clear();
			  search.sendKeys(item);
			  search.sendKeys(Keys.ENTER);
			  Thread.sleep(1000);
		  }
	  }
	  

  @AfterTest
  public void afterTest() {
  }

}
