package hellocucumber;

import org.openqa.selenium.WebDriver;
import common.SelectDriverToTest;
import io.cucumber.java.en.*;
import pages.MagentoAddressPage;
import pages.MagentoLandingPage;

public class MagentoLandingPageSteps {

	WebDriver driver;
	MagentoLandingPage mlp;
	MagentoAddressPage map;

	// @BeforeAll
	@Given("I am on the Home Page {string}")
	public void i_am_on_the_home_page(String baseURI) {
		driver = SelectDriverToTest.getDriver("chrome");
		driver.get(baseURI);
		driver.manage().window().maximize();
		mlp = new MagentoLandingPage(driver);
		map = new MagentoAddressPage(driver);
	}

	@Then("I click on Men tab")
	public void i_click_on_men_tab() {
		mlp.mouseOverMenTab();
	}

	@Then("I click on Tops tab")
	public void i_click_on_tops_tab() {
		mlp.mouseOverMenTopsTab();

	}

	@Then("I click on Jackets tab")
	public void i_click_on_jackets_tab() {
		mlp.clickMenTopsJacket();
	}

	@Then("I select Size And I select Color")
	public void i_select_size_and_i_select_color() {
		mlp.clickJacketSize();
		mlp.clickJacketColor();
	}

	@Then("I click on Add to cart button")
	public void i_click_on_add_to_cart_button() {
		mlp.addToCart();
	}

	@Then("I click on Shopping cart link")
	public void i_click_on_shopping_cart_link() {
		mlp.clickOnShoppingCartLink();
	}

	@Then("I click on Proceed to checkout button")
	public void i_click_on_proceed_to_checkout_button() {
		mlp.clickOnProceedToCheckout();
	}

	@Then("I enter email {string} And firstName {string} And lastName {string}")
	public void i_enter_email_and_first_name_and_last_name(String email, String firstName, String lastName) {
		map.enterNameAndEmail(email, firstName, lastName);
	}

	@Then("I enter streetAddress {string} And city {string} And country {string} And state {string} And pinCode {string}")
	public void i_enter_street_address_and_city_and_country_and_state_and_pin_code(String streetAdd, String city,
			String country, String state, String pinCode) {
		map.enterAddressDetails(streetAdd, city, country, state, pinCode);
	}

	@Then("I enter telephone {string} number")
	public void i_enter_telephone_number(String telephone) {
		map.enterContactDetails(telephone);
	}

	@Then("I click on Next button")
	public void i_click_on_next_button() {
		map.clickOnNextButton();
	}
	
	@Then("I check Address checkbox And I click on Place order")
	public void i_check_address_checkbox_and_i_click_on_place_order() {
		map.clickOnPlaceOrderButton();
	}

	@Then("I verify order successfully placed")
	public void i_verify_order_successfully_placed() {
		map.verifyOrderConfirmation();
	}

}
