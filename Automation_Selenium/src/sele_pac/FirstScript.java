package sele_pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my first Automation script");
		//setup browser(Chrome driver,firefox driver)
		//System.setProperty("webdriver.chrome.driver","D:\Wipro\chromedriver-win64\chromedriver.exe");
		//create object for Browser
		try {
		   WebDriver driver=new  ChromeDriver();
		     //set WebApp URL
	    	driver.get("https://www.selenium.dev");
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    driver.close();
		    System.out.println("Page loaded successfully");
		}
		catch(Exception e) {
			System.out.println("Unable to open url");
			System.out.println(e);
		}
		
	}
}
