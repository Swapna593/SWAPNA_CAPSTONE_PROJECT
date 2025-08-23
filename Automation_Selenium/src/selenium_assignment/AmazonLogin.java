package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5twasf2d2w_e&adgrpid=1318316051640309&hvadid=82395019828275&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149009&hvtargid=kwd-82395637438085:loc-90&hydadcr=5652_2377259&mcid=b983ec7c37413e6ab8b5124ff4bfc77b");
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		WebElement email=driver.findElement(By.id("ap_email_login"));
		email.click();
		email.sendKeys("swapnaankireddy92@gmail.com");
		
		driver.findElement(By.className("a-button-input")).click();
		
		WebElement password=driver.findElement(By.id("ap_password"));
		password.click();
		password.sendKeys("Swapna@123");
		
		driver.findElement(By.id("signInSubmit")).click();
	}

}
