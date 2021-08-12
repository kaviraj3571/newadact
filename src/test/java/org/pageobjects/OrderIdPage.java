package org.pageobjects;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderIdPage extends BaseClass{
	
	
	@FindBy(id="order_no")
	private static WebElement orderid;
	
	@FindBy(id="search_hotel")
	private static WebElement searchHotelButton;
	
	
	@FindBy(id="my_itinerary")
	private static WebElement itinearybutton;
	
	@FindBy(id="logout")
	private static WebElement logoutbutton;

//=========================================================================	
	
	public static WebElement getOrderid() {
		return orderid;
	}

	public static WebElement getSearchHotelButton() {
		return searchHotelButton;
	}

	public static WebElement getItinearybutton() {
		return itinearybutton;
	}

	public static WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
//==========================================================================
	
	public void getorderid() {
		
		String getattribute = getattribute(getOrderid(), "value");
		
		System.out.println(getattribute);
		
		click(getLogoutbutton());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
