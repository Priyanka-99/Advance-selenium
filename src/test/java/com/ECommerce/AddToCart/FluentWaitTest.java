package com.ECommerce.AddToCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest {
	
	@Test
	public void testfluentWait() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(500, TimeUnit.MILLISECONDS);
		wait.pollingEvery(250,TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Selenium");
		
	}

}
