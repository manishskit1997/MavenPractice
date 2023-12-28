package PageObject;

import org.openqa.selenium.WebDriver;

import Utils.PickoContainerTextContent;

public class PageObjectmanager {
    WebDriver driver;
	public LandingPageObject MLPO;
	public OfferPageObject MOPO;
	public PickoContainerTextContent PCTC;
	public CheckoutPageObject COP;

	public PageObjectmanager(PickoContainerTextContent PCTC)
	{
		this.PCTC=PCTC;
	}

	public LandingPageObject getLandingPageObject()
	{
		MLPO=new LandingPageObject(PCTC);
		return MLPO;
	}
 
	public OfferPageObject getOfferPageObject()
	{
		MOPO=new OfferPageObject(PCTC);
		return MOPO;
	}
	
	public CheckoutPageObject getCheckOutPageObject()
	{
		COP=new CheckoutPageObject(PCTC);
		return COP;
	}



}
