package Stepdefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.CheckoutPageObject;
import PageObject.LandingPageObject;
import PageObject.PageObjectmanager;
import Utils.PickoContainerTextContent;
import Utils.TestBase;
import io.cucumber.java.en.*;

public class CheckOutPageStepDef {
	WebDriver driver;
	String productname;
	String OfferProdctname;
	public LandingPageObject LPO;
	public PickoContainerTextContent PCTC;
	public PageObjectmanager POM;
	public TestBase TB;
	public CheckoutPageObject GCOP;


	public CheckOutPageStepDef(PickoContainerTextContent PCTC)

	{
		this.PCTC=PCTC;
		this.POM=new PageObjectmanager(PCTC);
		this.GCOP = POM.getCheckOutPageObject();

	}


	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() 
	{
		Assert.assertTrue(GCOP.VerifyPromoBtn());
		Assert.assertTrue(GCOP.VerifyPlaceOrder());

	}
	@Then("^users proceeds to checkout and validate the (.+) item in checkout page$")
	public void users_proceeds_to_checkout_and_validate_the_item_checkout_page(String name) throws InterruptedException
	{
		GCOP.getCheckoutItem();
		
	}


}
