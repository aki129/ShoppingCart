package com.shoppingCart.appModule;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.shoppingCart.pageObjectClass.CheckOutPage;


public class CheckOutProcess {
	
	
	public static void execute(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 300)", "");
		
		Assert.assertEquals("Price is different from expected.", "$35.02", CheckOutPage.assertPrice(driver).getText());
        
		 
        CheckOutPage.btnCheckOutSum(driver).click();
        
        CheckOutPage.btnCheckOutAdd(driver).click();
        
        CheckOutPage.radioBtnTS(driver).click();
        
        CheckOutPage.btnCheckOutAdd(driver).click();
        
        
        js.executeScript("window.scrollBy(0, 300)", "");
        
        Assert.assertEquals("Price is different from expected.", "$35.02", CheckOutPage.assertPrice(driver).getText());
        
        CheckOutPage.checkbtn(driver).click();
        
        CheckOutPage.btnCheckOutAdd(driver).click();
		
		
	}

}
