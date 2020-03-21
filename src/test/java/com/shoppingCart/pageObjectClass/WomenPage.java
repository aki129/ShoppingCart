package com.shoppingCart.pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPage {
	
	
	
	 private static WebElement element = null;
		
		public static WebElement clickViewItem(WebDriver driver){

		      element = driver.findElement(By.cssSelector("a.quick-view"));

		      return element;

		      }
		
		public static WebElement addToCart(WebDriver driver){

		      element = driver.findElement(By.id("add_to_cart"));

		      return element;

		      }
		
		public static WebElement enterQuantity(WebDriver driver){

		      element = driver.findElement(By.id("quantity_wanted"));

		      return element;

		      } //btn btn-default button button-medium
		
		public static WebElement checkOutBtn(WebDriver driver){

		      element = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium"));

		      return element;

		      }

}
