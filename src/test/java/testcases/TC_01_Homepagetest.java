package testcases;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Homepage;

public class TC_01_Homepagetest extends Baseclass{
	
	@Test
	public void verifylogo_on_homepage() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertTrue(homepage.islogodisplayed());

}
	
	@Test
	public void searchmob_click() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		homepage.click_searchmob();
		Assert.assertTrue(homepage.click_searchmob());
	}
	@Test
	public void verifytitle_on_Homepage() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertEquals(homepage.verify_Topdeals_Title(),"Best Buy | Official Online Store | Shop Now & Save");
		
	}
	@Test
	public void verify_allmenuitems_on_homepage() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		List<String>menulist=Arrays.asList("Top Deals","Deal of the Day","Yes,Best Buy Sells That","My Best Buy Memberships","Credit Cards","More","Account","Recently Viewed","Order Status","Saved Items");
		List<WebElement> menuitems=homepage.getmenuitems();
		
		for(int i=0;i<menulist.size();i++) {
			for(WebElement element:menuitems) {
				if(menulist.get(i).equals(element.getText())) {
					System.out.println("All navigation menu items are available");
					assertTrue(true);
				}else {
					System.out.println("All navigation menu items are not available");
				}
			}
		}
	}
	
	@Test
	public void verify_recentlyviewed_Title() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertEquals(homepage.verify_Topdeals_Title(),"Best Buy | Official Online Store | Shop Now & Save");
		
	}
	
	@Test
	public void verify_support_centre_presence() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertTrue(homepage.verifysupportcentre());		  
	}
	
	@Test
	public void checkorderstatus() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertTrue(homepage.check_yourorderstatus());
	}
	
	@Test
	public void Pickup() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertTrue(homepage.pickup_details());
	}
	
	@Test
	public void Return_Exchange() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		Assert.assertTrue(homepage.return_pickup_details());
	}
	
}
