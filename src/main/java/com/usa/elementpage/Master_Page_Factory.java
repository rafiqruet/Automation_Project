package com.usa.elementpage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.basepage.SuperClass;


public class Master_Page_Factory extends SuperClass {

	// Initialize PageFactory
	public Master_Page_Factory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	@CacheLookup
	private WebElement enterEmail;

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(id = "pass")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(id = "send2")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	
	@FindBy(partialLinkText = "Sign In")
	@CacheLookup
	private WebElement clickOnSignInBTN;

	public WebElement getClickOnSignInBTN() {
		return clickOnSignInBTN;
	}
	

 
	
	@FindBy(xpath = "//*[text()=' Home']")
	@CacheLookup
	private WebElement verifyHomePage;

	public WebElement getVerifyHomePage() {
		return verifyHomePage;
	}
	
	@FindBy(xpath = "//*[text()=' Products']")
	@CacheLookup
	private WebElement clickOnProduct;

	public WebElement getClickOnProduct() {
		return clickOnProduct;
	}

	
	public void getLogin(String userName, String pwd) {
		getClickOnSignInBTN().click();
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(pwd);
		getClickOnLoginBTN().click();
		

	}

}
