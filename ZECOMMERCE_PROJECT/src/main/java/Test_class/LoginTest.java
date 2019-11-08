package Test_class;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_utilities.Base_class;
import Regression_pack.Create_an_account;
import Regression_pack.Home_page;
import Regression_pack.MyAccount;
import Regression_pack.sign_in_page;

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
