package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

		//create webdriver variable
			public WebDriver driver;
			//initialize pagefactory class init method in constructor
			public Checkoutpage(WebDriver driver) {
				//initialize pagefactory init and driver
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	WebElement Clickun;
			
	@FindBy(xpath="//span[text()=\"Cart\"]")
	WebElement gotocart;
	
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
	WebElement clkcheckout;
	
	@FindBy(xpath="//a[@class=\"btn btn-secondary btn-block btn-lg\"]")
	WebElement Continueshopping;
	
	@FindBy(xpath="//button[@class=\"c-button c-button-secondary c-button-lg cia-guest-content__continue guest\"]")
	WebElement Continue_as_guest;
	
	@FindBy(xpath="//p[text()=\"Samsung - Galaxy S24 Ultra 256GB (Unlocked) - Titanium Gray\"]")
	WebElement selectmob;
	
	@FindBy(xpath="//input[@id=\"fld-e\"]")
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@id=\"fld-p1\"]")
	WebElement getpassword;
	
	@FindBy(xpath="//button[@class=\"c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit \"]")
	WebElement clksignin;
	
	 public void clickun() {
		Clickun.click();
		}
	 
	 public void Gotocart() {
		 gotocart.click();
	 }
	 
	 public void continueshopping()
	 {
	   Continueshopping.click();    
		 
	 }
	 
	 public void Selectmob() {
		 selectmob.click();
	 }
	  
	 public void Clickcheckout() {
		 clkcheckout.click();
	 }
	
	 public void getemailaddress(String email) {
		 EnterEmail.sendKeys(email);
		}
		
		public void getpassword(String password) {
			getpassword.sendKeys(password);
		}
		
		public void submitbtn() {
			clksignin.click();
		}
		
		public void clk_Continue_as_guest() {
			  Continue_as_guest.click();
		  }
}
