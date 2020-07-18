package com.shoppingCart.PageObjectModel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.shoppingCart.appModule.AddProduct;
import com.shoppingCart.appModule.CheckOutProcess;
import com.shoppingCart.appModule.RegisterUser;
import com.shoppingCart.appModule.SignInAction;
import com.shoppingCart.pageObjectClass.HistoryPage;
import com.shoppingCart.pageObjectClass.HomePage;
import com.shoppingCart.utility.Constant;




public class PageObjectModel {
	
	private static final Logger log = Logger.getLogger(PageObjectModel.class);
	private static WebDriver driver = null;
	  
//	protected static RemoteWebDriver driver;
	  @BeforeClass
	  public static void launchBrowser() throws MalformedURLException {
		  
		  System.setProperty("webdriver.gecko.driver","src" + File.separator + "main" + File.separator + "resources" + File.separator +"geckodriver.exe");
		     System.out.println(System.getProperty("webdriver.gecko.driver"));
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability("name", "Selenium Test Example");
			caps.setCapability("osVersion", "10");
			caps.setCapability("browserName", "firefox");
			caps.setCapability("browserVersion", "60");
			caps.setCapability("os", "Windows");
			
			caps.setCapability("screen_resolution", "1024x768");
			caps.setCapability("selenium_version", "3.11.0");

//			 driver = new RemoteWebDriver(
//					new URL("http://"), caps);
		  
		  driver=new FirefoxDriver();
			
			log.info("Browser is launched");
			
			driver.manage().window().maximize();
			
			log.info("window maximize");
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	        driver.get(Constant.URL);
		  
	        log.info("Open url");
	  }
	
  @Test
	 public void shoppingMainFlow() throws InterruptedException {
		  
	 
	     // Use page Object library now
	      log.info("register user"); 
	      
	      RegisterUser.execute(driver);
	   
	      log.info("User us registered");
	  
	 //      SignInAction.Execute(driver);
	
	 
	     HomePage.clickWomen(driver).click();
	     
	     log.info("Adding product to the cart");
	     
	     AddProduct.execute(driver); 
	     
	     log.info("product is added");
	     
	     log.info("checkou product");
	     
         CheckOutProcess.execute(driver);
         
         log.info("payment is done");
         
         HomePage.clickMyAcc(driver).click();
         
         HomePage.clickOrderHistory(driver).click();
         
         HistoryPage.getOrderAmount(driver, "$35.02");
         
         log.info("Test completed succsessfully");
	     	 
	   
	 }
  
  
  @AfterClass
  
  public static void closeConnection() {
	  
	   driver.quit();
  }
	

}
