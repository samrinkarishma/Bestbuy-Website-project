package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Locationpage{
	//create webdriver variable
	public WebDriver driver;
	//initialize pagefactory class init method in constructor
	public Locationpage(WebDriver driver) {
		//initialize pagefactory init and driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	
	
	@FindBy(className="us-link")
	WebElement countryUSA;
	
	@FindBy(className="canada-link")
	WebElement countryCanada;
	
	
	
	public void deliveryAtUSA() {
		countryUSA.click();
	}
	
	public void deliveryAtCanada() {
		countryCanada.click();
	}
}
