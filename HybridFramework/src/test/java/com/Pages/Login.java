package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class Login extends Library{
	WebDriver driver;
	@FindBy(xpath="//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement Login;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement Loginbutton;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}
	public void login(String Username,String Password) {
		Login.click();
		username.sendKeys(Username);
		pwd.sendKeys(Password);
	}
	
	public void clicklogin() {
		Loginbutton.click();
	}

}


