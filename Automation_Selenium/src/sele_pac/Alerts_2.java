package sele_pac;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement sample=driver.findElement(By.partialLinkText("See an example alert"));
		sample.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500)");
		
		WebElement confirmalert=driver.findElement(By.partialLinkText("See a sample confirm"));
		confirmalert.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		

	}

}
