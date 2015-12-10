package Guru99Pack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test_HomePage extends SupertestNG {
	CommonFeaturesClass_TestCases objCommon;
	public LoginPage objLoginPage;
	public HomePage objHomePage;
	public Excelclass objexcelsheet;
	
	@Test (priority = 1)
	public void test_HomePage_VerifyWelcomeText() throws Exception{
		System.out.println("2nd test case");
		
		objexcelsheet= new Excelclass("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls","Sheet1");
		String cel1= objexcelsheet.getRowID(1,0);
		String cel2= objexcelsheet.getRowPass(1,1);
		System.out.println("User Id is:" + cel1);
		System.out.println("password is:" + cel2);
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cel1,cel2);
		Reporter.log("User is logged in successfully", true);
		
		objHomePage= new HomePage(driver);
		String HomePagetxt = objHomePage.getHomePageDashboardWelcomeText();
		Assert.assertTrue(HomePagetxt.contains("Welcome To Manager's Page of Guru99 Bank"));
		Reporter.log("Welcome text is:"+HomePagetxt, true);
		
	}
	
	@Test (priority = 2)
	public void test_ClickingsidebarMenu() throws Exception{
		System.out.println("3rd test case");
		objexcelsheet= new Excelclass("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls","Sheet1");
		String cel1= objexcelsheet.getRowID(1,0);
		String cel2= objexcelsheet.getRowPass(1,1);
		System.out.println("User Id is:" + cel1);
		System.out.println("password is:" + cel2);
		
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cel1,cel2);
		Reporter.log("User is logged in successfully", true);
		
		objCommon =new CommonFeaturesClass_TestCases(driver);
		objLoginPage=new LoginPage(driver);
		
		objCommon.test_click_newCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_newCustomerLink is successful");
		objCommon.test_click_editCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_editCustomerLink is successful");
		objCommon.test_click_deleteCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_deleteCustomerLink is successful");
		objCommon.test_click_newAccountLink();
		driver.navigate().back();
		System.out.println("test_click_newAccountLink is successful");
		objCommon.test_click_editAccountLink();
		driver.navigate().back();
		System.out.println("test_click_editAccountLink is successful");
		objCommon.test_click_deleteAccountLink();
		driver.navigate().back();
		System.out.println("test_click_deleteAccountLink is successful");
		objCommon.test_click_depositLink();
		driver.navigate().back();
		System.out.println("test_click_depositLink is successful");
		objCommon.test_click_withdrawalLink();
		driver.navigate().back();
		System.out.println("test_click_withdrawalLink is successful");
		objCommon.test_click_fundTransferLink();
		driver.navigate().back();
		System.out.println("test_click_fundTransferLink is successful");
		objCommon.test_click_changePassword();
		driver.navigate().back();
		System.out.println("test_click_changePasswordLink is successful");
		objCommon.test_click_balanceEnquiry();
		driver.navigate().back();
		System.out.println("test_click_balanceEnquiryLink is successful");
		objCommon.test_click_miniStatement();
		driver.navigate().back();
		System.out.println("test_click_miniStatementLink is successful");
		objCommon.test_click_customisedStatement();
		driver.navigate().back();
		System.out.println("test_click_customisedStatementLink is successful");
		objCommon.test_click_Logout();
		System.out.println("test_click_LogoutLink is successful");
		
		
		
	}
	
	
	
}
