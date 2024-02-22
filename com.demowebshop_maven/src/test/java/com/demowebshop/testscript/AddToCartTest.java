package com.demowebshop.testscript;

import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.BaseTest;
import com.demowebshop.pomrepository.AddToCart_Page;
import com.demowebshop.pomrepository.LoginPage;
import com.demowebshop.pomrepository.WelcomePage;

public class AddToCartTest extends BaseTest{
	
	@Test
	public void TC_AddToCart_001() throws Throwable {
		WelcomePage wp=new WelcomePage(driver);
		wp.Loginlink();
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailId("automationengineer003@testmail.com");
		lp.enterPassword("Password@123");
		Thread.sleep(3000);
		lp.clickLoginButton();
		Thread.sleep(3000);
		AddToCart_Page atc=new AddToCart_Page(driver);
		atc.clickOnBooksLink();
		Thread.sleep(3000);
		atc.ClickOnAddToCartForFirstProduct();
		Thread.sleep(3000);
		atc.ClickOnAddToCartForSecondProduct();
		Thread.sleep(3000);
		atc.ClickOnShoppingCartLink();
		Thread.sleep(3000);
		System.out.println(atc.getShoppingCartFirstRowProductName().getText());
		Thread.sleep(3000);
		System.out.println(atc.getShoppingCartSecondRowProductName().getText());
		Thread.sleep(4000);
		atc.ClickOnShoppingCartFirstRowRemoveItem();
		atc.ClickOnShoppingCartSecondRowRemoveItem();
		Thread.sleep(4000);
		atc.clickOnUpdateShoppingCartButton();
		
		
		
	}

}
