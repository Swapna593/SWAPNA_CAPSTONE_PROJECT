package testing_pac;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZeroBankExcelSearch {
	@DataProvider(name="excelData")
	public Object[][] excelDataProvider() throws IOException{
		String excelPath="D:/TestData/LoginTest.xlsx";
		String sheetName="Sheet2";
		
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<cols;j++) {
				Cell cell=row.getCell(j);
				data[i-1][j]=(cell==null)?"":cell.toString();
			}
		}
		
		workbook.close();
		fis.close();
		
		return data;
    }
	@Test(dataProvider="excelData")
	public void testSearch(String search) throws InterruptedException {
		System.out.println("Searched for :"+search);
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		
		WebElement s=driver.findElement(By.id("searchTerm"));
		s.click();
		s.sendKeys(search);
		s.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
	}
}
