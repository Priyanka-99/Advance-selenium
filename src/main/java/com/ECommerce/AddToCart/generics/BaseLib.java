package com.ECommerce.AddToCart.generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseLib {
	
public static WebDriver driver;            //for parallel execution
	
	@BeforeTest
	@Parameters({"browser" , "baseurl"})
	public void preCondition(String browserName, String url)
	{
		//launchBrowser method will be used to launch browser
		driver=BrowserFactory.launchBrowser(browserName);
		//this will delete all the cookies
		driver.manage().deleteAllCookies();
		//this will maximize the window
		driver.manage().window().maximize();
		//implicit wait will wait for 60 secs until the page loads
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//this will navigate us to url
		driver.get(url);
		Reporter.log(url+ " url navigated", true);
	}
	
	/*
	 * @AfterTest public void postCondition() { //close method will close the
	 * browser when the script is successfully executed driver.quit();
	 * Reporter.log("Browser Closed", true); }
	 */


}
