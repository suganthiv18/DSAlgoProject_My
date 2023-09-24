package StepDefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import PageObjects.SignInPage;
import Utilities.ReadExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPage_SD {

	SignInPage sign = new SignInPage();

	@Given("user is on Login page")
	public void user_is_on_login_page() {
		sign.loginPage();
	}

	@When("user clicks Register")
	public void user_clicks_register() {
	   sign.clickRegistration();
	}

	@Then("user is navigated to the register page")
	public void user_is_navigated_to_the_register_page() {
		sign.register_page();
		//System.out.println("test");
	}
	
	@When("Pass inputs from excel sheet")
	public void pass_inputs_from_excel_sheet() throws EncryptedDocumentException, IOException {
	   
		ReadExcel inputs = new ReadExcel();
		inputs.getData("Login");
		
		
	}


	@Then("click login button")
	public void click_login_button() {
		 sign.clickLogin();
	}
	
	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String string, String string2) {
	    sign.enterUsernamePassword(string, string2);
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
	    sign.clickLogin();
	}

}
