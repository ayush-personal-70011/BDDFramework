package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;


public class TestContextSetup {
	
	//This is pico-container class
	
	public WebDriver driver;
	public String MenuProductName;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public genericUtils genUtils;
	
	public TestContextSetup() throws IOException {
		
		testbase = new TestBase();
		 pageobjectmanager = new PageObjectManager(testbase.webDriverManager());
		 genUtils = new genericUtils(testbase.webDriverManager());
		 
	}

}
