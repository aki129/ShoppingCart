package com.shoppingCart.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.shoppingCart.appModule.AddProduct;
import com.shoppingCart.appModule.CheckOutProcess;
import com.shoppingCart.appModule.RegisterUser;
import com.shoppingCart.pageObjectClass.HistoryPage;
import com.shoppingCart.pageObjectClass.HomePage;
import com.shoppingCart.utility.Constant;




public class PageObjectModel {
	
	private static WebDriver driver = null;
	  
	  @BeforeClass
	  public static void launchBrowser() {
		  
		  System.setProperty("webdriver.gecko.driver","G:\\Study\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.get(Constant.URL);
		  
	  }
	
  @Test
	 public void shoppingMainFlow() {
		  
	 
	     // Use page Object library now
	     
	     RegisterUser.execute(driver);
	 
	//     SignInAction.Execute(driver, Constant.Username, Constant.Password);
	 
	     HomePage.clickWomen(driver).click();
	     
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     AddProduct.execute(driver); 
	     
         CheckOutProcess.execute(driver);
         
         HomePage.clickMyAcc(driver).click();
         
         HomePage.clickOrderHistory(driver).click();
         
         HistoryPage.getOrderAmount(driver, "$110.00");
	     	 
	   
	 }
  
  
  @AfterClass
  
  public static void closeConnection() {
	  
	   driver.quit();
  }
	

}
