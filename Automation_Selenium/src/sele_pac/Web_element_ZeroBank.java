package sele_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_ZeroBank {
	public static void loginStep(WebDriver driver,String username1,String password1,String testDescription) throws InterruptedException {
		System.out.println("Manual Test:-->"+testDescription);
		
		//locating username textField
		WebElement user=driver.findElement(By.id("user_login"));
		user.sendKeys(username1);
		
		//locating password textField
		WebElement pass=driver.findElement(By.id("user_password"));
		pass.sendKeys(password1);
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank login page");
		
		loginStep(driver,"username","ps1","Unable to login");
		loginStep(driver,"us1","password","Unable to login");
		loginStep(driver,"us2","ps2","Unable to login");
		loginStep(driver,"username","password","loggedIn successfully");
		
		driver.close();

	}

}
