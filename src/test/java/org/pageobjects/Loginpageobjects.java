package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects extends BaseClass {

	
	
	
	
	@FindBy(id="username")
	private static WebElement username;
	
	
	@FindBy(id="password")
	private static WebElement password;
	
	@FindBy(id="login")
	private static WebElement loginbutton;
	
	public Loginpageobjects() {
		// TODO Auto-generated constructor stub
	}

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	public void login(String textusername,String textpassword) {
		 getUsername().sendKeys(textusername);
		getPassword().sendKeys(textpassword);
		getLoginbutton().click();
		
	}
	
	


	
	
	
	
	
	
	
	
	
}
