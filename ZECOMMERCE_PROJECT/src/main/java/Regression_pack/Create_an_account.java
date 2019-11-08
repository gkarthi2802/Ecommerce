package Regression_pack;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_utilities.Base_class;

public class Create_an_account extends Base_class {

	// variables..
	public String firstNam;
	public String LastNam;
    public String pwds;
    public String comp;
    public String addr1;
    public String addr2;
    public String citys;
    public String stats;
    public String pcode;
    public String cntry;
    public String phoneno;
    public String address;
	
	
	
@FindBy(id="id_gender1")
WebElement mr;

@FindBy(id="id_gender2")
WebElement mrs ;

@FindBy(id="customer_firstname")
WebElement first_name;

@FindBy(id="customer_lastname")
WebElement lastName;

@FindBy(id="passwd")
WebElement pwd;

@FindBy(id="days")
WebElement days;

@FindBy(id = "months")
WebElement month;

@FindBy(id="years")
WebElement years;

// Your Years
@FindBy(id="company")
WebElement company;

@FindBy(id="address1")
WebElement address1;

@FindBy(id="address2")
WebElement address2;

@FindBy(id="city")
WebElement city;

@FindBy(id="id_state")
WebElement state;

@FindBy(id="postcode")
WebElement postcode;

@FindBy(id="id_country")
WebElement country;

@FindBy(id="phone")
WebElement phone;

@FindBy(id="phone_mobile")
WebElement mobile;

@FindBy(name="alias")
WebElement myAdress;

@FindBy(name="submitAccount")
WebElement register;

@FindBy(css="p[class='info-account']")
WebElement welcome;

public Create_an_account() throws IOException {
super()	;
PageFactory.initElements(driver, this);	

firstNam = prop.getProperty("firstNam");
 LastNam = prop.getProperty("LastNam");
 pwds    = prop.getProperty("pwds");
 comp    = prop.getProperty("comp");
 addr1   = prop.getProperty("addr1");
 addr2   = prop.getProperty("addr2");
 citys   = prop.getProperty("citys");
 stats   = prop.getProperty("stats");
 pcode   = prop.getProperty("pcode");
 cntry   = prop.getProperty("cntry");
 phoneno = prop.getProperty("phoneno");
 address = prop.getProperty("address");

}

public void click_mr() {

mr.click();	
}

public void click_mrs() {

mrs.click();	
}

public void send_keys_firstName(String firstName) {

first_name.sendKeys(firstName);	
}

public void send_keys_lastName(String last_Name) {

lastName.sendKeys(last_Name);
}

public void send_keys_password(String pwds) {
 pwd.sendKeys(pwds);	
}

public void select_day() {

Select day = new Select(days);
day.selectByIndex(28);
	
}

public void select_month() {

Select months = new Select(month);
months.selectByIndex(2);
	
}

public void select_year() {

	Select year = new Select(years);
	year.selectByIndex(10);	
}


public void send_keys_company(String comp)
{
 company.sendKeys(comp);	
}

public void send_keys_addr1(String addr1)
{
 address1.sendKeys(addr1);	
}

public void send_keys_addr2(String addr2)
{
 address2.sendKeys(addr2);	
}
public void send_keys_state(String stats)
{
	Select stat = new Select(state);
	stat.selectByIndex(2);	
}

public void send_key_city(String cit)
{
	 city.sendKeys(cit);	
}

public void send_keys_pcode(String pcode)
{
	 postcode.sendKeys(pcode);	
}

public void send_keys_country(String cntry)
{
	Select cnt = new Select(country);
	 cnt.selectByIndex(1);	
}

public void send_keys_phone(String phoneno)
{
	 phone.sendKeys(phoneno);	
}

public void send_keys_mobile(String mobileno)
{
	 mobile.sendKeys(mobileno);	
}

public void send_keys_myAdress(String address)
{
	 myAdress.sendKeys(address);	
}

public void click_register() {

	register.click();
	
}

public String get_string_welcome() {

return 	welcome.getText();
}

public String fill_registration() {

this.click_mr();
this.send_keys_firstName(this.firstNam);
this.send_keys_lastName(this.LastNam);	
this.send_keys_password(this.pwds);	
this.select_day();
this.select_month();
this.select_year();
this.send_keys_company(this.comp);
this.send_keys_addr1(this.addr1);
this.send_keys_addr2(this.addr2);
this.send_key_city(this.citys);
this.send_keys_state(this.stats);
this.send_keys_pcode(this.pcode);
this.send_keys_country(this.cntry);
this.send_keys_phone(this.phoneno);
this.send_keys_myAdress(this.address);
this.click_register();
return this.get_string_welcome();	
}


}
