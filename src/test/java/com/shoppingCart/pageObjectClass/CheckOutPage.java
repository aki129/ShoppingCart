package com.shoppingCart.pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	private static WebElement element = null;
	
	 public static WebElement btnCheckOut(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a.button.btn btn-default.standard-checkout.button-medium"));

	      return element;

	      }//button btn btn-default button-medium
	 
	 

	 public static WebElement assertPrice(WebDriver driver){

	      element = driver.findElement(By.id("total_price"));

	      return element;

	      }//cheque
	 
	 public static WebElement radioBtnTC(WebDriver driver){

	      element = driver.findElement(By.id("cgv"));

	      return element;

	      }
	 
	 public static WebElement checkbtn(WebDriver driver){

	      element = driver.findElement(By.id("cheque"));

	      return element;

	      }

}
