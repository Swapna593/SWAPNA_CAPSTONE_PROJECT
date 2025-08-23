package tira_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Tira_Beauty {
	WebDriver driver;
   @BeforeClass
   public void beforeClass() throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.get("https://www.tirabeauty.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  Thread.sleep(2000);
	}
  @Test
  public void testfragrancefilters() {
//	  driver.findElement(By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[4]/a/picture/img")).click();
//	  System.out.println("Navigated to fragrance");
	  
	  driver.get("https://www.tirabeauty.com/sections/fragrance-app");
//	  driver.findElement(By.xpath("//*[@id=\"1imageCarousel\"]/div/div[2]/div/div[2]/div[3]/a/picture/img")).click();
//	  System.out.println("fruity");
	  
	  
  }
  
  @Test(description = "What’s New – Makeup section displays products correctly")
  public void testWhatsNewMakeupModule() {
      // Navigate, assert visibility, count > 0
  }
  
  @Test(description = "Makeup product selection and cart functionality")
  public void testMakeupProductCart() {
      // Navigate to Makeup, search, select, add to cart, assert
  }
  
  @Test(description = "Bath & Body products reflect offers and can be added to cart")
  public void testBathAndBodyModule() {
      // Pick product, assert discount info, add to cart
  }
  
  @Test(description = "Mom & Baby category displays products with correct discounts")
  public void testMomAndBabyModule() {
      // Verify product presence and discounts
  }
  
  

}
