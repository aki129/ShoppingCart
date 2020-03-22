package com.shoppingCart.appModule;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import com.shoppingCart.pageObjectClass.RegisterPage;
import com.shoppingCart.utility.Constant;

public class RegisterUser {
	
	
	
	public static void execute(WebDriver driver){
		String uuid = UUID.randomUUID().toString(); 
		uuid = uuid.substring(0, 10);
        RegisterPage.btnCreate(driver).click(); 
        
       RegisterPage.createAccountUsername(driver).sendKeys(uuid+Constant.Username);
 
       RegisterPage.btnCreateAccount(driver).click();
       
       RegisterPage.radioBtnGender(driver).click();
       
       RegisterPage.firstName(driver).sendKeys(Constant.FName);
       
       RegisterPage.lastName(driver).sendKeys(Constant.LName);
       
       RegisterPage.password(driver).sendKeys(Constant.Password);
       
       RegisterPage.country(driver).selectByVisibleText(Constant.Country);
       
       RegisterPage.state(driver).selectByVisibleText(Constant.State);
       
       RegisterPage.city(driver).sendKeys(Constant.City);
 
       RegisterPage.zipCode(driver).sendKeys(Constant.Zip);
      
       RegisterPage.phone(driver).sendKeys(Constant.Phn);
       
       RegisterPage.address1(driver).sendKeys(Constant.Address);
       
       RegisterPage.addressAlias(driver).clear();
       
       RegisterPage.addressAlias(driver).sendKeys(Constant.AddAlias);
       
       RegisterPage.btnSubmitAcc(driver).click();

}

}
