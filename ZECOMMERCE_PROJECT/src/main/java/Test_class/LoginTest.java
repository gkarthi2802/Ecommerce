package Test_class;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_utilities.Base_class;
import Page_objects.Create_an_account;
import Page_objects.Home_page;
import Page_objects.MyAccount;
import Page_objects.sign_in_page;

public class LoginTest extends Base_class {

	public Home_page home;	
	
	   public LoginTest() throws IOException {
	   super();
	   home = new Home_page();
	  
	  	   
	   }
		@BeforeMethod()
		public void setup() {
		
		Base_class.init();	
			
		}

	@Test(testName="New User Registration")	
	public void user_register() throws IOException, InterruptedException {
	//click on Sign in Page	
	sign_in_page sip =home.nav_sign_in();
	
	MyAccount ma = sip.login_to_account(prop.getProperty("email"), prop.getProperty("pwds"));
	
 String uname =	ma.get_text_uname();
 String actual = prop.getProperty("firstNam") + ' ' + prop.getProperty("LastNam");
  Assert.assertEquals(actual, uname);
     
	}
		
	@AfterMethod()
	public void tear_down() {

		driver.quit();
		
	}
	
	
	
	

}
