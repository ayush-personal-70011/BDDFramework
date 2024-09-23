package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	//This is page factory class
	
	public landingPage landingpage;
	public offerPage offerpage;
	public Checkout checkout;
	public tnccLoginPage tnccloginpage;
	public tnccAdminHomePage tnccAdminhomepage;
	public WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public landingPage getLandingPageObject() {
		
		landingpage = new landingPage(driver);
		return landingpage;
	}
	
	public offerPage getOfferPage() {
		offerpage = new offerPage(driver);
		return offerpage;
	}
	
	public Checkout getCheckoutpage() {
		checkout = new Checkout(driver);
		return checkout;
	}
	
	public tnccLoginPage getTnccLoginPage() {
	    tnccloginpage = new tnccLoginPage(driver);
		return tnccloginpage;
	}
	
	public tnccAdminHomePage getTnccAdminHomepage() throws IOException {
		tnccAdminhomepage = new tnccAdminHomePage(driver);
		return tnccAdminhomepage;
	}

}
