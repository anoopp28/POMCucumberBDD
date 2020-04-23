package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class loginPage extends TestBase {
	
	//all page objects
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	//initializing the page objects
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String usr, String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();    //because after clicking on loginbtn it will move to HomePage
	}
	
	
	
}



