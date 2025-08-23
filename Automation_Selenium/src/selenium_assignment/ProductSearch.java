package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch {
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
		
		WebElement click=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select sel=new Select(click);
		sel.selectByVisibleText("Name (A to Z)");
		
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		//verify
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		int count=Integer.parseInt(ele.getText());
		
		System.out.println(count>0?"Added to Cart":"Not added");
		
		
	}

}
