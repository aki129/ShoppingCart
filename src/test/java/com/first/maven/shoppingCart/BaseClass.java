package com.first.maven.shoppingCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	
	public void launchBroser() {
		
		 WebDriver driver = null;
		   System.setProperty("webdriver.gecko.driver","G:\\Study\\geckodriver-v0.21.0-win64\\geckodriver.exe");
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
			 
	}

}
