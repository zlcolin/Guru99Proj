package Guru99Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SupertestNG {
	
	public WebDriver driver;
	public Excelclass objexcelsheet;
	
	
	@BeforeMethod
	@Parameters( { "Browser1" } )
	public void precondition(@Optional String Browser1) throws Exception {
		System.out.println("Browser executing is : " + Browser1);
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
