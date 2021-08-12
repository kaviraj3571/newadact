package org.testdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.pageobjects.BookAhotelPage;
import org.pageobjects.HotelConfirmationPage;
import org.pageobjects.Loginpageobjects;
import org.pageobjects.OrderIdPage;
import org.pageobjects.SearchHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDefenitionClass extends BaseClass {
	

	@Given("User on the adactin page {string}")
	public void user_on_the_adactin_page(String url) {

		weblanch(url);	
	}

	@When("User login with valid credentials {string},{string}")
	public void user_login_with_valid_credentials(String textusername, String textpassword) {

		Loginpageobjects Loginpageobjects = new Loginpageobjects();
		PageFactory.initElements(driver, Loginpageobjects.class);
		Loginpageobjects.login(textusername, textpassword);

	}

	@Then("User should verify page navigate to {string}")
	public void user_should_verify_page_navigate_to(String expected) {

		//SearchHotelPage SearchHotelPage = new SearchHotelPage();
		//PageFactory.initElements(driver, SearchHotelPage.class);

		//SearchHotelPage.page_Navigation_To_Search_Hotel_Page(expected);

	}

	@Then("User fill the field on searchotel page {string},{string},{string},{string},{string},{string},{string},{string},and click searchbutton")
	public void user_fill_the_field_on_searchotel_page_and_click_searchbutton(String location, String hotels, String roomtype, String numofrooms, String checkindate, String checkoutdate, String adultscnt, String childrecount) {

		SearchHotelPage SearchHotelPage = new SearchHotelPage();
		PageFactory.initElements(driver, SearchHotelPage.class);

		SearchHotelPage.normalboonkin(location, hotels, roomtype, numofrooms, checkindate, checkoutdate, adultscnt, childrecount);

	}

	@Then("Validate page navigate to {string}")
	public void validate_page_navigate_to(String expected) {

		//HotelConfirmationPage HotelConfirmationPage = new HotelConfirmationPage();
		//PageFactory.initElements(driver, HotelConfirmationPage.class);

		//HotelConfirmationPage.page_Navigation_To_Confirm_Hotel_Page(expected);
		
	}

	@When("User should conform and continue")
	public void user_should_conform_and_continue() {


		HotelConfirmationPage HotelConfirmationPage = new HotelConfirmationPage();
		PageFactory.initElements(driver, HotelConfirmationPage.class);

		HotelConfirmationPage.confirmAndContinue();

	}

	@Then("user conform page navigate to {string}")
	public void user_conform_page_navigate_to(String expected) {

	//	BookAhotelPage BookAhotelPage = new BookAhotelPage();
	//	PageFactory.initElements(driver, HotelConfirmationPage.class);
	//	BookAhotelPage.page_Navigation_To_Book_A_Hotel_Page(expected);

	}

	@When("user enter book noe page field {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_book_noe_page_field(String firstname, String lastname, String address, String ccnum, String cctype, String expmonth, String expyear, String ccvnum) {

		BookAhotelPage BookAhotelPage = new BookAhotelPage();
		PageFactory.initElements(driver, BookAhotelPage.class);

		BookAhotelPage.enterAllFieldInBookAHotelPage(firstname, lastname, address, ccnum, cctype, expmonth, expyear, ccvnum);

	}

	@When("User get the order id")
	public void user_get_the_order_id() {

		OrderIdPage OrderIdPage = new OrderIdPage();
		PageFactory.initElements(driver, OrderIdPage.class);

		OrderIdPage.getOrderid();

System.out.println("finish");

System.out.println("kavi");




	}
}
