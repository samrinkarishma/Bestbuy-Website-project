package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bottomlinkpage {
	public class Homepage {
		//create webdriver variable
			public WebDriver driver;
			//initialize pagefactory class init method in constructor
			public Homepage(WebDriver driver) {
				//initialize pagefactory init and driver
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[1]")		
	List<WebElement>Order_purchases;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[3]")
	List<WebElement>Support_services;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[5]")
	List<WebElement>Partnerships_of_Webpage;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[2]")
	List<WebElement>Payment_Options;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[4]")
	List<WebElement>Rewards_Memberships;
	
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div[1]/div[6]")
	List<WebElement>About_Bestbuy;
	
	
	public List<WebElement>getorder_details(){
		return Order_purchases ;
	}
	
	public List<WebElement>getsupportservice_details(){
		return Support_services ;
	}
	
	public List<WebElement>get_patnershipof_webpage_details(){
		return Partnerships_of_Webpage;
	}
	
	public List<WebElement>get_payment_details(){
		return Payment_Options;
		
	}
	
	public List<WebElement>get_rewards_details(){
		return Rewards_Memberships;
		
	}
	
	public List<WebElement>get_bestbuy_details(){
		return About_Bestbuy;
		
	}

	}
}
	




