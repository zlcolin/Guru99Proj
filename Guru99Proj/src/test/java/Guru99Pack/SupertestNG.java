package Guru99Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class SupertestNG {
	
	public WebDriver driver;
	public LoginPage objLoginPage;
	public HomePage objHomePage;
	
	@BeforeMethod
	public void precondition() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		Reporter.log("Application is loaded", true);
		
		FileInputStream fis;
		Workbook wb;
		Sheet sh;
		Row rw;
		Cell cell1;
		String cellval1;
		Cell cell2;
		String cellval2;
		
		try {
		fis=new FileInputStream("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
				
		} catch (Exception e){
			throw (e);
		}
		
		try {
		rw=sh.getRow(1);
		cell1=rw.getCell(0);
		cellval1=cell1.getStringCellValue();
			
		cell2=rw.getCell(1);
		cellval2=cell2.getStringCellValue();
				
		} catch (Exception e){
			throw (e);
		}
		
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cellval1,cellval2);
		
		Reporter.log("User is logged in successfully", true);
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		Reporter.log("Application is logged out", true);
	}
	
	
}
