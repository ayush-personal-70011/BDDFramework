package stepDefs;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.TestContextSetup;
import pageObjects.landingPage;
import pageObjects.offerPage;


public class offerPageStepdef {
	
	public String OfferProductName;
	
      TestContextSetup contextSetup;
      
	
	public offerPageStepdef(TestContextSetup contextSetup) {
		this.contextSetup = contextSetup;
	}
	
	@Then("^User search with the (.+) on offers page$")
	public void user_search_with_the_on_offers_page(String shortName) throws InterruptedException {
		
		
		offerPage offerpage = contextSetup.pageobjectmanager.getOfferPage();
		
		switchToOfferpage();
		offerpage.search(shortName);
	    //contextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    Thread.sleep(2000);
	    OfferProductName = offerpage.getProductName();
	    //OfferProductName = contextSetup.driver.findElement(By.xpath("(//td[normalize-space()='Tomato'])[1]")).getText();
	    
	}
	
	public void switchToOfferpage() throws InterruptedException {
		
		landingPage landingpage = contextSetup.pageobjectmanager.getLandingPageObject();
		
		landingpage.clickOnTopDeals();
		contextSetup.genUtils.switchToWindoToChildw();
	}
	
	
	@Then("validate the result")
	public void validate_the_result() {
		
		Assert.assertEquals(OfferProductName, contextSetup.MenuProductName);
		
	}

}
