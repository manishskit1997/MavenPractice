package StepDefination;

import io.cucumber.java.en.*;

public class MainStep {

	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    System.out.println("user landed on netbanking page");
	}
	@When("user login application")
	public void user_login_application() {
	    System.out.println("user logged in sucessfuly");
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("the page is displayed");
	}
	@Then("card is displayed")
	public void card_is_displayed() {
	    System.out.println("card is displayed now");
	}

}
