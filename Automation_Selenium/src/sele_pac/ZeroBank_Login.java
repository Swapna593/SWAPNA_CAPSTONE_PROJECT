package sele_pac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		
		System.out.println("Welcome to zerobank login");
		{
			System.out.println("Manual Test::-->Check user is able to login with invalid username "
					+ "and valid password credentials");
		}
		
		//locating username textfield
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username_1");
		
		//locating password textfield
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login failed");
		
		Thread.sleep(5000);
		
		System.out.println("Welcome to zerobank login");
		{
			System.out.println("Manual Test::-->Check user is able to login with valid username "
					+ "and invalid password credentials");
		}
		
		//locating username textfield
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating password textfield
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password_1");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login Failed");
		
		Thread.sleep(5000);
		
		System.out.println("Welcome to zerobank login");
		{
			System.out.println("Manual Test::-->Check user is able to login with invalid username "
					+ "and invalid password credentials");
		}
		
		//locating username textfield
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username_1");
		
		//locating password textfield
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password_1");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login Failed");
		
		Thread.sleep(5000);
		
		System.out.println("Welcome to zerobank login");
		{
			System.out.println("Manual Test::-->Check user is able to login with valid username "
					+ "and valid password credentials");
		}
		
		//locating username textfield
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating password textfield
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("Logged in successfully");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
