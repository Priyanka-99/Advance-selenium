package com.ECommerce.AddToCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSCommands {
	
	@Test
	public void testJS() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement linkEle=driver.findElement(By.xpath("(//a[contains(@href,'Selenium.WebDriver')])[2]"));
		
		//to click on particular webelement
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//to scroll till element
		js.executeScript("arguments[0].scrollIntoView(true);", linkEle);
		
		//to click on webelement
		js.executeScript("arguments[0].click();",linkEle);
		
		//to refresh page
		js.executeScript("history.go(0);");
		
		//to get title
		String title=js.executeScript("return document.title;").toString();
		System.out.println("Title: "+title);
		
		//to get url
		String url=js.executeScript("return document.URL").toString();
		System.out.println("URL: "+url);
		
		//to navigate to new url
		js.executeScript("window.location='https://www.google.co.in/'");
		
	}

}
