package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchselenium {
	
public static void main(String args[])

{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/**
	 * 
	 WebDriver -- interface
	 
	  driver  -- reference variable
	  new -- keyword
	  Chrome Driver -- class
	 */
	driver.get("http://www.capitalone.com");
	
}
}
