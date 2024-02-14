package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//create webdriver variable
		public WebDriver driver;
		//initialize pagefactory class init method in constructor
		public Homepage(WebDriver driver) {
			//initialize pagefactory init and driver
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
		WebElement Clickun;
		
		//locate an element on page
	    @FindBy(xpath="//a[@title='BestBuy.com']")
	    WebElement logo;
	    
	    @FindBy(xpath="//div[@class=\"row remove-margin full-bleed-row\"]//div[6]")
	    WebElement searchmob;
	    
	    @FindBy(xpath="//a[text()=\"Top Deals\"]")
	    WebElement Topdeals;
	    
	    @FindBy(xpath="//nav[@aria-label=\"utility\"]")
	    List<WebElement> allmenuitems;
	    
	    @FindBy(xpath="//div[@class=\"universal-nav-wrapper\"]")
	    List<WebElement> allmenuitems_1stline_of_Homepage;
	    
	    @FindBy(xpath="//button[@class=\"c-button-unstyled plButton recentlyViewed-button d-flex justify-content-center align-items-center\"]")
	    WebElement recently_viewed;
	    
	    @FindBy(xpath="//a[text()=\"Check Order Status\"]")
	    WebElement orderstatus;
	    
	    @FindBy(xpath="//strong[text()=\"Visit our Support Center\"]")
	    WebElement visitsupportcenter;
	    
	    @FindBy(xpath="//strong[text()=\"Check your Order Status\"]")
	    WebElement check_orderstatus;
	    
	    @FindBy(xpath="//strong[text()=\"Shipping, Delivery & Store Pickup\"]")
	    WebElement Pickup;
	    
	    @FindBy(xpath="//strong[text()=\"Returns & Exchanges\"]")
	    WebElement Return_Exchange;
	    //method  
	    
	    public void clickun() {
			Clickun.click();
		}
	    
		public Boolean islogodisplayed() {
			return logo.isDisplayed();
		}
		
		public Boolean click_searchmob() {
			return searchmob.isDisplayed();
			
			}
		public String verify_Topdeals_Title() {
			return driver.getTitle();
			
		}
		public List<WebElement>getmenuitems(){
			return allmenuitems;

		}
        
		public String verify_recentlyviewed_Title() {
			return driver.getTitle();
			
		}
		
		 public Boolean verifysupportcentre() {
			return visitsupportcenter.isDisplayed();
			
			}
		 
		 public Boolean check_yourorderstatus() {
				return check_orderstatus.isDisplayed();
				
				}
		 public Boolean pickup_details() {
				return Pickup.isDisplayed();
				
				}

		 public Boolean return_pickup_details() {
				return Return_Exchange.isDisplayed();
				
				}
}

