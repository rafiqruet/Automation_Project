package com.usa.stepdefinition;


import com.usa.basepage.SuperClass;
import com.usa.elementpage.Master_Page_Factory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FunctionalStepDef extends SuperClass {

	Master_Page_Factory pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = new Master_Page_Factory();
		pf.getLogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	}

	@When("User should be able to select {string} jacket from men module")
	public void user_should_be_able_to_select_jacket_from_men_module(String jacket) {
	}

	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String jacket) {
	}

	@When("User should be able to select the {string} and {string} and {string} then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String string, String string2, String string3) {
	}

	@When("User should be able to click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {

	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {

	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {

	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {

	}

	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String string) {

	}

}