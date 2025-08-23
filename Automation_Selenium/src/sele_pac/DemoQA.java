package sele_pac;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Neeva");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Sharma");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		WebElement mobile=driver.findElement(By.id("userNumber"));
		mobile.sendKeys("1234567891");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select(year);
		//sel.selectByIndex(125);//2025
		//sel.selectByValue("2025");
		sel.selectByVisibleText("2025");
		
		driver.findElement(By.className("react-datepicker__month-select")).click();
		WebElement month=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1=new Select(month);
		sel1.selectByIndex(4);
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
		
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		String[] subjects= {"Maths","Eco","co","Eng"};
		
		for(String subject:subjects) {
			Thread.sleep(500);
			sub.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
			
		}
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("co");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		
	   driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	
	   //upload image
	   WebElement img=driver.findElement(By.id("uploadPicture"));
	   img.sendKeys("C:\\Users\\Spandana\\OneDrive\\Desktop\\image_1.jpg");
	   
	   WebElement state=driver.findElement(By.id("react-select-3-input"));
	   state.sendKeys("NCR");
	   state.sendKeys(Keys.ENTER);
	   
	   WebElement city=driver.findElement(By.id("react-select-4-input"));
	   state.sendKeys("Delhi");
	   state.sendKeys(Keys.ENTER);
	   
	   //submit button
	   driver.findElement(By.id("submit)")).click();
       Thread.sleep(2000);
       
       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("screenshot.png");
	   Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);       
          
	}

}
