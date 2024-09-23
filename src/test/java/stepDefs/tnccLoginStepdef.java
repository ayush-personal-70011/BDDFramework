package stepDefs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.tnccAdminHomePage;
import pageObjects.tnccLoginPage;
import utils.TestContextSetup;

public class tnccLoginStepdef {
	
	TestContextSetup contextSetup;
	public tnccLoginPage tnccloginpage;
	public tnccAdminHomePage tnccadminHomepage;
	
	String expenctedWelcomeAdminText;
	
	public tnccLoginStepdef(TestContextSetup contextSetup) throws IOException {
		this.contextSetup = contextSetup;
		this.tnccloginpage = contextSetup.pageobjectmanager.getTnccLoginPage();
		this.tnccadminHomepage = contextSetup.pageobjectmanager.getTnccAdminHomepage();
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//globel.properties");
		Properties prop = new Properties();
		prop.load(file);
		this.expenctedWelcomeAdminText = prop.getProperty("WelcomeAdminText");
	}
	
	
	@Given("user is on tncc login page")
	public void user_is_on_tncc_login_page() {
	    
		
	}
	@When("^user enters (.+) and (.+) in the login page$")
	public void user_enters_username_and_password(String username, String password) {
		tnccloginpage.enterUsername(username);
		tnccloginpage.clickViewPassIcon();
		tnccloginpage.enterPassword(password);
	    
	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		
	    tnccloginpage.clikOnLoginBtn();
	}
	
	@Then("user should land on the homepage")
	public void user_should_land_on_the_homepage() throws IOException, InterruptedException {
		
		tnccadminHomepage.verifyWelcomeText().contains(expenctedWelcomeAdminText);
		System.out.println(expenctedWelcomeAdminText);
	    
	}
	
//	@Then("validate the error message for username and password field")
//	public void validate_the_error_message_for_username_and_password_field() {
//	    
//	}
//	
//	@When("^enter (.+) in the login page$")
//	public void enter_peter_yopmail_com_in_the_login_page(String username) {
//	    
//	}
//	
//	@Then("validate the error message for password field")
//	public void validate_the_error_message_for_password_field() {
//	    
//	}
//	
//	@When("^enter (.+) in the login page$")
//	public void enter_admin_in_the_login_page(String password) {
//	    
//	}
//	
//	@When("clear username field")
//	public void clear_username_field() {
//	    
//	}
//	
//	@Then("validate the error message for username field")
//	public void validate_the_error_message_for_username_field() {
//	    
//	}

}
