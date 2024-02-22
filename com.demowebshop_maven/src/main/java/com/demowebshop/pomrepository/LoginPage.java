package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base_Page {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Email")
	WebElement emailTextField;
	
	public void enterEmailId(String email) {
		emailTextField.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	WebElement passwordTextField;
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginbutton;
	
	public void clickLoginButton() {
		loginbutton.click();
	}
	
	@FindBy(className = "ico-logout")
	WebElement logoutbutton;
	
	public void clickLogOutButton() {
		logoutbutton.click();
	}
	
}
