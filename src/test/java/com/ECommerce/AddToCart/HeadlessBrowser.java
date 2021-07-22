package com.ECommerce.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	
	@Test
	public void demoHeadless() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/");
		//WebElement cartBtn=driver.findElement(By.xpath("//div[@class='popup-blk cart-blk']"));
		//cartBtn.click();
		//Reporter.log("Button clicked !!!",true);
		System.out.println("Page title: "+driver.getTitle());
		System.out.println("Page URL: "+driver.getCurrentUrl());
		driver.quit();
	}

}
