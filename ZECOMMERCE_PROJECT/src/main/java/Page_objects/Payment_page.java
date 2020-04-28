package Page_objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class Payment_page extends Base_class {

@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")	
WebElement pay_by_bank;

@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
WebElement confirm_order;

@FindBy(xpath="//*[@id=\"center_column\"]/div/p")
WebElement message_confirm;




	
	
	
	
public Payment_page() throws IOException {
	super();
	  PageFactory.initElements(driver, this);	
	
}


public void click_pay_by_bank() {

	pay_by_bank.click();	
}

public void click_confirm_order() {
confirm_order.click();	
}

public String message_confirm() {

	return message_confirm.getText();
}

public String perform_all_payment_page() {

	this.click_pay_by_bank();
	this.click_confirm_order();
return this.message_confirm();
}

}
