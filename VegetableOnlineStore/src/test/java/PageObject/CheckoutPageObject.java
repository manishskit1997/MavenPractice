package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.PickoContainerTextContent;
import net.bytebuddy.asm.Advice.This;

public class CheckoutPageObject {
	
public PickoContainerTextContent PCTC;
WebDriver driver;
	
	
	public CheckoutPageObject(PickoContainerTextContent PCTC)
	
	{
		this.PCTC=PCTC;
		
	}
	
	By cartBag=By.xpath("//img[@alt='Cart']");
	By CheckOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	By PromoButton= By.xpath("//button[@class='promoBtn']");
	By PlaceOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
	public void getCheckoutItem() {
		PCTC.driver.findElement(cartBag).click();
		PCTC.driver.findElement(CheckOutButton).click();
	}
	
	public boolean VerifyPromoBtn()
	{
		return PCTC.driver.findElement(PromoButton).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder()
	{
		return PCTC.driver.findElement(PlaceOrder).isDisplayed();
	}
	
}
