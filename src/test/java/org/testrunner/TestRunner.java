package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testdefinition.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile" ,glue= {"org.testdefinition"},monochrome=true ,dryRun=false ,plugin= {"pretty","json:C:\\\\Users\\\\SANKARASAN P\\\\Desktop\\\\Eclipse\\\\Selenium\\\\AdactinHotelBooking\\\\src\\\\test\\\\resources\\\\report\\\\actualreport.json"})
public class TestRunner {
	
	
	
	
	
	@AfterClass
	public static void afterclass()  {
		
		Report.generatingjvmreport("C:\\Users\\SANKARASAN P\\Desktop\\Eclipse\\Selenium\\AdactinHotelBooking\\src\\test\\resources\\report\\actualreport.json");	 
	

}
	
	
	
	

}
