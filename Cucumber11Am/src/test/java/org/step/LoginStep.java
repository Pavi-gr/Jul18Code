package org.step;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	public static WebDriver driver;
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@When("user should be enter email")
	public void user_should_be_enter_email() {
	   driver.findElement(By.id("email")).sendKeys("fhv");
	}
	@When("user should be enter passowed")
	public void user_should_be_enter_passowed() {
	    driver.findElement(By.id("pass")).sendKeys("hv");
	}
	@When("user click the login buuton")
	public void user_click_the_login_buuton() {
	    driver.findElement(By.name("login")).click();
	}
	@Then("verify should the login error message")
	public void verify_should_the_login_error_message() {
	   String ex="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	   String act="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
	   Assert.assertEquals(ex, act);
			   
	}



}
