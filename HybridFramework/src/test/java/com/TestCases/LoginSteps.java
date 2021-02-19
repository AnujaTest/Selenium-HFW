package com.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.io.IOException;


import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumUtilities;
import com.Pages.Login;


public class LoginSteps extends Library{
	SeleniumUtilities SU;
	 Login page;

  @Test
  public void login() {
		Login lpage=new Login(driver);
		lpage.login(properties.getProperty("username"), properties.getProperty("password"));
		logger.info("Entered username and password");
		
	}
	  @BeforeClass
  public void startup() {
		browserSetUp();
		logger.info("Launched the chrome Application");
		}
  @AfterClass
	public void close() throws IOException {
		SeleniumUtilities SU= new SeleniumUtilities(driver);
		SU.to_take_screenshot("src/test/resources/Screenshot/fb.png");
		tearDown();
		logger.info("Take screenshot and closing the browser");
		
	}

}



