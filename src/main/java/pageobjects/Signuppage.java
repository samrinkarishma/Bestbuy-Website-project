package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	//create webdriver variable
			public WebDriver driver;
			//initialize pagefactory class init method in constructor
			public Signuppage(WebDriver driver) {
				//initialize pagefactory init and driver
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			//locate an element on signup page
			
			//signup dashboard link
			@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
			WebElement Clickun;
			
			@FindBy(xpath="//button[@id=\"account-menu-account-button\"]")
			WebElement signupclicklink;
			
			@FindBy(xpath="//a[text()=\"Create Account\"]")
			WebElement Createaccount;
			
			@FindBy(xpath="//input[@id=\"firstName\"]")
			WebElement Firstname ;
			
			@FindBy(xpath="//input[@id=\"lastName\"]")
			WebElement Lastname;
			
		    @FindBy(xpath="//input[@id=\"email\"]")
		    WebElement Emailaddress;
		    
		    @FindBy(xpath="//input[@id=\"fld-p1\"]")
		    WebElement Password;
		    
		    @FindBy(xpath="//input[@id=\"reenterPassword\"]")
		    WebElement Confirmpassword;
		    
		    @FindBy(xpath="//input[@id=\"phone\"]")
		    WebElement Mobilenumber;
		    
		    @FindBy(xpath="//input[@id=\"is-recovery-phone\"]")
		    WebElement selectaccrecovery;
		    
		    @FindBy(xpath="//button[text()=\"Create an Account\"]")
		    WebElement Submitbtn;
		    
		    public void clickun() {
				Clickun.click();
			}
			public void signup_linkclick() {
				signupclicklink.click();
			}

			public void createaccount() {
				Createaccount.click();
			}
			
			public void getfirstname(String firstname) {
				Firstname.sendKeys(firstname);
			}
			
			public void getlastname(String lastname) {
				Lastname.sendKeys(lastname);
			}
			
			public void getemail(String email) {
				Emailaddress.sendKeys(email);
			}
			public void getpassword(String password) {
				Password.sendKeys(password);
			}
			public void getconfirmpassword(String cpassword) {
				Confirmpassword.sendKeys(cpassword);
			}
			
			public void getmobilenumber(String mnumber) {
				Mobilenumber.sendKeys(mnumber);
			}
			
			public void recoverybtn() {
				selectaccrecovery.click();
			}

			public void createaccbtn() {
				Submitbtn.click();
			}
			
}
