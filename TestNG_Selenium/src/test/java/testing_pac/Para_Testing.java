package testing_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Para_Testing {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  Thread.sleep(3000);
   }
	
  @Test(priority=4)
  public void eBay() {
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");	
	  System.out.println("Ebay--> Thread ID : "+Thread.currentThread().getId());
	  driver.quit();
  }
  
  @Test(priority=3)
  public void amazon() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/"); 
	  String expectedurl="https://www.amazon.in/";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expectedurl,"Url validation fail");
	  Thread.sleep(3000);
	  System.out.println("Amazon--> Thread ID : "+Thread.currentThread().getId());
	  driver.quit();
  }
	  
  
  @Test(priority=1)
  public void flipkart() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("http://www.flipkart.com/%22");
	  String expectedTitle="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Title Validation fail");
	  Thread.sleep(3000);
	  System.out.println("Flipkart--> Thread ID : "+Thread.currentThread().getId());
	  driver.quit();
	  
  }
  
  @Test(priority=2)
  public void zeroBank() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/index.html");
      WebElement search=driver.findElement(By.id("searchTerm"));
      search.sendKeys("Online banking");
      search.sendKeys(Keys.ENTER);
      Assert.assertTrue(true,"search button is not clickable");
      Thread.sleep(3000);
      System.out.println("Zerobank--> Thread ID : "+Thread.currentThread().getId());
	  driver.quit();
	  
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
