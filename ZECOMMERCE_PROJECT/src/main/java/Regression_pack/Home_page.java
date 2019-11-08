package Regression_pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class Home_page extends Base_class {

@FindBy(linkText="Contact us")
WebElement Contact_us;	

@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
WebElement Sign_in;


public Home_page() throws IOException {
	super();

	PageFactory.initElements(driver, this);
	
}

public void click_sign_in() {

//Sign_in.click();	
driver.findElement(By.partialLinkText("Sign in")).click();	
	
	
}

public void click_contact_us() {

Contact_us.click();	
	
}

public sign_in_page nav_sign_in() throws IOException {

this.click_sign_in();

return  new sign_in_page();
	
}

}
