package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Loginpage;

public class TC_02_Loginpagetest extends Baseclass {
	
	@Test
	public void Loginpage() throws InterruptedException{
		Reporter.log("Welcome to loginpage",true);		
		//create an object of loginpage
		Loginpage loginobj=new Loginpage(driver);
		
		loginobj.clickun();
		Thread.sleep(3000);
		loginobj.loginlink();
		loginobj.Signinbtn();
		Thread.sleep(3000);
		Switchwindow();
		loginobj.getemailaddress(prop.getProperty("email"));
		loginobj.getpassword(prop.getProperty("password"));
		Thread.sleep(3000);
        loginobj.submitbtn();
}
}

