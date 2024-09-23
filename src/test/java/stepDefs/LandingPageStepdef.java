package stepDefs;
import pageObjects.Checkout;
import pageObjects.landingPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class LandingPageStepdef {
	public WebDriver driver;
	public String MenuProductName;
	TestContextSetup contextSetup;
	public landingPage landingpage;
	public Checkout checkout;
	
	public LandingPageStepdef(TestContextSetup contextSetup) {
		this.contextSetup = contextSetup;
		this.landingpage = contextSetup.pageobjectmanager.getLandingPageObject();
		this.checkout = contextSetup.pageobjectmanager.getCheckoutpage();
	}
	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		
		//contextSetup.testbase.webDriverManager();
	    
	}
	
	
	@When("^User search with the sort name (.+) and extract the actual result$")
	public void user_search_with_the_sort_name_and_extract_the_actual_result(String shortName) throws InterruptedException {
		
		landingpage.search(shortName);
		Thread.sleep(2000);
		contextSetup.MenuProductName = landingpage.getMenuName().split("-")[0].trim();
		System.out.println(contextSetup.MenuProductName+" is extracted from the homepage");
	    
	}
	
	@Then("User proceed to the checkout page")
	public void User_proceed_to_the_checkout_page() {
		checkout.selectCart();
	}
	
	@When("Add {string} quantity of the product")
	public void Add_quantity_of_the_product(String quantity) {
		landingpage.addquantity(Integer.parseInt(quantity));
		landingpage.addToCart();
	}
	
	

}
