package com.demowebshop.testscript;

import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.pomrepository.LoginPage;
import com.demowebshop.pomrepository.WelcomePage;

public class LoginTest  extends BaseTest{
	
	@Test
	public void TC_Login_00() throws Throwable {
		WelcomePage wp=new WelcomePage(driver);
		wp.Loginlink();
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailId("automationengineer003@testmail.com");
		lp.enterPassword("Password@123");
		Thread.sleep(3000);
		lp.clickLoginButton();
		Thread.sleep(3000);
		lp.clickLogOutButton();
		Thread.sleep(3000);
	}

}
