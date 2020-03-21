package com.shoppingCart.appModule;

import org.openqa.selenium.WebDriver;
import com.shoppingCart.pageObjectClass.RegisterPage;
import com.shoppingCart.utility.Constant;

public class RegisterUser {
	
	

	public static void execute(WebDriver driver){
		 
		 
        RegisterPage.btnSignIn(driver).click(); 
        
       RegisterPage.createAccountUsername(driver).sendKeys(Constant.Username);
 
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
       
       RegisterPage.addressAlias(driver).sendKeys(Constant.AddAlias);
       
       RegisterPage.btnSubmitAcc(driver).click();

}

}
