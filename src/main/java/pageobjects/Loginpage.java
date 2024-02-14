package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//create webdriver variable
	public WebDriver driver;
	//initialize pagefactory class init method in constructor
	public Loginpage(WebDriver driver) {
		//initialize pagefactory init and driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//locate an element on signup page
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	WebElement Clickun;
	
	//link click
	@FindBy(xpath="//button[@id=\"account-menu-account-button\"]")
	WebElement Loginlinkfield;
	
	@FindBy(xpath="//a[text()=\"Sign In\"]")
	WebElement Signin;
	
	@FindBy(xpath="//input[@id=\"fld-e\"]")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@id=\"fld-p1\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Submit;
	
	 public void clickun() {
			Clickun.click();
		}
	
	public void loginlink() {
		Loginlinkfield.click();
	}
	
	public void Signinbtn() {
		Signin.click();
	}
	
	public void getemailaddress(String email) {
		emailaddress.sendKeys(email);
	}
	
	public void getpassword(String password) {
		Password.sendKeys(password);
	}
	
	public void submitbtn() {
		Submit.click();
	}
}
