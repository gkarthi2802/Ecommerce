package Regression_pack;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class sign_in_page extends Base_class {

	public String emailid;
	public String pwd;

	//Elements of that Page.

// Create an Account side.
	
@FindBy(id="email_create")	
WebElement email_id;

@FindBy(id="SubmitCreate")
WebElement create;

//Already Registered User Items..

@FindBy(id="email")	
WebElement email;



@FindBy(id="passwd")	
WebElement password;

@FindBy(id="SubmitLogin")
WebElement login;

//Actions of New UserRegistration.

public sign_in_page() throws IOException {
	super();
	emailid =prop.getProperty("email");
	pwd = prop.getProperty("password");
	PageFactory.initElements(driver, this);
}

public void sendKeys_emailid(String emailid ) {
 email_id.sendKeys(emailid)	;
 
}

public Create_an_account click_create() throws IOException {
create.click();	
 return new Create_an_account();
}
	
public Create_an_account register(String emailid) throws IOException {

this.sendKeys_emailid(emailid);
return 	this.click_create();
	
	
} 

//Actions related to the Already Login user

public void send_keys_email(String emailid) {

email.sendKeys(emailid);	
		
}

public void send_keys_password(String pwd) {

	password.sendKeys(pwd);
	
}

public MyAccount click_login() throws IOException {

	login.click();
	return new MyAccount();
	
}

public MyAccount login_to_account(String email_id, String pwd) throws IOException {

 this.send_keys_email(email_id);	
 this.send_keys_password(pwd);
return this.click_login();
	
}
}
