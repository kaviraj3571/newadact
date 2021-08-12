package org.pageobjects;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelConfirmationPage extends BaseClass {
	
	
	@FindBy(id="radiobutton_0")
	private static WebElement radiobutton;
	
	@FindBy(id="continue")
	private static WebElement continuebutton;
	
	@FindBy(id="cancel")
	private static WebElement cancelbutton;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private static WebElement navigationConfirmation_Page3;

//=======================================================================================	
	
	
	public static WebElement getRadiobutton() {
		return radiobutton;
	}

	public static WebElement getContinuebutton() {
		return continuebutton;
	}

	public static WebElement getCancelbutton() {
		return cancelbutton;
	}

	public static WebElement getNavigationConfirmation_Page3() {
		return navigationConfirmation_Page3;
	}
	
//========================================================================================
	
	public void confirmAndContinue() {
		
		click(getRadiobutton());
		click(getContinuebutton());

	}
	
	public void page_Navigation_To_Confirm_Hotel_Page(String expected) {

		String text = getText(getNavigationConfirmation_Page3());

		Assert.assertEquals("page Navigation ToSearch Hotel Page is done",expected, text);
	}
	
	
	
	
	
	
	
	
	
	
	
}
