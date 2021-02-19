package com.StepsDefinition;

//import java.util.concurrent.TimeUnit;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumUtilities;
import com.Pages.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends Library {
	Login LP;
	SeleniumUtilities SU;
	@Given("To launch the CRM application")
	public void to_launch_the_CRM_application() {
		browserSetUp();
	   
	}

	@When("To enter the username and password")
	public void to_enter_the_username_and_password() {
		LP= new Login(driver);
		LP.login(properties.getProperty("Username"), properties.getProperty("Password"));
		
	    	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		LP.clicklogin();
		Thread.sleep(3000);
		}

	@When("take a screenshot")
	public void take_a_screenshot() {
	    SU= new SeleniumUtilities(driver);
	    SU.to_take_screenshot("src/test/resources/ScreenShot/crm.png");
	}

	@Then("close the browser")
	public void close_the_browser() {
		tearDown();
		
	    	}

}