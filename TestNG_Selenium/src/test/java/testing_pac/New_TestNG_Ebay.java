package testing_pac;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.Select;

public class New_TestNG_Ebay {
	WebDriver driver;
	PageClass pg;
	WebDriverWait wait;
	@BeforeClass
	  public void beforeTest() throws InterruptedException {
		driver=new ChromeDriver();
		pg=new PageClass(driver);
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }

  @Test(priority=1)
  public void login() throws InterruptedException {
	  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
	  
	  pg.email_in();
	  pg.con_in();
	  pg.pass_in();
	  pg.submit_in();
	  
  }
  
  @Test(priority=2)
  public void search() throws InterruptedException {
	  
	  pg.search_in();
	  
  }
  
  @Test(priority=3)
  public void addToCart() throws InterruptedException {
	  pg.addCartDeleteCart();
	  Thread.sleep(2000);
	  System.out.println("done");
	  
  }
  
  
  
  @Test(priority=4)
  public void shopByCategory() throws InterruptedException {
	  pg.shopByCategory();
	  Thread.sleep(1000);
  }
  
  @Test(priority=5)
  public void allCategory() throws InterruptedException {
	  pg.allCategory();
	  Thread.sleep(1000);
  }
  
  @Test(priority=6)
  public void rightClick() throws InterruptedException {
	  pg.rightclick();
	  Thread.sleep(1000);
  }
  
  @Test(priority=7)
  public void changeLoginName() throws InterruptedException {
      driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
	  
	  pg.email_in();
	  pg.con_in();
	  pg.pass_in();
	  pg.submit_in();
	  
	  Thread.sleep(1000);
	  pg.loginname();
	  Thread.sleep(1000);
  }
  
  @Test(priority=8)
  public void languageChange() throws InterruptedException {
      pg.languageChange();
      Thread.sleep(1000);
  }
  
  @Test(priority=9)
  public void addressChange() throws InterruptedException {
    driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
	  
	  pg.email_in();
	  pg.con_in();
	  pg.pass_in();
	  pg.submit_in();
	  Thread.sleep(1000);
      pg.changeaddress();
      Thread.sleep(1000);
  }
  
 
  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"Search button is not working");
	  //driver.close();
  }

}


//public void addToCartAndRemove() throws InterruptedException {
//    Actions act = new Actions(driver);
//
//      driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch...");
//      Thread.sleep(2000);
//      
//     driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
//     Thread.sleep(2000);
//
//      WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
//      act.click(clk).perform();
//
//      Thread.sleep(2000);
//
//      driver.get("https://cart.ebay.com/");
//      Thread.sleep(2000);
//
//	  WebElement remove=driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
//	  act.click(remove).perform();
//	  Thread.sleep(2000);
//
//      
//  }
//
//
//@Test
//public void shopByCategory() throws InterruptedException {
//   driver.findElement(By.xpath("//*[@id=\"s0-1-0-53-1-2-5-15-0[2]-10-@match-media-0-@ebay-carousel-list\"]/li[1]/a/h3")).click();
//	  Thread.sleep(500);
//	  driver.findElement(By.partialLinkText("Cameras & Photo")).click();
//	  Thread.sleep(500);	   
//}
//  
//@Test
//public void allCategory() {
//   WebElement search = driver.findElement(By.id("gh-ac"));
//   search.clear();
//   search.sendKeys("Bag");
//   search.sendKeys(Keys.ENTER);
//   driver.navigate().refresh();
//}
//
//@Test
//public void rightClick() {
//   WebElement searchBox = driver.findElement(By.id("gh-ac"));
//   searchBox.sendKeys("laptop", Keys.ENTER);
//   
//   WebElement image = driver.findElement(By.cssSelector("ul.srp-results img"));
//   
//   new Actions(driver).contextClick(image).perform();
//   
//   String altText = image.getAttribute("alt");
//   
//   System.out.println(altText);
//}
//
//
//
//@Test
//public void changeAddress() throws InterruptedException {
//   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    driver.get("https://accountsettings.ebay.com/uas");
//    wait.until(ExpectedConditions.urlContains("uas"));
//
//    wait.until(ExpectedConditions.elementToBeClickable(By.id("account-settings-link-PI")))
//        .click();
//
//    js.executeScript("window.scrollBy(0,400)");
//
//    wait.until(ExpectedConditions.elementToBeClickable(
//        By.id("individual_personal_info_address_edit_button")))
//        .click();
//
//    js.executeScript("window.scrollBy(0,400)");
//
//    WebElement addr1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
//        By.id("addressline1")));
//    addr1.clear();
//    addr1.sendKeys("x-roads,kmp");
//
//    WebElement city = driver.findElement(By.id("city"));
//    city.clear();
//    city.sendKeys("Kadapa");
//
//    WebElement stateElement = driver.findElement(By.id("state"));
//    new Select(stateElement).selectByVisibleText("Andhra Pradesh");
//
//    WebElement postal = driver.findElement(By.id("postalCode"));
//    postal.clear();
//    postal.sendKeys("516289");
//
//    wait.until(ExpectedConditions.elementToBeClickable(
//        By.id("address_edit_submit_button")))
//        .click();
//    
//    wait.until(ExpectedConditions.invisibilityOfElementLocated(
//        By.id("address_edit_submit_button")));
//  	}
//
//
//
//
