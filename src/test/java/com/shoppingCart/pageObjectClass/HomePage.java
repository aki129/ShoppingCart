package com.shoppingCart.pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	 private static WebElement element = null;
	
	public static WebElement clickWomen(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a.sf-with-ul"));

	      return element;

	      }//account
	
	
	public static WebElement clickMyAcc(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a.account"));

	      return element;

	      }
	
	public static WebElement clickOrderHistory(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a[title=\"Orders\"] > span"));

	      return element;

	      }

}
