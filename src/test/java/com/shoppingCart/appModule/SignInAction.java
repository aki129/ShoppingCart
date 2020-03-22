package com.shoppingCart.appModule;

import org.openqa.selenium.WebDriver;

import com.shoppingCart.pageObjectClass.Login;
import com.shoppingCart.pageObjectClass.RegisterPage;
import com.shoppingCart.utility.Constant;


public class SignInAction {
	
	
	public static void Execute(WebDriver driver){
		
		
		 RegisterPage.btnCreate(driver).click();
		 RegisterPage.signInEmail(driver).sendKeys(Constant.Username);
		 RegisterPage.signInPass(driver).sendKeys(Constant.Password);
		 RegisterPage.btnSignIn(driver).click();
		 
		 
        

}

}
