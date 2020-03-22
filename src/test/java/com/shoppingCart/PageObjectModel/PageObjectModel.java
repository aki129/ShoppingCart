package com.shoppingCart.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	  
	  @BeforeClass
	  public static void launchBrowser() {
		  
		  System.setProperty("webdriver.gecko.driver","Path for yor geckodriver exe files");
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
