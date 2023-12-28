package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.PickoContainerTextContent;
import net.bytebuddy.asm.Advice.This;

public class OfferPageObject {
	
public PickoContainerTextContent PCTC;
WebDriver driver;
	
	
	public OfferPageObject(PickoContainerTextContent PCTC)
	
	{
		this.PCTC=PCTC;
		
	}
	
	
	By CliconSerachIconOnDeals=By.xpath("//input[@id='search-field']");
	By getProductOnDeals=By.xpath("//td[contains(text(),'Tomato')]");
	

	
	public void serachOnDealsPage(String name)
	{
		PCTC.driver.findElement(CliconSerachIconOnDeals).sendKeys(name);
		
	}
	
	public String getTextProductObDeals()
	{
		String GetTextOnDeals=PCTC.driver.findElement(getProductOnDeals).getText();
		return  GetTextOnDeals;
	}
	
	

	
}
