package Guru99Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseandCommanFeature {
	//Elements:-
		WebDriver driver;	 
	    By homePageWelcomeText = By.xpath("//marquee");
	    By homePageManagerIDText = By.xpath("//table//table/tbody/tr[3]/td");
	 
	    //Methods and constructor:-
	    
	        public HomePage(WebDriver driver){
	    	super(driver);
	        this.driver = driver;
	    }
	 
	    //Get the Welcome text from Home Page
			public String getHomePageDashboardWelcomeText() {			
				String msg = driver.findElement(homePageWelcomeText).getText();
				return msg;
			}
}	
		
			

