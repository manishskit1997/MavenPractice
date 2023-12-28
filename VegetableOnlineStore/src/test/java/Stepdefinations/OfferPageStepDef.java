package Stepdefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPageObject;
import PageObject.OfferPageObject;
import PageObject.PageObjectmanager;
import Utils.Genericutils;
import Utils.PickoContainerTextContent;
import io.cucumber.java.en.*;

public class OfferPageStepDef {
	WebDriver driver;
	
	String OfferProdctname;
	public OfferPageObject OPO;
	public LandingPageObject LPO;
	public PickoContainerTextContent PCTC;
	public PageObjectmanager POM;
	public Genericutils GUtils;


	public OfferPageStepDef(PickoContainerTextContent PCTC)

	{
		this.PCTC=PCTC;

	}

	@Then("^user serach with same shortname (.+) in offers page$")
	public void user_serach_with_same_shortname_tom_in_offers_page(String name) {
		//driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		switchTopage();
		
		// driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(name);
		POM=new PageObjectmanager(PCTC);
		OPO=POM.getOfferPageObject();
		//OPO=new OfferPageObject(PCTC);
		OPO.serachOnDealsPage(name);
		String OfferProdctname = OPO.getTextProductObDeals();

	}
	
	public void switchTopage() {
	//	if(PCTC.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {
		POM=new PageObjectmanager(PCTC);
	    LPO=POM.getLandingPageObject();
		//LPO=new LandingPageObject(PCTC);
		LPO.ClickOnDeals();
		Genericutils GUtils=new Genericutils(PCTC);
		GUtils.switchTochildWindow();
//		Set<String> All_Win = PCTC.driver.getWindowHandles();
//		Iterator<String> itr = All_Win.iterator();
//		String Firsttab = itr.next();
//		String SecondTab = itr.next();
//		PCTC.driver.switchTo().window(SecondTab);
		
		
	}
	@Then("check if product exits with same name")
	public void check_if_product_exits_with_same_name() {
		Assert.assertEquals(PCTC.productname, OfferProdctname);
	}

}
