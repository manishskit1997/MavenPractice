package Stepdefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPageObject;
import PageObject.PageObjectmanager;
import Utils.PickoContainerTextContent;
import Utils.TestBase;
import io.cucumber.java.en.*;

public class LandingPageStepDef {
	WebDriver driver;
	String productname;
	String OfferProdctname;
	public LandingPageObject LPO;
	public PickoContainerTextContent PCTC;
	public PageObjectmanager POM;
	public TestBase TB;


	public LandingPageStepDef(PickoContainerTextContent PCTC)

	{
		this.PCTC=PCTC;
		this.POM=new PageObjectmanager(PCTC);
		this.LPO=POM.getLandingPageObject();
		

	}

	@Given("user is on Greencart landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
		TB=new TestBase(PCTC);
		TB.WedDriver();
		Assert.assertTrue(LPO.getTitlelandingpage().contains("GreenKart"));
	}
	@When("^user serach with shortname (.+) and extracted actual name of prodct$")
	public void user_serach_with_shortname_tom_and_extracted_actual_name_of_prodct(String name) {

		// LPO=new LandingPageObject(PCTC);
		LPO.searchProductOnLanding(name);
		//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name);
		productname = LPO.getTextLandingOb().split("-")[0].trim();
		Assert.assertEquals(productname, "Tomato");
	}
	@When("Added {string} item to selected product to cart")
	public void Added_item_product(String quantity)
	{
		LPO.incrementQuantity(Integer.parseInt(quantity));
		LPO.addtoCartLanding();
	}


}
