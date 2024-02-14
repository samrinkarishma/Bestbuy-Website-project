package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Signuppage;

public class TC_03_Signuppagetest extends Baseclass {
	@Test
	public void signup() throws InterruptedException {
		//create an object of signup page
		Signuppage signup=new Signuppage(driver);
		signup.clickun();
		Switchwindow();
		signup.signup_linkclick();
		Switchwindow();  
		signup.createaccount();
		Switchwindow();
		signup.getfirstname(prop.getProperty("firstname"));
		signup.getlastname(prop.getProperty("lastname"));
		signup.getemail(prop.getProperty("email"));
		signup.getpassword(prop.getProperty("password"));
		signup.getconfirmpassword(prop.getProperty("cpassword"));
		signup.getmobilenumber(prop.getProperty("mnumber"));
		signup.recoverybtn();
		signup.createaccbtn();
}
}

