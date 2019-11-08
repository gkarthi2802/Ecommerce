package Regression_pack;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class shipping_page extends Base_class {
	
@FindBy(id="cgv")	
WebElement terms;
@FindBy(name="processCarrier")
WebElement process_carrier;

public shipping_page() throws IOException {
 
	super();
    PageFactory.initElements(driver, this);			
	
}

public void click_terms() {
	terms.click();
}

public Payment_page click_proc_carrier() throws IOException {
    process_carrier.click(); 
	return new Payment_page();
}

public Payment_page all_operations_shipping() throws IOException {

	this.click_terms();
	return this.click_proc_carrier();
	
}

}
