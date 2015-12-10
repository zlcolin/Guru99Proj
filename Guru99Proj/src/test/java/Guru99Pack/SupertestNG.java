package Guru99Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SupertestNG {
	
	public WebDriver driver;
	public Excelclass objexcelsheet;
	
	
	@BeforeMethod
	public void precondition() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		Reporter.log("Application is loaded", true);
}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		Reporter.log("Application is logged out", true);
	}
	
	
}
