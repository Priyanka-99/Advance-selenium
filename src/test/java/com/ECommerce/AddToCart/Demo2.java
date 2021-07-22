package com.ECommerce.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(DemoListener.class)
public class Demo2 {
	
	@Test
	public void testListener() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement cartBtn=driver.findElement(By.xpath("//div[@class='popup-blk cart-blk']"));
		cartBtn.click();
		Reporter.log("Button clicked !!!",true);
		System.out.println("Page title: "+driver.getTitle());
		System.out.println("Page URL: "+driver.getCurrentUrl());
		driver.close();
	}

}
