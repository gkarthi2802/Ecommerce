package Test_class;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_utilities.Base_class;
import Page_objects.Address_page;
import Page_objects.Home_page;
import Page_objects.MyAccount;
import Page_objects.Payment_page;
import Page_objects.Summary_page;
import Page_objects.shipping_page;
import Page_objects.sign_in_page;

public class CartTest extends Base_class {

public Home_page home;		
public CartTest() throws IOException {
	super();
   home = new Home_page();
}
	


	@BeforeMethod()
	public void setup() {
	
	Base_class.init();	
		
	}

@Test(testName="Add items to Cart")	
public void add_items_to_cart() throws IOException, InterruptedException {
//click on Sign in Page	
sign_in_page sip =home.nav_sign_in();

MyAccount ma = sip.login_to_account(prop.getProperty("email"), prop.getProperty("pwds"));

Summary_page sp = ma.add_to_cart_all();
Address_page ap = sp.click_proc_check();
shipping_page ship_page = ap.click_Adress_process();
Payment_page pg = ship_page.all_operations_shipping();
String txt23 = pg.perform_all_payment_page();

Assert.assertEquals(txt23,prop.getProperty("success_msg") );



}
	
@AfterMethod()
public void tear_down() {

	driver.quit();
	
}

	
	
}
