package StepDef;

import Utility.BaseDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo extends BaseDemo {
	
	public static BaseDemo base;
	RedditDemo page =new RedditDemo();
	
	@Given("I navigate to website page")
	public void i_navigate_to_website_page() {
		base.driver.get("https://www.rediff.com/");
	}

	@When("I clicked signin link")
	public void i_clicked_signin_link() {
		page.signin();
	}

	@When("I clicked create account link")
	public void i_clicked_create_account_link() {
		page.accountCreation();
	}

	@When("I entered the details")
	public void i_entered_the_details() {
		page.enterDetails();
	}

	@Then("I clicked the create account button")
	public void i_clicked_the_create_account_button() {
		page.creatAccount();
	}
}
