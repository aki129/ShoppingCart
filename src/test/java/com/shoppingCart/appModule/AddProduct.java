package com.shoppingCart.appModule;

import org.openqa.selenium.WebDriver;

import com.shoppingCart.pageObjectClass.WomenPage;

public class AddProduct {

	
	
	
	public static void execute (WebDriver driver) {
		
		WomenPage.enterQuantity(driver).sendKeys("2");
		
		WomenPage.addToCart(driver).click();
		
		WomenPage.checkOutBtn(driver).click();
		
	}
	
}
