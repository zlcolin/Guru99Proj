package Guru99Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class LoginPage {
	WebDriver driver;
	 
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
	   driver.findElement(loginName).sendKeys(strUserName);
	   driver.findElement(loginPassword).sendKeys(strPasword);
	   driver.findElement(loginbtn).click();
	   Reporter.log("User is logged in successfully",true);
      }
   
     
   //Get the title of Login Page   
   public String getLoginTitle(){
    return    driver.findElement(titleText).getText();
   }
   
   

}
