package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {
	
	By search = By.xpath("//input[@type='search']");
	By offerProductName = By.xpath("(//td[normalize-space()='Tomato'])[1]");
	
	public WebDriver driver;
	
	public offerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(offerProductName).getText();
	}

}
