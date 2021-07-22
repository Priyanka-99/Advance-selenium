package com.ECommerce.AddToCart.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserFactory {

	/**
	 * Browser Factory contains the list of browsers in which
	 * test scripts will be executed, hence, promoting
	 * cross-browser testing
	 */

	public static WebDriver launchBrowser(String browserName){
		WebDriver driver=null;

		//this will execute in case of chrome browser
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("Chrome Browser launched", true);
		}

		//this will execute in case of firefox browser
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/exefiles/geckodriver");
			driver=new FirefoxDriver();
			Reporter.log("Firefox Browser launched", true);
		}


		return driver;
	}

}
