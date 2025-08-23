package testing_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG2 {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		  Thread.sleep(3000);
	  }

	@Test
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
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
