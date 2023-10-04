package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid") 
	WebElement tstUserName;
	
	@FindBy(name="password") 
	WebElement tstPassword;
	
	@FindBy(name="btnLogin") 
	WebElement btnLogin;

	public void setUserName(String uname)
	{
		tstUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		tstPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		
		btnLogin.click();
	}
}
