package stepDefs;
import pageObjects.Checkout;
import pageObjects.landingPage;

import java.io.IOException;

//import org.junit.Assert;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import utils.TestContextSetup;

public class CheckoutPageStepdef {
	public WebDriver driver;
	public String MenuProductName;
	TestContextSetup contextSetup;
	public Checkout checkout;
	
	public CheckoutPageStepdef(TestContextSetup contextSetup) {
		this.contextSetup = contextSetup;
		this.checkout = contextSetup.pageobjectmanager.getCheckoutpage();
	}
	
	@Then("verify the promocode apply button and placeorder button")
	public void verify_the_promocode_apply_button_and_placeorder_button() throws InterruptedException {
		Assert.assertTrue(checkout.verifyPromoBtn());
		Assert.assertTrue(checkout.verifyPlaceOrderBtn());
		Thread.sleep(3000);
	}
	
	
	@Then("^Validate the (.+) item in the checkout page$")
	public void Validate_the_item_in_the_checkout_page(String name) {
		Assert.assertTrue(checkout.verifyProductName().contains(name));
	}
	
	

}
