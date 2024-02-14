package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Shoppingcartpage;

public class TC_06_Shoppingcarttest extends Baseclass{

	@Test
	public void search_additemto_cart() throws InterruptedException{
		Shoppingcartpage shoppingcart = new Shoppingcartpage(driver);
		shoppingcart.clickun();
		shoppingcart.get_searchboxvalue(prop.getProperty("searchvalue"));
		shoppingcart.clicksearch_icon();
		shoppingcart.clickSelected_item();
		
}
	
	
@Test
    public void checkout_the_addingitems() throws InterruptedException {
	Shoppingcartpage shoppingcart = new Shoppingcartpage(driver);
	shoppingcart.clickun();
	shoppingcart.select_menu();
	Thread.sleep(2000);
	shoppingcart.click_brand();
	Thread.sleep(4000);
	shoppingcart.Clicksamsung();
	Thread.sleep(2000);
	shoppingcart.clkoption();
	Thread.sleep(2000);
	shoppingcart.selectedopt();
	Thread.sleep(4000);
	shoppingcart.Addto_cart();
	Thread.sleep(2000);
	shoppingcart.Gotocart();
	Thread.sleep(2000);
	shoppingcart.Clickcheckout();
	Thread.sleep(2000);
	//shoppingcart.getemailaddress(prop.getProperty("email"));
	//Thread.sleep(2000);
	//shoppingcart.getpassword(prop.getProperty("password"));
	//Thread.sleep(2000);
	//shoppingcart.submitbtn();
	//Thread.sleep(6000);
	shoppingcart.clk_Continue_as_guest();
	Thread.sleep(2000);
	shoppingcart.getemail(prop.getProperty("email"));
	Thread.sleep(2000);
	shoppingcart.getphonenumber(prop.getProperty("phonenumber"));
	Thread.sleep(2000);
	shoppingcart.Click_continue();
	Thread.sleep(8000);
	shoppingcart.getcard_details(prop.getProperty("details"));
	Thread.sleep(4000);
	shoppingcart.Exp_month();
	Thread.sleep(2000);
	shoppingcart.Exp_year();
	Thread.sleep(2000);
	shoppingcart.get_cvv_details(prop.getProperty("cvv"));
	Thread.sleep(2000);
	shoppingcart.get_firstname(prop.getProperty("fname"));
	Thread.sleep(2000);
	shoppingcart.get_lastname(prop.getProperty("lname"));
	Thread.sleep(2000);
	shoppingcart.get_address(prop.getProperty("address"));
	Thread.sleep(2000);
	shoppingcart.get_city(prop.getProperty("city"));
	Thread.sleep(2000);
	shoppingcart.getstate();
	Thread.sleep(2000);
	shoppingcart.get_zipcode(prop.getProperty("zipcode"));
	Thread.sleep(2000);
	shoppingcart.click_placeorder();
	
    }
}
