package com.shoppingCart.appModule;

import org.openqa.selenium.WebDriver;

import com.shoppingCart.pageObjectClass.Login;
import com.shoppingCart.pageObjectClass.RegisterPage;


public class SignInAction {
	
	
	public static void Execute(WebDriver driver,String sUsername, String sPassword){
		 
		 RegisterPage.btnSignIn(driver).click();
		 
		 
        

}

}
