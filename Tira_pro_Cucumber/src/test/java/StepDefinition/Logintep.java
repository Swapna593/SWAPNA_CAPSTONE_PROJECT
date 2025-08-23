package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintep {
	WebDriver driver;
	@Given("Login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("https://www.tirabeauty.com/auth/login?redirectUrl=%252F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter input as number")
	public void enter_input_as_number(){
		WebElement ph=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[1]/span/input"));
		ph.click();
		ph.sendKeys("9392750282");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div")).click();
	}

	@And("click on sendOTP")
	public void click_on_send_otp() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/button")).click();
		Thread.sleep(1000);
	}

	@Then("successful login after entering OTP")
	public void successful_login_after_entering_otp() {
		//driver.quit();
	}




}
