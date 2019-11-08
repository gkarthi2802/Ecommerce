package Test_class;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_utilities.Base_class;
import Regression_pack.Create_an_account;
import Regression_pack.Home_page;
import Regression_pack.sign_in_page;

public class Registration extends Base_class {
 
public Home_page home;	
	
   public Registration() throws IOException {
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
Create_an_account caa =sip.register(prop.getProperty("email"));
String welcome_txt = caa.fill_registration();

Assert.assertEquals(prop.getProperty("welcomeText"), welcome_txt);	
}
	
@AfterMethod()
public void tear_down() {

	driver.quit();
	
}

}
