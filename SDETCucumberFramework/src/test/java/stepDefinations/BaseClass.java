package stepDefinations;


import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	
	
	public static String randomestring(){
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	

}