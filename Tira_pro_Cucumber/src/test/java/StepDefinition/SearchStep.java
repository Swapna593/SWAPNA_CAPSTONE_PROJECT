package StepDefinition;

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
	@Given("login user and search button available")
	public void login_user_and_search_button_available() {
		driver=new ChromeDriver();
		driver.get("https://www.tirabeauty.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter item and press enter")
	public void enter_item_and_press_enter() {
		driver.findElement(By.id("mobilesearch")).click();
		driver.findElement(By.id("mobilesearch")).sendKeys("lipstick");
		driver.findElement(By.id("mobilesearch")).sendKeys(Keys.ENTER);
	}

	@Then("search successfull")
	public void search_successfull() {
		
	}


}
