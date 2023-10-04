package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.mystore.pageobject.WelcomePage;

public class Testcase_Login_001 extends BaseClass {

	@Test
	public void loginpage() throws IOException 
	{
		//open the url
		driver.get(url);
		logger.info("URL open");
		
		WelcomePage loginpage=new WelcomePage(driver);
		loginpage.entertheEmail(Email);
		loginpage.enterthepassword(Password);
		loginpage.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard / nopCommerce administration"))
		{
			logger.info("Verify title-Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("its failed- Failed");
			captureScreenShot(driver,"verify login");
			Assert.assertTrue(false);
		}
	  
	}
}
