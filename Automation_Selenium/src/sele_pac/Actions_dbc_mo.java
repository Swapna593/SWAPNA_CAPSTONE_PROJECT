package sele_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_dbc_mo {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
         driver.get("https://demoqa.com/buttons");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         
         
         
         WebElement dbc=driver.findElement(By.id("doubleClickBtn"));
         Actions act=new Actions(driver);
         act.doubleClick(dbc).perform();
         
         Thread.sleep(3000);
         WebElement rc=driver.findElement(By.id("rightClickBtn"));
         act.contextClick(rc).perform();
         
         //perform mouse over actions
         driver.get("https://www.ebay.com");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         
         
         

         //Drag and drop
         driver.get("https://demoqa.com/droppable");
         driver.manage().window().maximize();
         
         Actions act3=new Actions(driver);
         WebElement source=driver.findElement(By.id("draggable"));
         WebElement target=driver.findElement(By.id("droppable"));
         act3.dragAndDrop(source, target).perform();
         
	}

}
