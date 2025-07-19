package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {

	public static void loginReport(String json) {
		
		File f=new File("C:\\Users\\muthu\\eclipse-workspace\\Cucumber11Am\\target");
		
	
		Configuration c=new Configuration(f,"LoginStep");
		c.addClassifications("User","anu");
		c.addClassifications("Password","12233");
		c.addClassifications("Tool", "BDD Cucumber");
		c.addClassifications("Version", "7.20.1");
		
		
		List<String> li=new LinkedList<String>();
		li.add(json);
		
		ReportBuilder rp=new ReportBuilder(li,c);
		rp.generateReports();
		 //hi
		
		ReportBuilder rp=new ReportBuilder(li,c);
		rp.generateReports();
		 //hi


	//remove 2 line
		c.addClassifications("Password","12233");
		c.addClassifications("Tool", "BDD Cucumber");
		c.addClassifications("Version", "7.20.1");
		
		
		
		
	}

	
}
