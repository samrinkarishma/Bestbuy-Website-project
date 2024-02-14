package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Shoppingcartpage;

public class TC_06a_shopbybrand extends Baseclass{

	@Test
	public void additem_shobby_brand() throws InterruptedException {
		Shoppingcartpage shoppingcart = new Shoppingcartpage(driver);
		shoppingcart.clickun();
		Thread.sleep(2000);
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
	}
	
}
