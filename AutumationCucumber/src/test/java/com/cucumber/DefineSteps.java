package com.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 /**
  * 
  * @author Khangdd
  *
  */
public class DefineSteps {
	private WebDriver driver = null;
	
	
	@Given("^I should be at the login page$")
	public void i_should_be_at_the_login_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://cucumber.herokuapp.com/login");
		
	}

	@And("^I provide valid userid and password$")
	public void i_provide_valid_userid_and_password() throws Throwable {
		System.out.println("@And: I provide valid userid and password");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		System.out.println("@When: I click on login button");
	}

	@Then("^I should be able to login inside the web demo$")
	public void i_should_be_able_to_login_inside_the_web_demo() throws Throwable {
		System.out.println("@Then: I should be able to login inside the web demo");
	}

	@And("^The title of web page should be Main page of this web$")
	public void the_title_of_web_page_should_be_Main_page_of_this_web() throws Throwable {
		System.out.println("@And: The title of web page should be Main page of this web");
	}
}
