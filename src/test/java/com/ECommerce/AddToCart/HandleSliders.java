package com.ECommerce.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSliders {
	
	@Test
	public void handleSlider() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement sliderEle = driver.findElement(By.id("slider"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(sliderEle, 700, 0).perform();
		Thread.sleep(2000);
		a.dragAndDropBy(sliderEle,-700, 0).perform();
	}

}
