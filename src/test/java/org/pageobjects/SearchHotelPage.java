package org.pageobjects;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchHotelPage extends BaseClass {



	@FindBy(id="location")
	private static WebElement location;

	@FindBy(id="hotels")
	private static WebElement hotels;

	@FindBy(id="room_type")
	private static WebElement roomtype;

	@FindBy(id="room_nos")
	private static WebElement numOfRooms;

	@FindBy(id="datepick_in")
	private static WebElement checkinDate;

	@FindBy(id="datepick_out")
	private static WebElement checkoutdate;

	@FindBy(id="adult_room")
	private static WebElement adultsPerRoom;

	@FindBy(id="child_room")
	private static WebElement childrensPerRoom;

	@FindBy(id="location_span")
	private static WebElement errorMessageOfLocation;

	@FindBy(xpath="//span[text()='Please Select Check-In Date']")
	private static WebElement errorMessageOfCheckin;

	@FindBy(xpath="//span[text()='Please Select Check-Out Date']")
	private static WebElement errorMessageOfCheckOut;

	@FindBy(xpath="//span[text()='Check-In Date shall be before than Check-Out Date']")
	private static WebElement errorMessageOfCheckInWroungDate;

	@FindBy(xpath="//span[text()='Check-Out Date shall be after than Check-In Date']")
	private static WebElement errorMessageOfCheckOutWroungDate;

	@FindBy(xpath="//td[text()='Search Hotel ']")
	private static WebElement navigationConformation;

	@FindBy(id="Submit")
	private static WebElement submitButton;


	@FindBy(id="Reset")
	private static WebElement resetButton;



	//=======================================================================================================
	public static WebElement getLocation() {          
		return location;
	}

	public static WebElement getHotels() {
		return hotels;
	}

	public static WebElement getRoomtype() {
		return roomtype;
	}

	public static WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public static WebElement getCheckinDate() {
		return checkinDate;
	}

	public static WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public static WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public static WebElement getChildrensPerRoom() {
		return childrensPerRoom;
	}

	public static WebElement getErrorMessageOfLocation() {
		return errorMessageOfLocation;
	}

	public static WebElement getErrorMessageOfCheckin() {
		return errorMessageOfCheckin;
	}

	public static WebElement getErrorMessageOfCheckOut() {
		return errorMessageOfCheckOut;
	}

	public static WebElement getErrorMessageOfCheckInWroungDate() {
		return errorMessageOfCheckInWroungDate;
	}

	public static WebElement getErrorMessageOfCheckOutWroungDate() {
		return errorMessageOfCheckOutWroungDate;
	}


	public static WebElement getNavigationConformation() {
		return navigationConformation;
	}


	public static WebElement getSubmitButton() {
		return submitButton;
	}

	public static WebElement getResetButton() {
		return resetButton;
	}



	//========================================================================================
//normalboonkin
	
	public void normalboonkin(String location,String hotels , String roomtype ,String numofrooms , String checkindate ,String checkoutdate ,String adultscnt,String childrecount ) {

		ddSelectByIndex(getLocation(), location);
		ddSelectByIndex(getHotels(), hotels);
		ddSelectByIndex(getRoomtype(), roomtype);
		ddSelectByIndex(getNumOfRooms(), numofrooms);
		sendkeys(getCheckinDate(), checkindate);
	sendkeys(getCheckoutdate(), checkoutdate);
		ddSelectByIndex(getAdultsPerRoom(), adultscnt);
		ddSelectByIndex(getChildrensPerRoom(), childrecount);
		click(getSubmitButton());

	}

//bookingWithMandatoryDetails
	
	public void bookingWithMandatoryDetails(String location,String numofrooms , String checkindate ,String checkoutdate ,String adultscnt) {

		ddSelectByIndex(getLocation(), location);
		ddSelectByIndex(getNumOfRooms(), numofrooms);
		ddSelectByIndex(getCheckinDate(), checkindate);
		ddSelectByIndex(getCheckoutdate(), checkoutdate);
		ddSelectByIndex(getAdultsPerRoom(), adultscnt);
		
	}


	public void page_Navigation_To_Search_Hotel_Page(String expected) {

		//String act = getText(getNavigationConformation());

		//Assert.assertEquals("page Navigation ToSearch Hotel Page is done",expected, act);
	}

	public void error_Confirmation_Of_Without_Checkin_Date(String checkinexpected) {

		String act_without_checkin_date = getText(getErrorMessageOfCheckin());
		Assert.assertEquals("page Navigation ToSearch Hotel Page is done",checkinexpected, act_without_checkin_date);

	}
	public void error_Confirmation_Of_Without_CheckOut_Date(String checkoutexpected ) {

		String  act_without_checkout_date = getText(getErrorMessageOfCheckOut());
		Assert.assertEquals("page Navigation ToSearch Hotel Page is done", checkoutexpected, act_without_checkout_date);

	}
	public void error_Confirmation_Of_Wroung_Checkin_Date(String checkinexpected) {

		String act_Wroung_checkin_date = getText(getErrorMessageOfCheckInWroungDate());
		Assert.assertEquals("page Navigation ToSearch Hotel Page is done",checkinexpected,  act_Wroung_checkin_date);

	}
	public void error_Confirmation_Of_Wroung_CheckOut_Date(String checkoutexpected ) {

		String act_Wroung_checkout_date = getText(getErrorMessageOfCheckOutWroungDate());
		Assert.assertEquals("page Navigation ToSearch Hotel Page is done", checkoutexpected, act_Wroung_checkout_date);

	}
















}
