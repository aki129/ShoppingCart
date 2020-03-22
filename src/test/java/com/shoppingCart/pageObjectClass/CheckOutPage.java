package com.shoppingCart.pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	
	private static WebElement element = null;
	
	 public static WebElement btnCheckOutSum(WebDriver driver){

		 
	      element = driver.findElement(By.cssSelector("a.button.btn.btn-default.standard-checkout.button-medium"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
	      
	      return element;

	      }
	 
	 public static WebElement btnCheckOutAdd(WebDriver driver){

		 
		
	      
	      WebDriverWait wait = new WebDriverWait(driver, 5);

	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium"))));
	      
	      element = driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium"));
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView(true)", element);
	      
	      return element;

	      }
	 

	 public static WebElement assertPrice(WebDriver driver){

	      element = driver.findElement(By.id("total_price"));

	      return element;

	      }//cheque
	 
	 public static WebElement radioBtnTS(WebDriver driver){

		 WebDriverWait wait = new WebDriverWait(driver, 5);

	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium"))));
	      
	      element = driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium"));
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView(true)", element);
	  
	      element = driver.findElement(By.id("cgv"));

	      return element;

	      }
	 
	 public static WebElement checkbtn(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a.cheque"));

	      return element;

	      }

}
