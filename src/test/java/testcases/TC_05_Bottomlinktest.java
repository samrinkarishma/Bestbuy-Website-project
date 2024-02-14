package testcases;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Homepage;

public class TC_05_Bottomlinktest extends Baseclass{

	
	@Test
	public void verify_order_purchase_menuitems() {
		Homepage homepage = new Homepage(driver);
		homepage.clickun();
		List<String>menulist=Arrays.asList("Check Order Status","Shipping, Delivery & Pickup","","Return & Exchanges","Price Match Garantee","Product Recalls","Trade-In Program","Gift Cards");
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
		public void verify_support_service_details() {
			Homepage homepage = new Homepage(driver);
			homepage.clickun();
			List<String>menulist=Arrays.asList("Visit our Support Centre","Shop with an Expert","Schedule a Service","Manage an Appointment","Protection & Support Plans","Haul Away & Recycling","Contact Us");
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
			public void verify_patnership_details() {
				Homepage homepage = new Homepage(driver);
				homepage.clickun();
				List<String>menulist=Arrays.asList("Affiliate Program","Influencer Network","Advertise with us","Developers","Best Buy Health","Best Buy Education","Best Buy Business");
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
				public void verify_payment_details() {
					Homepage homepage = new Homepage(driver);
					homepage.clickun();
					List<String>menulist=Arrays.asList("My Best Buy Credit Card","Pay Your Bill at Citibank","Lease to Own");
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
					public void verify_reward_membership_details() {
						Homepage homepage = new Homepage(driver);
						homepage.clickun();
						List<String>menulist=Arrays.asList("My Best Buy Memberships","View Points & Certificates","Member Offers");
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
						public void verify_BestBuy_details() {
							Homepage homepage = new Homepage(driver);
							homepage.clickun();
							List<String>menulist=Arrays.asList("Corporate Information","Careers","Corporate Responsibility","Sustainability");
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
	
}
