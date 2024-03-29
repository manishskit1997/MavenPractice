package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.waithelaper;

public class searchCustomePage {
	public WebDriver ldriver;
	waithelaper waithelper;

	public searchCustomePage(WebDriver ldriver)
	{
		this.ldriver=ldriver;
		PageFactory.initElements(ldriver,this);
	    waithelper=new waithelaper(ldriver);
	}
	
	@FindBy(how = How.XPATH, using ="//input[@name='SearchEmail']")
	WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using ="//button[@id='search-customers']")
	WebElement buttonSearch;
	
	@FindBy(how = How.XPATH, using ="//table[@id='customers-grid']")
	WebElement table;
	
	@FindBy(how = How.XPATH, using ="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRow;
	
	@FindBy(how = How.XPATH, using ="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableCol;
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

}
