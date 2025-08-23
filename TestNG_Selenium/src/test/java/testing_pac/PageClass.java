package testing_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageClass {

	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void email_in() {
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("swapnaankireddy92@gmail.com");
	}
	public void con_in() {
		driver.findElement(cont).click();
		
	}
	public void pass_in() {
		driver.findElement(pass).click();
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys("s1234567s");
	}
	public void submit_in() {
		driver.findElement(submit).click();
		
	}
	public void userLogin() {
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("swapnaankireddy92@gmail.com");
		driver.findElement(cont).click();
		driver.findElement(pass).click();
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys("s1234567s");
		driver.findElement(submit).click();
		
	}
	public void search_in() {
		driver.findElement(search).click();
		driver.findElement(search).clear();
		driver.findElement(search).sendKeys("watch");
	}
	public void addCartDeleteCart() throws InterruptedException {
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
	public void shopByCategory() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"s0-1-0-53-1-2-5-15-0[2]-10-@match-media-0-@ebay-carousel-list\"]/li[1]/a/h3")).click();
		  Thread.sleep(500);
		  driver.findElement(By.partialLinkText("Cameras & Photo")).click();
		  Thread.sleep(500);	
	}
	public void allCategory() throws InterruptedException {
		 WebElement allcat=driver.findElement(By.cssSelector("select>option[value=\"550\"]"));
		 allcat.click();
		 Thread.sleep(2000);
		 
		 WebElement search=driver.findElement(By.cssSelector("span[class=\"gh-search-button__label\"]"));
		 search.click();
		 Thread.sleep(2000);
	}
	
	public void rightclick() {
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
	       searchBox.sendKeys("laptop", Keys.ENTER);
	       
	       WebElement image = driver.findElement(By.cssSelector("ul.srp-results img"));
	       
	       new Actions(driver).contextClick(image).perform();
	       
	       String altText = image.getAttribute("alt");
	       
	       System.out.println(altText);
	}
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
	
	public void languageChange() throws InterruptedException {
		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("China")).click();
	}
	
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
	
	

}
