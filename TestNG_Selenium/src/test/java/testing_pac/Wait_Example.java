package testing_pac;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Wait_Example {
  WebDriver driver;
  @BeforeTest
  public void implicitwait() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test
  public void openPage() throws InterruptedException {
	  driver.get("http://www.flipkart.com/");
	  driver.manage().window().maximize();
	  String expectedTitle="Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle,"Title Validation fail");
	  
//	  WebElement search=driver.findElement(By.name("q"));
//	  search.clear();
//	  search.sendKeys("Watch");
//	  search.sendKeys(Keys.ENTER);
//	  driver.navigate().refresh();
  }

}
