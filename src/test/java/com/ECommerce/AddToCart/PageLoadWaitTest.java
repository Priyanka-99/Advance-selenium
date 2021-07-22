package com.ECommerce.AddToCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadWaitTest {
	
	@Test
	public void testPageLoad() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		try {
			driver.get("https://www.amazon.in/");
			System.out.println("Page loaded within time duration");
			
		}catch(Exception e) {
			System.out.println("Page not loaded within time duration");
		}
	}

}
