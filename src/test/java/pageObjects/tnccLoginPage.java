package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tnccLoginPage {
	
	public WebDriver driver;
	
	By userName = By.id("formBasicEmail");
	By passWord = By.id("formBasicPassword");
	By loginBtn = By.cssSelector("button[type='submit']");
	By viewPass = By.xpath("//i[@class='icon-eye-off']");
	
	public tnccLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
	
	public void clikOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void clickViewPassIcon() {
		driver.findElement(viewPass).click();
	}

}
