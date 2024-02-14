package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Checkoutpage;
import pageobjects.Shoppingcartpage;


public class TC_07_checkoutpagetest extends Baseclass{

	
	@Test
	
    public void checkout_the_addingitems() throws InterruptedException {
    	Checkoutpage checkout= new Checkoutpage(driver);
    	checkout.clickun();
    	Thread.sleep(2000); 
    	Shoppingcartpage shoppingcart = new Shoppingcartpage(driver);
    	shoppingcart.get_searchboxvalue(prop.getProperty("searchvalue"));
    	shoppingcart.clicksearch_icon();
    	Thread.sleep(2000);
    	shoppingcart.clickSelected_item();
    	Thread.sleep(2000);
    	shoppingcart.Click_Addtocart();
    	checkout.Gotocart();
    	Thread.sleep(2000); 
    	checkout.Clickcheckout();
    	Thread.sleep(2000); 	
    	shoppingcart.clk_Continue_as_guest();
    	Thread.sleep(2000);
    	shoppingcart.getemail(prop.getProperty("email"));
    	Thread.sleep(2000);
    	shoppingcart.getphonenumber(prop.getProperty("phonenumber"));
    	Thread.sleep(2000);
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
    	Thread.sleep(4000);
    	shoppingcart.get_zipcode(prop.getProperty("zipcode"));
    	Thread.sleep(4000);
    	shoppingcart.click_placeorder();
    	
    }
}
