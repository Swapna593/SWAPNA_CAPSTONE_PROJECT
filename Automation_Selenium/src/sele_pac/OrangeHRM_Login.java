package sele_pac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login {
	public static void loginStep(WebDriver driver,String username1,String password1,String testDescription) throws InterruptedException {
		System.out.println("Manual Test:-->"+testDescription);
		
		//locating username textField
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys(username1);
		
		//locating password textField
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys(password1);
		
		//click on signin button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]")).click();
        Thread.sleep(3000);		
        
        driver.navigate().refresh();
        Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println("Welcome to OrangeHRM login page");
		
		
		loginStep(driver,"username","ps1","Unable to login");
		loginStep(driver,"us1","password","Unable to login");
		loginStep(driver,"admin","admin123","loggedIn successfully");
		loginStep(driver,"us2","ps2","Unable to login");
		loginStep(driver,"admin","admin123","loggedIn successfully");
		
		driver.close();
	}

}
