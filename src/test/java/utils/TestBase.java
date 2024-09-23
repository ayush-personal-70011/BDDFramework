package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//globel.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		String url = prop.getProperty("QAUrlAdmin");
		
		if(driver == null) {
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//drivers//chromedriver.exe");
		driver = new ChromeDriver();
			}
			
			else if(prop.getProperty("browser").equalsIgnoreCase("Safari")) {
				driver = new SafariDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		}
		
		return driver;
	}

}
