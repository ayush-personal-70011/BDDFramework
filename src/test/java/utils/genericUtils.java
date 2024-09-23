package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public WebDriver driver;
	
	public genericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchToWindoToChildw() throws InterruptedException {
		
		Set<String> s1 = driver.getWindowHandles();
	    Iterator<String> i1 = s1.iterator();
	    String ParantWindow = i1.next();
	    String ChildWindow = i1.next();
	    driver.switchTo().window(ChildWindow);
	    Thread.sleep(1000);
	}

}
