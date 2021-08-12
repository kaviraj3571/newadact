package org.testdefinition;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	
	
	public static void generatingjvmreport(String jsonfile) {
		
		
		
	File reportdirectory = new File("C:\\Users\\SANKARASAN P\\Desktop\\Eclipse\\Selenium\\AdactinHotelBooking\\src\\test\\resources\\report");
	
	Configuration configuration = new Configuration(reportdirectory , "Adactin Hotel");
	configuration.addClassifications("OS", "Windows 10");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Version", "92");
	
	ArrayList<String> file = new ArrayList<String>();
	
	file.add(jsonfile);
	
	ReportBuilder builder = new ReportBuilder(file, configuration);
	builder.generateReports();
	System.out.println("done");
}
	
	
	

}
