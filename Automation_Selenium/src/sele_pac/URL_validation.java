package sele_pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_validation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my Second Automation script");
		 WebDriver driver=new  ChromeDriver();
		 driver.get("https://www.selenium.dev");
		 
		 String expectedURL="https://www.selenium.dev/";
		 String actualURL=driver.getCurrentUrl();
		 
		 System.out.println("expected url: "+expectedURL);
		 System.out.println("Actual url: "+actualURL);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 
		 if(expectedURL.equals(actualURL)) {
			 System.out.println("URL Validation Successfull");
		 }
		 else {
			 System.out.println("URL Validation failed");
		 }
		 driver.close();
		 
		 	
		 
	}

}
