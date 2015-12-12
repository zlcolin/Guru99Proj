package Guru99Pack;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	//declaration of attributes or elements
   By loginName = By.name("uid");
   By loginPassword = By.name("password");
   By titleText =By.className("barone");
   By loginbtn = By.name("btnLogin");
   
   //constructor
   public LoginPage(WebDriver driver){
	   this.driver = driver;
       }
   
 //login method
   public void loginToGuru99(String strUserName,String strPasword){
	   DOMConfigurator.configure("log4j.xml");
	   driver.findElement(loginName).sendKeys(strUserName);
	   driver.findElement(loginPassword).sendKeys(strPasword);
	   driver.findElement(loginbtn).click();
	   Reporter.log("User is logged in successfully",true);
	   Log.info("User is logged in successfully");
      }
   
     
   //Get the title of Login Page   
   public String getLoginTitle(){
    return    driver.findElement(titleText).getText();
   }
   
   

}
