package sele_pac;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_DemoQA {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.cssSelector("div>input[placeholder=\"First Name\"]"));
		fname.sendKeys("Neeva");
		
		WebElement lname=driver.findElement(By.cssSelector("div>input[placeholder=\"Last Name\"]"));
		lname.sendKeys("Sharma");
		
		WebElement mobile=driver.findElement(By.cssSelector("div>input[placeholder=\"Mobile Number\"]"));
		mobile.sendKeys("1234567891");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
		driver.findElement(By.cssSelector("div[aria-label=\"Choose Tuesday, April 1st, 2025\"]")).click();
		
		WebElement sub=driver.findElement(By.cssSelector("div>input[aria-autocomplete=\"list\"]"));
		String[] subjects= {"Maths","Eco","co","Eng"};
		
		for(String subject:subjects) {
			Thread.sleep(500);
			sub.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
			
		}
		
//		WebElement hobby=driver.findElement(By.cssSelector("input[id=\"hobbies-checkbox-2\",class=\"custom-control-label\"]"));
//		hobby.click();
		
	    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	    
	    WebElement img=driver.findElement(By.cssSelector("uploadPicture"));
		img.sendKeys("C:\\Users\\Spandana\\OneDrive\\Desktop\\image_1.jpg");
		
		   WebElement state=driver.findElement(By.cssSelector("div>input[\"react-select-3-input\"]"));
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
/*Css Selector
1.by id
Syntax- node[id=”Value”]
 
2. classname
Systax- node [classname=”value”]
 
3.multiple attribute
Syntax- node#otherattributevalue[attribute=”Attribute vale”]
 
4 . by attribute
Syntax- node[anyattribute=”attribute value”]
 
5. parent child
Syntax- parentnode>childnode[childattribute=”Attributevalue”]
 */
