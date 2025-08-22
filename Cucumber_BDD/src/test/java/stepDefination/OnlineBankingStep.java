package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlineBankingStep {
	WebDriver driver;
	@Given("zero bank home page should be available with")
	public void zero_bank_home_page_should_be_available_with() {
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("click on online banking hyperlink then click on online statements")
	public void click_on_online_banking_hyperlink_then_click_on_online_statements() {
		driver.findElement(By.xpath("//*[@id=\"onlineBankingMenu\"]/div/strong")).click();
        driver.findElement(By.id("online_statements_link")).click();
        driver.findElement(By.id("user_login")).click();
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("online_statements_link")).click();
	}
	
	@When("select savings from dropdownlist then select year and click on statements for downloading")
	public void select_savings_from_dropdownlist_then_select_year_and_click_on_statements_for_downloading() {
		driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"online_statements_for_account\"]/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"os_2012\"]/table/tbody/tr/td[1]/a")).click();

	}

	@Then("statement downloaded")
	public void statement_downloaded() {
		System.out.println("Statement downloaded successfully");
	}



}
