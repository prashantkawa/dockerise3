package pages;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MagentoAddressPage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public MagentoAddressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//fieldset/div/div/input[@id='customer-email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@name='street[0]']")
	WebElement streetAddress;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//select[@name='region_id']")
	WebElement stateProvince;

	@FindBy(xpath = "//input[@name='postcode']")
	WebElement postalCode;

	@FindBy(xpath = "//select[@name='country_id']")
	WebElement country;

	@FindBy(xpath = "//input[@name='telephone']")
	WebElement telephone;

	@FindBy(xpath = "//*[@id='shipping-method-buttons-container']/div/button/span")
	WebElement nextButton;

	@FindBy(xpath = "//div[@class='checkout-shipping-method']/div[3]//descendant::input")
	WebElement paymentMethod;

	@FindBy(xpath = "//div[@class='checkout-billing-address']/div//descendant::input")
	WebElement addressCheckbox;

	@FindBy(xpath = "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")
	WebElement placeOrder;

	@FindBy(xpath = "//div[@class='page-title-wrapper']/h1/span")
	WebElement confirmText;

	static final Logger logger = Logger.getLogger(MagentoAddressPage.class);

	public void enterNameAndEmail(String email, String fname, String lname) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		emailAddress.sendKeys(email);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
	}

	public void enterAddressDetails(String streetAdd, String city, String country, String state, String pinCode) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		streetAddress.sendKeys(streetAdd);
		this.city.sendKeys(city);

		Select selectCountry = new Select(this.country);
		Select selctState = new Select(stateProvince);

		selectCountry.selectByVisibleText(country);

		selctState.selectByVisibleText(state);

		postalCode.sendKeys(pinCode);

	}

	public void enterContactDetails(String telephone) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.telephone.sendKeys(telephone);
	}

	public void clickOnNextButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		paymentMethod.click();
		nextButton.click();
	}

	public void clickOnPlaceOrderButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		addressCheckbox.click();
		placeOrder.click();
	}

	public void verifyOrderConfirmation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String ct = this.confirmText.getText();

		if (ct.equalsIgnoreCase("Thank you for your purchase!")) {
			logger.info("Ordered successfully");
		} else {
			logger.error("Ordered did not confirmed");
		}

	}

}
