package com.shoppingCart.pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	  private static WebElement element = null;
	  
	  
	  public static WebElement btnSignIn(WebDriver driver){

	      element = driver.findElement(By.cssSelector("a.login"));

	      return element;

	      }
	
	public static WebElement createAccountUsername(WebDriver driver){

	      element = driver.findElement(By.id("email_create"));

	      return element;

	      }
	
	public static WebElement btnCreateAccount(WebDriver driver){

	      element = driver.findElement(By.id("SubmitCreate"));

	      return element;

	      }
	
	public static WebElement radioBtnGender(WebDriver driver){

	      element = driver.findElement(By.id("id_gender1"));

	      return element;

	      }
	
	public static WebElement firstName(WebDriver driver){

	      element = driver.findElement(By.id("customer_firstname"));

	      return element;

	      }
	
	public static WebElement lastName(WebDriver driver){

	      element = driver.findElement(By.id("customer_lastname"));

	      return element;

	      }
	
	public static WebElement password(WebDriver driver){

	      element = driver.findElement(By.id("passwd"));

	      return element;

	      }
	
	public static WebElement address1(WebDriver driver){

	      element = driver.findElement(By.id("address1"));

	      return element;

	      }
	

	
	public static WebElement city(WebDriver driver){

	      element = driver.findElement(By.id("city"));

	      return element;

	      }	
	
	public static Select state(WebDriver driver){
		

	      element = driver.findElement(By.id("id_state"));

		    Select select = new Select(element);
	      return select;

	      }	
	
	public static WebElement zipCode(WebDriver driver){

	      element = driver.findElement(By.id("postcode"));

	      return element;

	      }	
	
	
	public static Select country(WebDriver driver){


	      element = driver.findElement(By.id("id_country"));

		    Select select = new Select(element);
	      return select;

	      }	
	
	public static WebElement phone(WebDriver driver){

	      element = driver.findElement(By.id("phone_mobile"));

	      return element;

	      }	
	
	public static WebElement addressAlias(WebDriver driver){

	      element = driver.findElement(By.id("alias"));

	      return element;

	      }	
	
	public static WebElement btnSubmitAcc(WebDriver driver){

	      element = driver.findElement(By.id("submitAccount"));

	      return element;

	      }	
	
	

}
