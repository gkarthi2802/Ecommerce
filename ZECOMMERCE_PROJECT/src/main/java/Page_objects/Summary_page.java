package Page_objects;

import java.io.IOException;

import Page_objects.Address_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class Summary_page extends Base_class {

	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proc_check;

	public Summary_page() throws IOException {
		super();
       PageFactory.initElements(driver, this);		
		
	}
	
	public Address_page click_proc_check() throws IOException {
	
		proc_check.click();
		return new Address_page();
	}

	
	
}
