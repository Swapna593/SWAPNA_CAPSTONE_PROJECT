package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_dev {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void title() {
	  String expectedtitle="Selenium";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(expectedtitle, actualtitle,"Title validation successfull");
	  System.out.println("expectedtitle: "+expectedtitle);
	  System.out.println("actualtitle: "+actualtitle);
  }
  @Test
  public void url() {
	  String expurl="https://www.selenium.dev/";
	  String acturl=driver.getCurrentUrl();
	  Assert.assertEquals(expurl, acturl,"url validation successfull");
	  System.out.println("expectedurl: "+expurl);
	  System.out.println("actualurl: "+acturl);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
