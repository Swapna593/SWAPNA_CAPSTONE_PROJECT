package testing_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_Project {
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
	  @Test (priority=2)
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
	  @Test (priority=3)
	  
	  public void adddeletetocart() throws InterruptedException {
	      Actions act = new Actions(driver);

	      driver.navigate().to("https://www.ebay.com/itm/357452864391?_skw=watch...");
	      Thread.sleep(2000);
	      
	     driver.findElement(By.cssSelector("a[id=\"atcBtn_btn_1\"]")).click();
	     Thread.sleep(2000);

	      WebElement clk = driver.findElement(By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]"));
	      act.click(clk).perform();

	      Thread.sleep(2000);

	      driver.get("https://cart.ebay.com/");
	      Thread.sleep(2000);

		  WebElement remove=driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
		  act.click(remove).perform();
		  Thread.sleep(2000);
	  }





	 @Test(priority=4)
	 
	 public void changeaddress() throws InterruptedException {
		 Actions act1=new Actions(driver);
		
		 driver.navigate().to("https://accountsettings.ebay.com/uas");
		 
		 
		 WebElement address=driver.findElement(By.cssSelector("a[href=\"https://accountsettings.ebay.com/uas/addresses\"]"));
		 address.click();
		 Thread.sleep(2000);
		 
		 WebElement edit=driver.findElement(By.cssSelector("a[aria-label=\"Edit Registration address, email and phone number opens in new window or tab.\"]"));
		 edit.click();
		 Thread.sleep(2000);
		 WebElement editbut=driver.findElement(By.cssSelector("button[id=\"individual_personal_info_address_edit_button\"]"));
		 editbut.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("select>option[value=\"IN\"]")).click();
		 Thread.sleep(2000);
		 
		 WebElement change=driver.findElement(By.cssSelector("input[aria-label=\"Street address\"]"));
		 change.clear();
		 change.sendKeys("x-roads ");
		 change.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("select>option[value=\"MH\"]")).click();
		 
		 Thread.sleep(7000);
		 
	 }
	 @Test(priority=5)
	 public void loginname() throws InterruptedException {
		 driver.navigate().to("https://accountsettings.ebay.com/uas");
		 
		 WebElement personal=driver.findElement(By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]"));
		 personal.click();
		 Thread.sleep(2000);
		 
		 WebElement edit=driver.findElement(By.cssSelector("button[id=\"individual_username_edit_button\"]"));
		 edit.click();
		 Thread.sleep(2000);
		 
		 WebElement username=driver.findElement(By.cssSelector("input[aria-describedby=\"user_name-inline_error\"]"));
		 username.clear();
		 username.sendKeys("Swapna123");
		 username.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 
	 }
	 
	 
	 @Test (priority=6)
	 public void shopcategory() throws InterruptedException {
		 
		 driver.findElement(By.xpath("//*[@id=\"s0-1-0-53-1-2-5-15-0[2]-10-@match-media-0-@ebay-carousel-list\"]/li[1]/a/h3")).click();
		  Thread.sleep(500);
		  driver.findElement(By.partialLinkText("Cameras & Photo")).click();
		  Thread.sleep(500);	
	 }
		 
	 @Test(priority=7)
	 
	 public void rightclick() throws InterruptedException {
		 WebElement searchBox = driver.findElement(By.id("gh-ac"));
	       searchBox.sendKeys("laptop", Keys.ENTER);
	       
	       WebElement image = driver.findElement(By.cssSelector("ul.srp-results img"));
	       
	       new Actions(driver).contextClick(image).perform();
	       
	       String altText = image.getAttribute("alt");
	       
	       System.out.println(altText);

	 }
	 
	 @Test(priority=8)
	 public void allcategory() throws InterruptedException {
		 
		 WebElement allcat=driver.findElement(By.cssSelector("select>option[value=\"550\"]"));
		 allcat.click();
		 Thread.sleep(2000);
		 
		 WebElement search=driver.findElement(By.cssSelector("span[class=\"gh-search-button__label\"]"));
		 search.click();
		 Thread.sleep(2000);
		 
	 }
	 
	 @Test(priority=9)
		public void languageChange() throws InterruptedException {
			
			WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
			country.sendKeys(Keys.ENTER);
			
			Thread.sleep(1000);
			driver.findElement(By.linkText("China")).click();
			
			
		}
	 
	

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}



