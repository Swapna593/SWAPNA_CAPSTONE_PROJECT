package sele_pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Validation {

	public static void main(String[] args) {
		System.out.println("This is my third Automation script");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev");

		 String expectedTitle="Selenium";
		 String actualTitle=driver.getTitle();
		 
		 System.out.println("Expected Title: "+expectedTitle);
		 System.out.println("Actual Title: "+actualTitle);
		 
		 if(expectedTitle.equals(actualTitle)) {
			 System.out.println("Title validation successfull");
		 }
		 else {
			 System.out.println("Title validation Failed");
		 }
		 
		 driver.close();

	}

}
