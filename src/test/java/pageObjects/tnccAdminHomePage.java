package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tnccAdminHomePage {
	
	
	
	public WebDriver driver;
	
	By WelcomeText = By.cssSelector("div[class='title-head'] h1 span");
	
	public tnccAdminHomePage(WebDriver driver) throws IOException {
		this.driver = driver;
	}
	
	public String verifyWelcomeText() {		
		String actualWelcomeText = driver.findElement(WelcomeText).getText();
		return actualWelcomeText;
	}

}
