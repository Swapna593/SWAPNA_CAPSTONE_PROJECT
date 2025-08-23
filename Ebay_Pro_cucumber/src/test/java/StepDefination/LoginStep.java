package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	PageClass pc=new PageClass(driver);

@Given("login page should be open in default browsers")
public void login_page_should_be_open_in_default_browsers() {
   driver=new ChromeDriver();
   driver.get("https://www.ebay.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}

@When("click on username button and enter username")
public void click_on_username_button_and_enter_username() {
	pc=new PageClass(driver);
	pc.login();
	pc.email_in();
	
 
}

@And("click on continue button")
public void click_on_continue_button() throws InterruptedException {
	pc=new PageClass(driver);
	pc.con_in();
	Thread.sleep(1000);
    
}
@And("enter the password")
public void enter_the_password() throws InterruptedException {
	pc=new PageClass(driver);
	pc.pass_in();
	Thread.sleep(1000);
    
}

@And("click on signin button")
public void click_on_signin_button() throws InterruptedException {
	pc=new PageClass(driver);
	pc.submit();
	Thread.sleep(1000);
    
}

@Then("login successfully")
public void login_successfully() {
	driver.close();
    
}

}	