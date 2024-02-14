package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Shoppingcartpage;

public class TC_06b_shopbydepartment extends Baseclass {
	@Test
	public void add_itemsin_shopbydepartment() throws InterruptedException {
		Shoppingcartpage shoppingcart = new Shoppingcartpage(driver);
		shoppingcart.clickun();
		Thread.sleep(2000);
		shoppingcart.select_menu();
		Thread.sleep(2000);
		shoppingcart.clk_shopby_department();
		Thread.sleep(2000);
		shoppingcart.Click_appliances();
		Thread.sleep(2000);
		shoppingcart.Click_refrigerator_option();
		Thread.sleep(2000);
		shoppingcart.Select_listed_option();
		Thread.sleep(2000);
		shoppingcart.Click_Addtocart();
	}
}
