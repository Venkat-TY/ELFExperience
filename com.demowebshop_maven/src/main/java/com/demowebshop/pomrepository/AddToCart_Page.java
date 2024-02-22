package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart_Page extends Base_Page{
	
	public AddToCart_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText = "Books")
	WebElement bookslink;
	
	public void clickOnBooksLink() {
		bookslink.click();
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement FirstProductAddToCartButton;
	
	public void ClickOnAddToCartForFirstProduct() {
		FirstProductAddToCartButton.click();
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	WebElement SecondProductAddToCartButton;
	
	public void ClickOnAddToCartForSecondProduct() {
		SecondProductAddToCartButton.click();
	}
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[3]")
	WebElement ThirdProductAddToCartButton;
	
	public void ClickOnAddToCartForThirdProduct() {
		ThirdProductAddToCartButton.click();
	}
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	WebElement ShoppingcartLink;
	
	public void ClickOnShoppingCartLink() {
		ShoppingcartLink.click();
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][1]/td[@class='remove-from-cart']")
	private WebElement ShoppingCartFirstRowRemoveItem;

	public WebElement getShoppingCartFirstRowRemoveItem() {
		return ShoppingCartFirstRowRemoveItem;
	}

	public void setShoppingCartFirstRowRemoveItem(WebElement shoppingCartFirstRowRemoveItem) {
		ShoppingCartFirstRowRemoveItem = shoppingCartFirstRowRemoveItem;
	}
	
	public void ClickOnShoppingCartFirstRowRemoveItem() {
		ShoppingCartFirstRowRemoveItem.click();
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][1]/td[@class='product']")
	private WebElement ShoppingCartFirstRowProductName;

	public WebElement getShoppingCartFirstRowProductName() {
		return ShoppingCartFirstRowProductName;
	}

	public void setShoppingCartFirstRowProductName(WebElement shoppingCartFirstRowProductName) {
		ShoppingCartFirstRowProductName = shoppingCartFirstRowProductName;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][1]/td[@class='unit-price nobr']")
	private WebElement ShoppingCartFirstRowProductPrice;

	public WebElement getShoppingCartFirstRowProductPrice() {
		return ShoppingCartFirstRowProductPrice;
	}

	public void setShoppingCartFirstRowProductPrice(WebElement shoppingCartFirstRowProductPrice) {
		ShoppingCartFirstRowProductPrice = shoppingCartFirstRowProductPrice;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][1]/td[@class='qty nobr']")
	private WebElement ShoppingCartFirstRowProductQuantity;

	public WebElement getShoppingCartFirstRowProductQuantity() {
		return ShoppingCartFirstRowProductQuantity;
	}

	public void setShoppingCartFirstRowProductQuantity(WebElement shoppingCartFirstRowProductQuantity) {
		ShoppingCartFirstRowProductQuantity = shoppingCartFirstRowProductQuantity;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][1]/td[@class='subtotal nobr end']")
	private WebElement ShoppingCartFirstRowProductSubTotal;

	public WebElement getShoppingCartFirstRowProductSubTotal() {
		return ShoppingCartFirstRowProductSubTotal;
	}

	public void setShoppingCartFirstRowProductSubTotal(WebElement shoppingCartFirstRowProductSubTotal) {
		ShoppingCartFirstRowProductSubTotal = shoppingCartFirstRowProductSubTotal;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][2]/td[@class='remove-from-cart']")
	private WebElement ShoppingCartSecondRowRemoveItem;

	public WebElement getShoppingCartSecondRowRemoveItem() {
		return ShoppingCartSecondRowRemoveItem;
	}

	public void setShoppingCartSecondRowRemoveItem(WebElement shoppingCartSecondRowRemoveItem) {
		ShoppingCartSecondRowRemoveItem = shoppingCartSecondRowRemoveItem;
	}
	
	public void ClickOnShoppingCartSecondRowRemoveItem() {
		ShoppingCartSecondRowRemoveItem.click();
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][2]/td[@class='product']")
	private WebElement ShoppingCartSecondRowProductName;

	public WebElement getShoppingCartSecondRowProductName() {
		return ShoppingCartSecondRowProductName;
	}

	public void setShoppingCartSecondRowProductName(WebElement shoppingCartSecondRowProductName) {
		ShoppingCartSecondRowProductName = shoppingCartSecondRowProductName;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][2]/td[@class='unit-price nobr']")
	private WebElement ShoppingCartSecondRowProductPrice;

	public WebElement getShoppingCartSecondRowProductPrice() {
		return ShoppingCartSecondRowProductPrice;
	}

	public void setShoppingCartSecondRowProductPrice(WebElement shoppingCartSecondRowProductPrice) {
		ShoppingCartSecondRowProductPrice = shoppingCartSecondRowProductPrice;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][2]/td[@class='qty nobr']")
	private WebElement ShoppingCartSecondRowProductQuantity;

	public WebElement getShoppingCartSecondRowProductQuantity() {
		return ShoppingCartSecondRowProductQuantity;
	}

	public void setShoppingCartSecondRowProductQuantity(WebElement shoppingCartSecondRowProductQuantity) {
		ShoppingCartSecondRowProductQuantity = shoppingCartSecondRowProductQuantity;
	}
	
	@FindBy(xpath = "//table[@class='cart']//tr[@class='cart-item-row'][2]/td[@class='subtotal nobr end']")
	private WebElement ShoppingCartSecondRowProductSubTotal;

	public WebElement getShoppingCartSecondRowProductSubTotal() {
		return ShoppingCartSecondRowProductSubTotal;
	}

	public void setShoppingCartSecondRowProductSubTotal(WebElement shoppingCartSecondRowProductSubTotal) {
		ShoppingCartSecondRowProductSubTotal = shoppingCartSecondRowProductSubTotal;
	}
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement UpdateShoppingCartButton;

	public WebElement getUpdateShoppingCartButton() {
		return UpdateShoppingCartButton;
	}

	public void setUpdateShoppingCartButton(WebElement updateShoppingCartButton) {
		UpdateShoppingCartButton = updateShoppingCartButton;
	}
	
	public void clickOnUpdateShoppingCartButton() {
		UpdateShoppingCartButton.click();
	}

}
