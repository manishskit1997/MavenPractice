package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//create object of webdriver

	WebDriver ldriver;

	public WelcomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	//identify element 

	@FindBy(xpath="//input[@class='email']")
	WebElement enterEmail;

	@FindBy(xpath="//input[@value='admin']")
	WebElement enterPassword;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickOnLogin;
	
	// identify Actions on page
	
	public void entertheEmail(String emailAdd)
	{
		enterEmail.clear();
		enterEmail.sendKeys(emailAdd);
	}
	
	public void enterthepassword(String passwordAdd)
	{
		enterPassword.clear();
		enterPassword.sendKeys(passwordAdd);
	}
	
	public void click()
	{
		clickOnLogin.click();
		
	}
	
	

}
