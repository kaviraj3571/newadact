package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public  WebDriver driver;



	public WebDriver weblanch(String url) {

		System.out.println(url);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANKARASAN P\\Desktop\\Eclipse\\Selenium\\AdactinHotelBooking\\drv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;

	}

	public void sendkeys(WebElement ref, String value) {
		
		ref.clear();
		ref.sendKeys(value);

	}
	public void click(WebElement ref) {
		ref.click();

	}

	public void ddSelectByIndex(WebElement ref ,String index) {
		Select select = new Select(ref);
		int indecposition = Integer.parseInt(index);
		select.selectByIndex(indecposition);

	}
	
	public void ddSelectByValue(WebElement ref ,String value) {
		Select select = new Select(ref);
		select.selectByValue(value);
		
	}
	public void ddSelectByVisibleText(WebElement ref ,String text) {
		
		Select select = new Select(ref);
		select.selectByVisibleText(text);
	}
	
	public String getText(WebElement ref) {
		String text = ref.getText();
		return text;		

	}
	
	public String getattribute(WebElement ref,String value) {
		
		
		String attribute = ref.getAttribute(value);
		
		return attribute;

	}
	
	
	
	
	
	
	

}
