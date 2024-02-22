package com.demowebshop.testscript;

import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.pomrepository.RegisterPage;
import com.demowebshop.pomrepository.WelcomePage;

public class RegisterTest extends BaseTest{

	@Test
	public void TC_Register_001() throws Throwable {
		WelcomePage wc=new WelcomePage(driver);
		wc.Loginlink();
		Thread.sleep(2000);	
		RegisterPage rp=new RegisterPage(driver);
		rp.clickOnRegister();
		Thread.sleep(3000);
		rp.clickOnGender();
		rp.enterFirstName("vrr");
		rp.enterLastName("reddy");
		rp.enteremailId("vrr@gmail.com");
		rp.enterPassword("Password@123");
		rp.enterConfirmPassword("Password@123");
		Thread.sleep(3000);
		rp.clickOnRegisterbutton();
		Thread.sleep(3000);
		
		
	}
}
