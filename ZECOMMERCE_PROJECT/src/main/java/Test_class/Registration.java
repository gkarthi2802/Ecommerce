package Test_class;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
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
public void tear_down(ITestResult lis) {
 
	if(ITestResult.FAILURE==lis.getStatus())
	{
	try 
	{
	// Create refernce of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	// Call method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	FileUtils.copyFile(source, new File("C:\\Users\\Karthik\\git\\Ecommerce\\ZECOMMERCE_PROJECT\\Screenshots\\"+lis.getName()+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch(Exception e)
	{
		
	}
	}

	
	driver.quit();
	
}

}
