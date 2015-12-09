package Guru99Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;





public class SupertestNG {
	
	public WebDriver driver;
	public LoginPage objLoginPage;
	public Excelclass objexcelsheet;
	public HomePage objHomePage;
	
	@BeforeMethod
	public void precondition() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		Reporter.log("Application is loaded", true);
		
		String FilePath="C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls";
		String Sheetname="Sheet1";
		objexcelsheet= new Excelclass(FilePath,Sheetname);
		String cel1= objexcelsheet.getRowID(1,0);
		String cel2= objexcelsheet.getRowPass(1,1);
		
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cel1,cel2);
		
		Reporter.log("User is logged in successfully", true);
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		Reporter.log("Application is logged out", true);
	}
	
	
}
