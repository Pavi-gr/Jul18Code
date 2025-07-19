package org.runer;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\Feature\\login.feature",
		glue="org.step",
		plugin="json:C:\\Users\\muthu\\eclipse-workspace\\Cucumber11Am\\target\\report.html"
		)
public class RunerClass {
	
	@AfterClass
	public static void reportex() {
		ReportClass.loginReport("C:\\Users\\muthu\\eclipse-workspace\\Cucumber11Am\\target\\report.html");
		
	}

		@AfterClass
	public static void reportex() {
		ReportClass.loginReport("C:\\Users\\muthu\\eclipse-workspace\\Cucumber11Am\\target\\report.html");
		
	}

}
