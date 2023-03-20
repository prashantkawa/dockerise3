package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDriverToTest {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(String checkDriver) {
		
		if(checkDriver.equalsIgnoreCase("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	System.setProperty("webdriver.chrome.silentOutput", "true");
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--remote-allow-origins=*");
	    	driver = new ChromeDriver(options);
		}
		else if(checkDriver.equalsIgnoreCase("firefox")) {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver=new FirefoxDriver();
		}
		else {
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
		}
		
		return driver;
		
	}

}
