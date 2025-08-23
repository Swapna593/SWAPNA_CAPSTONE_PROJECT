package testing_pac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CrossBrowser_Testing {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  Thread.sleep(2000);
  }
  
  @Test
  public void fireFoxbrowser() throws InterruptedException {
	  driver=new FirefoxDriver();
	  driver.get("http://www.flipkart.com/%22");
	  String expectedTitle="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Title Validation fail");
	  Thread.sleep(3000);
  }
  
  @Test
  public void edgebrowser() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","D:\\Wipro\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("http://www.flipkart.com/%22");
	  String expectedTitle="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Title Validation fail");
	  Thread.sleep(3000);
	  
  }
  
  @Test
  public void chromebrowser() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("http://www.flipkart.com/%22");
	  String expectedTitle="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Title Validation fail");
	  Thread.sleep(3000);
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
