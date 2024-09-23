package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.genericUtils;

public class Checkout {
	
	public WebDriver driver;
	
	
	public Checkout(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartBag = By.xpath("//img[@alt='Cart']");
	By checkOutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By promoBtn = By.xpath("//button[normalize-space()='Apply']");
	By placeOrder = By.xpath("//button[normalize-space()='Apply']");
	By prductName = By.xpath("(//p[@class='product-name'])[1]");

	
	public void selectCart() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean verifyPlaceOrderBtn() {
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	public String verifyProductName() {
		String ActualProductName = driver.findElement(prductName).getText().split("-")[0].trim();
		return ActualProductName;
	}
	

}
