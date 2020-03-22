package com.shoppingCart.pageObjectClass;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenPage {
	
	
	
	 private static WebElement element = null;
		
		public static void clickViewItem(WebDriver driver){
			
			element = driver.findElement(By.cssSelector("a.quick-view"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
			

		      }
		
		public static WebElement addToCart(WebDriver driver){

		      element = driver.findElement(By.id("add_to_cart"));

		      return element;

		      }
		
		public static WebElement enterQuantity(WebDriver driver) throws InterruptedException{

			
		//	  driver.switchTo().frame(0);
			Thread.sleep(5000);
	

		      element = driver.findElement(By.id("quantity_wanted"));

		      return element;

		      } //btn btn-default button button-medium
		
		public static WebElement checkOutBtn(WebDriver driver){
			
			  WebDriverWait wait = new WebDriverWait(driver, 10);
			  
			  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium"))));

		      element = driver.findElement(By.cssSelector("a.btn.btn-default.button.button-medium"));

		      JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].scrollIntoView(true)", element);
		      
		      return element;

		      }

}
