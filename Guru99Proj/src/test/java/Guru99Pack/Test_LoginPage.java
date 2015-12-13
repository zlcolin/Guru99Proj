package Guru99Pack;


import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Test_LoginPage extends SupertestNG {
	
	public LoginPage objLoginPage;
	public HomePage objHomePage;
	public Excelclass objexcelsheet;
	
	@Test (priority = 0)
	@Parameters( { "TestPlanWPath" ,"Sheetname"})
		public void test_LoginPage_VerifyLogin(String TestPlanWPath, String Sheetname) throws Exception{
		System.out.println("1st test case");
		objexcelsheet= new Excelclass(TestPlanWPath,Sheetname);
		String cel1= objexcelsheet.getRowID(1,0);
		String cel2= objexcelsheet.getRowPass(1,1);
		System.out.println("User Id is:" + cel1);
		System.out.println("password is:" + cel2);
		objLoginPage=new LoginPage(driver);
		objLoginPage.loginToGuru99(cel1,cel2);
			
		String LoginPageTitle = objLoginPage.getLoginTitle();
		Assert.assertTrue(LoginPageTitle.toLowerCase().contains("guru99 bank"));
		Reporter.log("Title of login page is:"+LoginPageTitle.toLowerCase(), true);
		Reporter.log("User is logged in successfully and the login page is also verified", true);
		
		//Screenshots
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\AllSnagits\\Tc1.png"));
		
		//Creating PDF
		
		String FILE = "C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\PDF_Report\\Results.PDF";
		Document document = new Document();
		PdfWriter.getInstance(document,	new FileOutputStream(FILE));
		document.open();
		document.add(new Paragraph("User is logged in successfully ."));
		document.add(new Paragraph("login page is also verified"));
		document.close();
		
		objexcelsheet.setResult(1, 2,"Pass" );
	} // end of test
	
}// end of class
