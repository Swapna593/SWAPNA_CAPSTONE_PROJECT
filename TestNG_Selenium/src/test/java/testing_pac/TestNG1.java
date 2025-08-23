package testing_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG1 {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  Thread.sleep(3000);
  }
  
  @Test
  public void eBay() {
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");	
	  System.out.println("Ebay--> Thread ID : "+Thread.currentThread().getId());
	  driver.quit();
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
