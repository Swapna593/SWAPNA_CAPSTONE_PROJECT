package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	WebDriver driver;
	PageClass pc=new PageClass(driver);

@Given("search page is open")
public void search_page_is_open() {
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
    
}

@When("click on search bar")
public void click_on_search_bar() {
	pc=new PageClass(driver);
	pc.search_in();
	
	
}

@When("^enter the items(.*)$")
public void enter_the_items(String item) {
	pc=new PageClass(driver);
	pc.search_in();
	driver.findElement(By.id("gh-ac")).sendKeys(item);
	driver.findElement(By.id("gh-ac")).clear();
}

@Then("search items successfully")
public void search_items_successfully() {
   driver.close();
}


}
