package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoLandingPage {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public MagentoLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='ui-id-3']")
	WebElement catWhatsNew;

	@FindBy(xpath = "//span[text()='Women']")
	WebElement catWomen;

	@FindBy(xpath = "//a[@id='ui-id-5']")
	WebElement catMen;

	@FindBy(xpath = "//span[text()='Gear']")
	WebElement catGear;

	@FindBy(xpath = "//span[text()='Training']")
	WebElement catTraining;

	@FindBy(xpath = "//span[text()='Sale']")
	WebElement catSale;

	@FindBy(xpath = "//a[@id='ui-id-9']/span[text()='Tops']")
	WebElement catWomenTops;

	@FindBy(xpath = "//a[@id='ui-id-10']/span[text()='Bottoms']")
	WebElement catWomenBottoms;

	@FindBy(xpath = "//a[@id='ui-id-17']")
	WebElement catMenTops;

	@FindBy(xpath = "//a[@id='ui-id-18']/span[text()='Bottoms']")
	WebElement catMenBottoms;

	@FindBy(xpath = "//a[@id='ui-id-19']/span[text()='Jackets']")
	WebElement catJacket;

	@FindBy(xpath = "//div[@class='swatch-opt-430']/div/div/div[@option-label='M']")
	WebElement jacketSize;

	@FindBy(xpath = "//div[@class='swatch-opt-430']/div[2]/div/div[@option-label='Orange']")
	WebElement jacketColor;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
	WebElement productImage;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")
	WebElement addToCart;

	@FindBy(xpath = "//strong/span[text()='My Cart']")
	WebElement myCart;

	@FindBy(xpath = "//a[text()='shopping cart']")
	WebElement shoppingCart;

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	WebElement proceedToCheckout;

	public void mouseOverMenTab() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(catMen).build().perform();
	}

	public void mouseOverMenTopsTab() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(catMenTops).build().perform();
	}

	public void clickMenTopsJacket() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(catJacket).click().perform();

	}

	public void clickJacketSize() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(jacketSize).click().perform();
	}

	public void clickJacketColor() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(jacketColor).click().perform();
	}

	public void addToCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new Actions(driver).moveToElement(productImage).build().perform();
		addToCart.click();
	}

	public void clickOnMyCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		myCart.click();
	}

	public void clickOnProceedToCheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		proceedToCheckout.click();
	}

	public void clickOnShoppingCartLink() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		shoppingCart.click();
	}
}
