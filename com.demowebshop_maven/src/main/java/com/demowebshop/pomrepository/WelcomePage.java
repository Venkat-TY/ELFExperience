package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends Base_Page {

	@FindBy(xpath = "//a[text()='Log in']")
	WebElement LoginClick;
	
	public WelcomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public void Loginlink() {
		LoginClick.click();
		
	}
}
