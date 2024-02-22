package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base_Page {
	
	public RegisterPage(WebDriver driver) 
	{
		super(driver);	
	}
	
	@FindBy(className = "ico-register")
	WebElement register;
	
	public void clickOnRegister() {
		register.click();
	}
	
	@FindBy(id = "gender-male")
	WebElement genderButton;
	
	public void clickOnGender() {
		genderButton.click();
	}
	
	@FindBy(id = "FirstName")
	WebElement firstnameTextField;
	
	public void enterFirstName(String firstname) {
		firstnameTextField.sendKeys(firstname);
	}
	
	@FindBy(id = "LastName")
	WebElement lastnameTextField;
	
	public void enterLastName(String lastname) {
		lastnameTextField.sendKeys(lastname);
	}
	
	@FindBy(id = "Email")
	WebElement emailTextField;
	
	public void enteremailId(String emailid) {
		emailTextField.sendKeys(emailid);
	}
	
	@FindBy(id = "Password")
	WebElement PasswordTextField;
	
	public void enterPassword(String Password) {
		PasswordTextField.sendKeys(Password);
	}
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswordTextField;
	
	public void enterConfirmPassword(String ConfirmPassword) {
		ConfirmPasswordTextField.sendKeys(ConfirmPassword);
	}
	
	@FindBy(id = "register-button")
	WebElement registerbutton;
	
	public void clickOnRegisterbutton() {
		registerbutton.click();
	}

}
