package Page_objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class Address_page extends Base_class {

	@FindBy(name="processAddress")
	WebElement processAddres;

	public Address_page() throws IOException {
		super();
	       PageFactory.initElements(driver, this);		
	
	}

	public Page_objects.shipping_page click_Adress_process() throws IOException {
	
	processAddres.click();	
	return new Page_objects.shipping_page();
	}

}
