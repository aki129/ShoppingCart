package com.shoppingCart.pageObjectClass;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HistoryPage {
	
	
	
	 public static boolean getOrderAmount(WebDriver driver,String amount){

		 
		List<WebElement> tableData =driver.findElements(By.tagName("td"));
		
		for(WebElement data : tableData) {
			
			String priceClass = data.getAttribute("class");
			if(priceClass.equals("history_price")) {
				
                  
				Assert.assertEquals("Amount in history class is different.", data.getText(), amount);
				
				break;
			}
			
			
		}

	      return true;

	      }

}
