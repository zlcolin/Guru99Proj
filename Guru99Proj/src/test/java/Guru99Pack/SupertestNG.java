package Guru99Pack;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import javax.activation.DataHandler;
 
import javax.activation.DataSource;
 
import javax.activation.FileDataSource;
 
import javax.mail.BodyPart;
 
import javax.mail.Message;
 
import javax.mail.MessagingException;
 
import javax.mail.Multipart;
 
import javax.mail.Session;
 
import javax.mail.Transport;
 
import javax.mail.internet.AddressException;
 
import javax.mail.internet.InternetAddress;
 
import javax.mail.internet.MimeBodyPart;
 
import javax.mail.internet.MimeMessage;
 
import javax.mail.internet.MimeMultipart;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SupertestNG {
	
	public WebDriver driver;
	public Excelclass objexcelsheet;
	
	
	@BeforeMethod
	@Parameters( { "Browser1" } )
	public void precondition(@Optional String Browser1) throws Exception {
		if(Browser1.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		    System.out.println("Browser executing is : " + Browser1);
			}
		else if(Browser1.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\selenium_java_client_driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser executing is : " + Browser1);
		}
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
	//After complete execution send pdf report by email
	 
    @AfterSuite
 
    public void tearDown(){
 
        sendPDFReportByGMail("nick2006grey@gmail.com", "ramani@123", "nick2006grey@gmail.com", "PDF Report", "");
 
        }
 
     
 
    
private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
 
Properties props = System.getProperties();
 
String host = "smtp.gmail.com";
 
props.put("mail.smtp.starttls.enable", "true");
 
props.put("mail.smtp.host", host);
 
props.put("mail.smtp.user", from);
 
props.put("mail.smtp.password", pass);
 
props.put("mail.smtp.port", "587");
 
props.put("mail.smtp.auth", "true");
 
Session session = Session.getDefaultInstance(props);
 
MimeMessage message = new MimeMessage(session);
 
try {
 
    //Set from address
 
message.setFrom(new InternetAddress(from));
 
message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
 
//Set subject
 
message.setSubject(subject);
 
message.setText(body);
 
BodyPart objMessageBodyPart = new MimeBodyPart();
 
objMessageBodyPart.setText("Please Find The Attached Report File!");
 
Multipart multipart = new MimeMultipart();
 
multipart.addBodyPart(objMessageBodyPart);
 
objMessageBodyPart = new MimeBodyPart();
 
//Set path to the pdf report file
 
String filename = System.getProperty("user.dir")+"\\PDF_Report\\Results.PDF";
 
//Create data source to attach the file in mail
 
DataSource source = new FileDataSource(filename);
 
objMessageBodyPart.setDataHandler(new DataHandler(source));
 
objMessageBodyPart.setFileName(filename);
 
multipart.addBodyPart(objMessageBodyPart);
 
message.setContent(multipart);
 
Transport transport = session.getTransport("smtp");
 
transport.connect(host, from, pass);
 
transport.sendMessage(message, message.getAllRecipients());
 
transport.close();
 
}
 
catch (AddressException ae) {
 
ae.printStackTrace();
 
}
 
catch (MessagingException me) {
 
me.printStackTrace();
 
}
 
}
 
}      
	