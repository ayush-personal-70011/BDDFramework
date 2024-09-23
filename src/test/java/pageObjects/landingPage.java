package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.genericUtils;

public class landingPage {
	
	By search = By.xpath("//input[@type='search']");
	By menuprofuct = By.cssSelector("h4.product-name");
	By topDealButton = By.xpath("//a[normalize-space()='Top Deals']");
	By addQuantity = By.xpath("(//a[normalize-space()='+'])[1]");
	By addToCartBtn = By.xpath("(//button[normalize-space()='ADD TO CART'])[1]");
	
	
	public WebDriver driver;

	
	public landingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search(String Name) {
		
		driver.findElement(search).sendKeys(Name);
	}
	
	public String getMenuName() {
		return driver.findElement(menuprofuct).getText();
	}
	
	public void tabOnTopDeal() {
		driver.findElement(topDealButton).click();
	}
	
	public void clickOnTopDeals() {
		driver.findElement(topDealButton).click();
	}
	
	public void addquantity(int quantity) {
		int i = quantity - 1;
		while(i>0) {
			driver.findElement(addQuantity).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCartBtn).click();
	}

}
