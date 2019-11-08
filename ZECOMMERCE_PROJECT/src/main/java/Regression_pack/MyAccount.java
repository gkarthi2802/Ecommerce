package Regression_pack;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utilities.Base_class;

public class MyAccount extends Base_class {
@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
WebElement name;

@FindBy(partialLinkText="Women")
WebElement nav_women;

@FindBy(css="img[alt='Faded Short Sleeve T-shirts'")
WebElement faded;

@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
WebElement faded_cart;

@FindBy(css="img[alt='Blouse'")
WebElement blouse;

@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
WebElement blouse_cart;

@FindBy(css="img[alt ='Printed Summer Dress']")
WebElement psd;

@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
WebElement psd_cart;

@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
WebElement cont_shop;

@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
WebElement cart;

@FindBy(xpath="//*[@id=\"button_order_cart\"]/span")
WebElement check_out;

public MyAccount() throws IOException {
 super();	
 PageFactory.initElements(driver, this);	
}

public String get_text_uname() {

	return name.getText();
		
}

public void click_women() {

	nav_women.click();
	
}

public void click_checkout() {

Actions act = new Actions(driver);
act.moveToElement(cart).perform();
check_out.click();

	
}

public void add_to_cart_fadded() throws InterruptedException {

Actions act = new Actions(driver);	

act.moveToElement(faded).perform();

faded_cart.click();
Thread.sleep(1000);
cont_shop.click();

	
}


public void add_to_cart_blouse() throws InterruptedException {

Actions act = new Actions(driver);	

act.moveToElement(blouse).perform();

blouse_cart.click();

Thread.sleep(1000);
cont_shop.click();
}

public void add_to_cart_psd() throws InterruptedException {

Actions act = new Actions(driver);	

act.moveToElement(psd).perform();

Thread.sleep(1000);
psd_cart.click();

cont_shop.click();
}

public Summary_page add_to_cart_all() throws InterruptedException, IOException {

this.click_women();
Thread.sleep(2000);
this.add_to_cart_fadded();
Thread.sleep(2000);
this.add_to_cart_blouse();
Thread.sleep(2000);
this.add_to_cart_psd();
Thread.sleep(2000);
this.click_checkout();
return new Summary_page();
}
}
	
