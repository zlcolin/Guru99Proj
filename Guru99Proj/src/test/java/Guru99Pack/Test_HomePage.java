package Guru99Pack;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIResults;


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
		//made the change in script	
		objHomePage= new HomePage(driver);
		String HomePagetxt = objHomePage.getHomePageDashboardWelcomeText();
		Assert.assertTrue(HomePagetxt.contains("Welcome To Manager's Page of Guru99 Bank"));
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc2.png"));
		Reporter.log("Welcome text is:"+HomePagetxt, true);
		
	}
	
	@Test (priority = 2)
	public void test_ClickingsidebarMenu() throws Exception {
		
		//Updating tc4 of testlink1 project
		
		UpdateTestlink a=new UpdateTestlink();
		String testProject="Guru99Proj";
		String testPlan="Iteration1";
		String testCase="0281-4";
		String build="Iteration1Build1";
		String notes= null;
		String result=null;
		
		try {
		System.out.println("3rd test case");
		objexcelsheet= new Excelclass("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\TestData.xls","Sheet1");
		String cel1= objexcelsheet.getRowID(1,0);
		String cel2= objexcelsheet.getRowPass(1,1);
		System.out.println("User Id is:" + cel1);
		System.out.println("password is:" + cel2);
		
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cel1,cel2);
				
		objCommon =new CommonFeaturesClass_TestCases(driver);
		//objLoginPage=new LoginPage(driver);
		
		objCommon.test_click_newCustomerLink();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_1.png"));
		
		driver.navigate().back();
		System.out.println("test_click_newCustomerLink is successful");
		
		objCommon.test_click_editCustomerLink();
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_2.png"));
		driver.navigate().back();
		System.out.println("test_click_editCustomerLink is successful");
		
		objCommon.test_click_deleteCustomerLink();
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_3.png"));
		driver.navigate().back();
		System.out.println("test_click_deleteCustomerLink is successful");
		
		objCommon.test_click_newAccountLink();
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_4.png"));
		driver.navigate().back();
		System.out.println("test_click_newAccountLink is successful");
		
		objCommon.test_click_editAccountLink();
		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile5, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_5.png"));
		driver.navigate().back();
		System.out.println("test_click_editAccountLink is successful");
		
		objCommon.test_click_deleteAccountLink();
		File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile6, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_6.png"));
		driver.navigate().back();
		System.out.println("test_click_deleteAccountLink is successful");
		
		objCommon.test_click_depositLink();
		File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile7, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_7.png"));
		driver.navigate().back();
		System.out.println("test_click_depositLink is successful");
		
		objCommon.test_click_withdrawalLink();
		File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile8, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_8.png"));
		driver.navigate().back();
		System.out.println("test_click_withdrawalLink is successful");
		
		objCommon.test_click_fundTransferLink();
		File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile9, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_9.png"));
		driver.navigate().back();
		System.out.println("test_click_fundTransferLink is successful");
		
		objCommon.test_click_changePassword();
		File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile10, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_10.png"));
		driver.navigate().back();
		System.out.println("test_click_changePasswordLink is successful");
		
		objCommon.test_click_balanceEnquiry();
		File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile11, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_11.png"));
		driver.navigate().back();
		System.out.println("test_click_balanceEnquiryLink is successful");
		
		objCommon.test_click_miniStatement();
		File scrFile12 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile12, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_12.png"));
		driver.navigate().back();
		System.out.println("test_click_miniStatementLink is successful");
		
		objCommon.test_click_customisedStatement();
		File scrFile13 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile13, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_13.png"));
		driver.navigate().back();
		System.out.println("test_click_customisedStatementLink is successful");
		
		objCommon.test_click_Logout();
		File scrFile14 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile14, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc3_14.png"));
		System.out.println("test_click_LogoutLink is successful");
		
			//IF no exception the we will update the test link with pass status.
				result= TestLinkAPIResults.TEST_PASSED;
				notes="Executed successfully";
				a.reportResult(testProject, testPlan, testCase, build, notes, result);
				}
				
			//If the exception occurs update the test link with fail status
				catch(Exception e){
					result=TestLinkAPIResults.TEST_FAILED;
					notes="Execution failed";
					}
					finally{
					a.reportResult(testProject, testPlan, testCase, build, notes, result);
				}
		
		
	}
	
	
	
}
