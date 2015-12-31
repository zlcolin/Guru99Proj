package Guru99Pack;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;


//this class consists of common test cases for all the pages
public class CommonFeaturesClass_TestCases {
    
	public WebDriver driver;
	public BaseandCommanFeature objBaseClass;
	HomePage objHomePage; 
	
	
	//Constructor
	public CommonFeaturesClass_TestCases(WebDriver driver){
		this.driver = driver;
	}
	
	public void test_click_newCustomerLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickNewCustomerLink(driver);
		String NewCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(NewCustomerPageTitle.contains("Guru99 Bank New Customer Entry Page"));
		Reporter.log("User is navigated to New Customer Page successfully", true);
		
	} // end of test
	
	public void test_click_editCustomerLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickEditcustomerLink(driver);
		String EditCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(EditCustomerPageTitle.contains("Guru99 Bank Edit Customer Page"));
		Reporter.log("User is navigated to Edit Customer Page successfully", true);
		
	} // end of test
	
	public void test_click_deleteCustomerLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickDeleteCustomerLink(driver);
		String DeleteCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(DeleteCustomerPageTitle.contains("Guru99 Bank Delete Customer Page"));
		Reporter.log("User is navigated to Delete Customer Page successfully", true);
		
	} // end of test
	
	public void test_click_newAccountLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickNewAccountLink(driver);
		String NewAccountPageTitle = driver.getTitle();
		Assert.assertTrue(NewAccountPageTitle.contains("Guru99 bank add new account"));
		Reporter.log("User is navigated to New Account Page successfully", true);
		
	} // end of test
	
	public void test_click_editAccountLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickEditAccountLink(driver);
		String EditAccountPageTitle = driver.getTitle();
		Assert.assertTrue(EditAccountPageTitle.contains("Guru99 Edit Account Page"));
		Reporter.log("User is navigated to Edit Account Page successfully", true);
		
	} // end of test
	
	public void test_click_deleteAccountLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickDeleteAccountLink(driver);
		String DeleteAccountPageTitle = driver.getTitle();
		Assert.assertTrue(DeleteAccountPageTitle.contains("Guru99 Bank Delete Account Page"));
		Reporter.log("User is navigated to Delete Account Page successfully", true);
		
	} // end of test
	
	public void test_click_depositLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickDepositLink(driver);
		String DepositPageTitle = driver.getTitle();
		Assert.assertTrue(DepositPageTitle.contains("Guru99 Bank Amount Deposit Page"));
		Reporter.log("User is navigated to Deposit Page successfully", true);
		
	} // end of test
	
	public void test_click_withdrawalLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickWithdrawalLink(driver);
		String WithdrawalPageTitle = driver.getTitle();
		Assert.assertTrue(WithdrawalPageTitle.contains("Guru99 Bank Amount Withdrawal Page"));
		Reporter.log("User is navigated to Withdrawal Page successfully", true);
		
	} // end of test
	
	public void test_click_fundTransferLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickFundTransferLink(driver);
		String FundTransferPageTitle = driver.getTitle();
		Assert.assertTrue(FundTransferPageTitle.contains("Guru99 Bank Fund Transfer Entry Page"));
		Reporter.log("User is navigated to Fund Transfer Page successfully", true);
		
	} // end of test
	
	public void test_click_changePassword(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickChangePassword(driver);
		String ChangePasswordPageTitle = driver.getTitle();
		Assert.assertTrue(ChangePasswordPageTitle.contains("Guru99 Bank New Customer Entry Page"));
		Reporter.log("User is navigated to Change password Page successfully", true);
		
	} // end of test
	
	public void test_click_balanceEnquiry(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickBalanceEnquiry(driver);
		String BalanceEnquiryPageTitle = driver.getTitle();
		Assert.assertTrue(BalanceEnquiryPageTitle.contains("Guru99 Bank Balance Enquiry Page"));
		Reporter.log("User is navigated Balance Enqiry Page successfully", true);
		
	} // end of test
	
	public void test_click_miniStatement(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickMiniStatement(driver);
		String MiniStatementPageTitle = driver.getTitle();
		Assert.assertTrue(MiniStatementPageTitle.contains("Guru99 Bank Mini Statement Page"));
		Reporter.log("User is navigated to Mini Statement Page successfully", true);
		
	} // end of test
	
	public void test_click_customisedStatement(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickCustomisedStatement(driver);
		String CustomisedStatementPageTitle = driver.getTitle();
		Assert.assertTrue(CustomisedStatementPageTitle.contains("Guru99 Bank Statement Page"));
		Reporter.log("User is navigated to Customised Statement Page successfully", true);
	} // end of test
	
	public void test_click_homeLink(){
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickHomeLink(driver);
		String HomePageTitle = driver.getTitle();
		Assert.assertTrue(HomePageTitle.contains("Guru99 Bank Manager HomePage"));
		Reporter.log("User is navigated to Manager HomePage successfully", true);
	} // end of test
	
	
	public void test_click_Logout()throws Exception{
		objBaseClass = new BaseandCommanFeature(driver);
		objBaseClass.clickLogout(driver);

	} // end of test

}
