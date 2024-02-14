package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




	public class Shoppingcartpage {
		
		
		//create webdriver variable
			public WebDriver driver;
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			
			//initialize pagefactory class init method in constructor
			public Shoppingcartpage(WebDriver driver) {
				//initialize pagefactory init and driver
				this.driver=driver;
				 this.executor = (JavascriptExecutor) this.driver;
				PageFactory.initElements(driver,this);
			}
			
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	WebElement Clickun;
			
	
	@FindBy(xpath="//input[@id=\"gh-search-input\"]")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class=\"header-search-button\"]")
	WebElement Searchicon;
	
	@FindBy(xpath="(//button[contains(@type,'button')][normalize-space()='Add to Cart'])[1]")
	WebElement Selecteditem;
	
	@FindBy(xpath="//button[@class=\"c-button-unstyled hamburger-menu-button\"]")
	WebElement clickmenu;
	
	@FindBy(xpath="//button[text()=\"Appliances\"]")
	WebElement shopby_department;
	
	@FindBy(xpath="//button[text()=\"Major Kitchen Appliances\"]")
	WebElement click_appliances;
	
	@FindBy(xpath="//a[normalize-space()=\"Refrigerators\"]")
	WebElement click_refrigerator_option;
	
	@FindBy(xpath="//*[@id=\"widget-966b63f6-f2e1-44f8-a434-e9daf7f3bb66\"]/div/div[2]/div[1]/div[5]/div/a")
	WebElement select_listed_option;
	
	@FindBy(xpath="(//*[name()='svg'][contains(@role,'img')])[27]")
	WebElement click_Addtocart;
	
	@FindBy(xpath="//button[normalize-space()='Brands']")
	WebElement clkbrands;
	
	@FindBy(xpath="//a[text()=\"Samsung\"]")
	WebElement clicksamsung;
	
	@FindBy(xpath="//a[text()=\"TV & Home Theater\"]")
	WebElement clkoption;
	
	@FindBy(xpath="//*[@id=\"widget-2b1c6e69-64ea-44c4-8d4c-61bd9c96106b\"]/div/div[2]/div/div[2]/div/a")
	WebElement clk_selectedopt;
	
	@FindBy(xpath="(//*[name()='svg'][contains(@role,'img')])[29]")
	WebElement addto_cart;
	
	@FindBy(xpath="//span[text()=\"Cart\"]")
	WebElement gotocart;
	
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
	WebElement clkcheckout;
	
	@FindBy(xpath="//input[@id=\"fld-e\"]")
	WebElement EnterEmail;
	
	@FindBy(xpath="//input[@id=\"fld-p1\"]")
	WebElement getpassword;
	
	@FindBy(xpath="//button[@class=\"c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit \"]")
	WebElement clksignin;
	
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-secondary\"]")
	WebElement clkcontinue;
	
	@FindBy(xpath="//input[@id=\"number\"]")
	WebElement card_details;
	
	@FindBy(xpath="//select[@id=\"expMonth\"]")
	WebElement selectexpmonth;
	
	@FindBy(xpath="//select[@id=\"expYear\"]")
	WebElement selectexpyear;
	
	@FindBy(xpath="//input[@id=\"cvv\"]")
	WebElement getcvv;
	
	@FindBy(xpath="//input[@id=\"first-name\"]")
	WebElement getfname;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	WebElement getlname;
	
	@FindBy(xpath="//input[@id=\"address-input\"]")
	WebElement getaddress;
	
	@FindBy(xpath="//input[@id=\"city\"]")
	WebElement getcity;
	
	@FindBy(xpath="//select[@id=\"state\"]")
	WebElement selectstate;
	
	@FindBy(xpath="//input[@id=\"postalCode\"]")
	WebElement getzipcode;
	
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-primary\"]")
	WebElement clk_placeorder;
	
	@FindBy(xpath="//button[@class=\"c-button c-button-secondary c-button-lg cia-guest-content__continue guest\"]")
	WebElement Continue_as_guest;
	
	@FindBy(xpath="//input[@id=\"user.emailAddress\"]")
	WebElement cemail;
	
	@FindBy(xpath="//input[@id=\"user.phone\"]")
	WebElement phnumber;
	
	 public void Gotocart() {
		 gotocart.click();
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
	
	
	  public void clickun() {
			Clickun.click();
		}
	  
	  public void get_searchboxvalue(String searchvalue) {
		  searchbox.sendKeys(searchvalue);		}
	  
	  public void clicksearch_icon() {
		  Searchicon.click();
	  }
	  
	  public void clickSelected_item() {
		  Selecteditem.click();
		  
	  }
	  
	  
	  public void select_menu() {
		  clickmenu.click();
		  
	  } 
	  
	  public void clk_shopby_department() {
		  shopby_department .click();
		  
	  } 
	  
	  public void Click_appliances() {
		  click_appliances.click();
		  
	  } 
	  
	  public void Click_refrigerator_option() {
		  click_refrigerator_option.click();
		  
	  } 
	  
	  public void Select_listed_option() {
		  select_listed_option.click();
		  
	  } 
	  
	  
	  public void Click_Addtocart() {
		  click_Addtocart.click();
		  
	  } 
	  
	  public void click_brand() {
		  clkbrands.click();
		}
       
	  public void Clicksamsung() {
		  clicksamsung.click();
		}
	  
	  public void clkoption() {
		  clkoption.click();
		}
	  
	  public void selectedopt() {
		  clk_selectedopt.click();
		}
	  
	  public void Addto_cart() {
		  addto_cart.click();
		}
	 
	  
	  public void Click_continue() {
		  clkcontinue.click();
	       // executor.executeScript("arguments[0].click();",clkcontinue );
	  }

	public void getcard_details(String details) {
		  card_details.sendKeys(details);
	  }
	  
	  public void Exp_month() throws InterruptedException                      
		{
		
			Select dropdown=new Select( selectexpmonth);
			  dropdown.selectByValue("03");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
	  public void Exp_year() throws InterruptedException                      
		{
		
			Select dropdown=new Select( selectexpyear);
			  dropdown.selectByValue("2024");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
	  
	  public void get_cvv_details(String cvv) {
		  getcvv.sendKeys(cvv);
	  }
	  
	  public void get_firstname(String fname) {
		  getfname.sendKeys(fname);
			
	  }
	  
	  public void get_lastname(String lname) {
		  getlname.sendKeys(lname);
			
	  }
	  
	  public void get_address(String address) {
		  getaddress.sendKeys(address);
			
	  }
	  
	  public void get_city(String city) {
		 getcity.sendKeys(city);
			
	  }
	  
	  public void getstate() throws InterruptedException                      
		{
		
			Select dropdown=new Select(selectstate);
			  dropdown.selectByValue("OK");
			  System.out.println(dropdown.getFirstSelectedOption().getText());
			  Thread.sleep(2000);
		}
	  
	  public void get_zipcode(String zipcode) {
			 getzipcode.sendKeys(zipcode);
				
		  }
	  public void click_placeorder() {
		  clk_placeorder.click();
				
		  }
	  public void clk_Continue_as_guest() {
		  Continue_as_guest.click();
	  }

	  public void getemail(String email) {
			 cemail.sendKeys(email);
			}
	  public void getphonenumber(String phonenumber) {
			 phnumber.sendKeys(phonenumber);
			}
}



