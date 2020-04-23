package com.qa.StepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.loginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {

	loginPage loginPageRef;
	HomePage homePageRef;
	
	public HomePageSteps(){
		super();
	}

	
	@Given("^User opens browser page$")
	public void user_opens_browser_page()  {
		
		TestBase.initialization();
	
	}

	@SuppressWarnings("deprecation")
	@When("^user is on login page$")
	public void user_is_on_login_page() {
		loginPage loginPageRef = new loginPage();
		Assert.assertEquals("Cogmento CRM", loginPageRef.validateLoginPageTitle());
	    
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
		loginPage loginPageRef = new loginPage();
	  homePageRef =  loginPageRef.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}


	@SuppressWarnings("deprecation")
	@Then("^Home page is displayed$")
	public void home_page_is_displayed()  {
		String Title =  homePageRef.validateHomePageTitle();
		Assert.assertEquals("Cogmento CRM", Title);
	}

	

}
