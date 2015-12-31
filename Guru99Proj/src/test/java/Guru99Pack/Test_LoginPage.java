package Guru99Pack;


import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.apache.commons.io.FileUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
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
		
		//Creating Pie Chart
		DefaultPieDataset pieDataset = new DefaultPieDataset();
		 pieDataset.setValue("PASS", new Integer(65));
		 pieDataset.setValue("FAIL", new Integer(25));
		 pieDataset.setValue("N/A", new Integer(10));

		 JFreeChart piechart = ChartFactory.createPieChart("Test Case Execution Status", pieDataset, true, true, false);
		 ChartUtilities.saveChartAsJPEG(new File("C:\\Documents and Settings\\Pooja T\\git\\Guru99Proj\\Guru99Proj\\Charts\\simplePiechart.jpg"), piechart, 400, 400);
		 
		objexcelsheet.setResult(1, 2,"Pass" );
		System.out.println ("Will start connecting with SQL server ");
		
		//Loading the required JDBC Driver class
		System.out.println ("Loading the required JDBC Driver class ");
		String dbclass="com.mysql.jdbc.Driver";
		Class.forName(dbclass).newInstance();	
		

		//Creating a connection to the database Connection 
		System.out.println ("Creating a connection to the database Connection ");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bugs","root",""); 
		
		
		//Creating statement object for the queries
		Statement st = conn.createStatement(); 
		System.out.println ("Creating statement object for the queries ");
		
		//Executing SQL query and fetching the result 
		ResultSet rs = st.executeQuery("select * from bugs_fulltext"); 
		System.out.println ("Executing SQL query and fetching the result  ");
		System.out.println ("loop fo SQL");
		while (rs.next()) 
		{ System.out.println(rs.getString("short_desc")); 
		
		} 
		System.out.println ("loop for SQL ended  ");
		
	}
}// end of class
