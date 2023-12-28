package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.PickoContainerTextContent;
import net.bytebuddy.asm.Advice.This;

public class LandingPageObject {

	public PickoContainerTextContent PCTC;
	WebDriver driver;


	public LandingPageObject(PickoContainerTextContent PCTC)

	{
		this.PCTC=PCTC;

	}

	By seachBar=By.xpath("//input[@type='search']");
	By Productname=By.xpath("//h4[contains(text(),'Tomato')]");

	By DealsLink=By.xpath("//a[contains(text(),'Top Deals')]");

	By increment=By.xpath("//a[normalize-space()='+']");
	By AddtoCart=By.xpath("//button[normalize-space()='ADD TO CART']");



	public void searchProductOnLanding(String name)
	{
		PCTC.driver.findElement(seachBar).sendKeys(name);
	}

	public void ClickOnDeals() {
		PCTC.driver.findElement(DealsLink).click();
	}


	public String getTextLandingOb()
	{
		String GetTextOnLanding=PCTC.driver.findElement(Productname).getText();
		return  GetTextOnLanding;
	}
	public String getTitlelandingpage()
	{
		return PCTC.driver.getTitle();
	}

	public void incrementQuantity(int quantity) {
		int i=quantity-1;
		while(i>0)
		{
			PCTC.driver.findElement(AddtoCart).click();
			i--;
		} 
	}

	public void addtoCartLanding()
	{
		PCTC.driver.findElement(AddtoCart).click();

	}

}
