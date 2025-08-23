package sele_pac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//sample alert(accept)
		//confirmation alert(accept or  cancel)
		//prompt alerts(add input and then accept, or cancel)
		
		
		WebElement samplealert=driver.findElement(By.id("alertButton"));
		samplealert.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(7000);
		Alert alertl2=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
		Thread.sleep(3000);
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(4000);
		Alert alertl1=driver.switchTo().alert();
		alertl1.sendKeys("Harry");
		alert1.accept();
		alertl2.accept();
		
		
	}

}
