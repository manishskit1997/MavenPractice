package stepDefinations;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	public WebDriver driver;
	public LoginPage login;
	public AddCustomerPage Addcust;


	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");

		driver=new ChromeDriver();

		login =new LoginPage(driver);
		Addcust =new AddCustomerPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}

	@When("User opens URL {string}")
	public void user_opens_url(String string)  {

		driver.get(string);
		driver.manage().window().maximize();


	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		login =new LoginPage(driver);
		login.enterEmail(email);
		login.enterPassword(password);
	}

	@And("Click on Login")
	public void click_on_login() {
		login.clickOnLoginButton();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		Thread.sleep(5000);
		login.clickOnLogOutButton();
		Thread.sleep(2000);

	}

	


	//Add new customer feature 


	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		Addcust=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",Addcust.pageTitle() );


	}

	@When("user click on customer menu")
	public void user_click_on_customer_menu() throws InterruptedException {
		Thread.sleep(3000);
		Addcust.clickOnCustomerMenu();


	}

	@When("Click on Customer menu item")
	public void click_on_customer_menu_item() throws InterruptedException {
		Addcust.clickOnCustomerMenuItem();
		Thread.sleep(3000);

	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		Addcust.addNewBtn();
		Thread.sleep(3000);



	}

	@Then("user can view  add new customer page")
	public void user_can_view_add_new_customer_page() {

		Assert.assertEquals("Add a new customer / nopCommerce administration",Addcust.pageTitle() );

	}

	@When("user enter the customer infomation")
	public void user_enter_the_customer_infomation() throws InterruptedException {
		String email=randomestring()+"@gmail.com";
		Thread.sleep(2000);
		Addcust.setemail(email);
		Thread.sleep(2000);
		Addcust.setPassword("test123");
		Thread.sleep(2000);
		Addcust.setFirstName("Manish");
		Thread.sleep(2000);
		Addcust.setLastName("Kumar");
		Thread.sleep(2000);
		Addcust.selectGender("Male");
		Thread.sleep(2000);
		Addcust.setdateofBirth("03/08/2020");
		Thread.sleep(2000);
		Addcust.setCompanyName("Amway");
		Thread.sleep(2000);
		Addcust.markTaxExpert();
		Thread.sleep(2000);
		
		//Addcust.newsletter("Test store2");
		//Thread.sleep(2000);
		//Addcust.customerRoles("Guest");
		Thread.sleep(2000);
		//Addcust.setManagerOfvendor("Vendor 1");
		//Thread.sleep(2000);
		Addcust.clickChecboxActive();
		Addcust.setAdminaContent("Good exprinace on the site");
		




	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {

		Thread.sleep(2000);
		Addcust.clickBtnSave();

	}

	@Then("user can view the confirmation message {string}")
	public void user_can_view_the_confirmation_message(String message) {

		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));

	}



	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}


}