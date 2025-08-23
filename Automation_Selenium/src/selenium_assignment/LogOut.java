package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LogOut {

	public static void LogIn(WebDriver driver,String user1,String pass1,String description) throws InterruptedException {
		WebElement user=driver.findElement(By.id("user-name"));
		user.click();
		user.sendKeys(user1);
		
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys(pass1);
		
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Status: "+description);
		
		Thread.sleep(1000);		
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.saucedemo.com/");
		Thread.sleep(1000);
		String password="secret_sauce";
		
		LogIn(driver,"standard_user",password,"Login successfull");
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
        System.out.println("Logout successfull");				
		
//		driver.close();
		
		
	}

}


