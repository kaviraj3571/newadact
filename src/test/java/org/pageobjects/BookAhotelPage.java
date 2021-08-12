package org.pageobjects;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BookAhotelPage extends BaseClass {
	
	
	@FindBy(id="first_name")
	private static WebElement firstName;
	
	@FindBy(id="last_name")
	private static WebElement lastName;
	
	@FindBy(id="address")
	private static WebElement address;

	@FindBy(id="cc_num")
	private static WebElement criditcardnum;

	@FindBy(id="cc_type")
	private static WebElement criditcarType;
	
	@FindBy(id="cc_exp_month")
	private static WebElement criditcarExpMonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement criditcarExpYear;
	
	@FindBy(id="cc_cvv")
	private static WebElement cvvNum;
	
	
	@FindBy(id="book_now")
	private static WebElement bookNoeButton;
	
	
	
	@FindBy(id="cancel")
	private static WebElement cancelButton;
	
	
	@FindBy(xpath="//td[@class='login_title']")
	private static WebElement navigation_Confirm_Page4;
	
	
	@FindBy(xpath="//label[text()='Please Enter your First Name']")
	private static WebElement error_Message_Of_without_First_Name;
	
	
	
	@FindBy(xpath="//label[text()='Please Enter you Last Name']")
	private static WebElement error_Message_Of_without_Last_Name;
	
	
	@FindBy(xpath="//label[text()='Please Enter your Address']")
	private static WebElement error_Message_Of_without_Address;
	
	
	@FindBy(xpath="//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private static WebElement error_Message_Of_without_Credit_Card_Number;
	
	
	
	@FindBy(xpath="//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private static WebElement error_Message_Of_Invalid_Credit_Card_Number;
	
	
	
	@FindBy(xpath="//label[text()='Please Select your Credit Card Type']")
	private static WebElement error_Message_Of_Invalid_Credit_Card_Type;
	
	
	
	@FindBy(xpath="//label[text()='Please Select your Credit Card Expiry Month']")
	private static WebElement error_Message_Of_expmonth_Credit_Card;
	
	
	@FindBy(xpath="//label[text()='Please Select your Credit Card Expiry Year']")
	private static WebElement error_Message_Of_expyear_Credit_Card;
	
	
	@FindBy(xpath="Please Enter your Credit Card CVV Number")
	private static WebElement error_Message_Of_ccvnum;

	
//======================================================================================================	
	

	public static WebElement getFirstName() {
		return firstName;
	}


	public static WebElement getLastName() {
		return lastName;
	}


	public static WebElement getAddress() {
		return address;
	}


	public static WebElement getCriditcardnum() {
		return criditcardnum;
	}


	public static WebElement getCriditcarType() {
		return criditcarType;
	}


	public static WebElement getCriditcarExpMonth() {
		return criditcarExpMonth;
	}


	public static WebElement getCriditcarExpYear() {
		return criditcarExpYear;
	}


	public static WebElement getCvvNum() {
		return cvvNum;
	}


	public static WebElement getBookNoeButton() {
		return bookNoeButton;
	}


	public static WebElement getCancelButton() {
		return cancelButton;
	}


	public static WebElement getNavigation_Confirm_Page4() {
		return navigation_Confirm_Page4;
	}


	public static WebElement getError_Message_Of_without_First_Name() {
		return error_Message_Of_without_First_Name;
	}


	public static WebElement getError_Message_Of_without_Last_Name() {
		return error_Message_Of_without_Last_Name;
	}


	public static WebElement getError_Message_Of_without_Address() {
		return error_Message_Of_without_Address;
	}


	public static WebElement getError_Message_Of_without_Credit_Card_Number() {
		return error_Message_Of_without_Credit_Card_Number;
	}


	public static WebElement getError_Message_Of_Invalid_Credit_Card_Number() {
		return error_Message_Of_Invalid_Credit_Card_Number;
	}


	public static WebElement getError_Message_Of_Invalid_Credit_Card_Type() {
		return error_Message_Of_Invalid_Credit_Card_Type;
	}


	public static WebElement getError_Message_Of_expmonth_Credit_Card() {
		return error_Message_Of_expmonth_Credit_Card;
	}


	public static WebElement getError_Message_Of_expyear_Credit_Card() {
		return error_Message_Of_expyear_Credit_Card;
	}


	public static WebElement getError_Message_Of_ccvnum() {
		return error_Message_Of_ccvnum;
	}
//===================================================================================================================	
	
	
	public void enterAllFieldInBookAHotelPage(String firstname,String lastname,String address,String ccnum,String cctype,String expmonth,String expyear,String ccvnum ) {
		
		sendkeys(getFirstName(), firstname);		
		sendkeys(getLastName(), lastname);		
		sendkeys(getAddress(), address);		
		sendkeys(getCriditcardnum(), ccnum);
		ddSelectByIndex(getCriditcarType(), cctype);
		ddSelectByIndex(getCriditcarExpMonth(), expmonth);
		ddSelectByIndex(getCriditcarExpYear(), expyear);
		sendkeys(getCvvNum(), ccvnum);
		click(getBookNoeButton());

	}
	
	
	public void page_Navigation_To_Book_A_Hotel_Page(String expected) {


		String text = getText(getNavigation_Confirm_Page4());
	Assert.assertEquals("page Navigation To Book A Hotel Page is done",expected, text);
	}
	
	
	public void error_without_firstname(String expected) {

		String text = getText(getError_Message_Of_without_First_Name());
		Assert.assertEquals("Without first Name error Message validatio done",expected, text);
	}
	
	
	
	
	
	
	
}
