package com.shoppingCart.appModule;

import org.openqa.selenium.WebDriver;

import com.shoppingCart.pageObjectClass.CheckOutPage;

import junit.framework.Assert;

public class CheckOutProcess {
	
	
	public static void execute(WebDriver driver) {
		
		
		Assert.assertEquals("", "110", CheckOutPage.assertPrice(driver).getText());
        
        CheckOutPage.btnCheckOut(driver).click();
        
        CheckOutPage.btnCheckOut(driver).click();
        
        CheckOutPage.radioBtnTC(driver).click();
        
        Assert.assertEquals("", "110", CheckOutPage.assertPrice(driver).getText());
        
        CheckOutPage.checkbtn(driver).click();
		
		
	}

}
