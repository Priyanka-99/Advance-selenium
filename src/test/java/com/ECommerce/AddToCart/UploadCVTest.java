package com.ECommerce.AddToCart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadCVTest {
	
	/*
	 * Code to integrate AutoIT tool's file upload command with Selenium code
	 */
	
	@Test
	public void testnaukri() throws IOException {
		//WebDriver manager used to manage all browsers' drivers
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement uploadBtn = driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		uploadBtn.click();
		//AutoIT Integration with Selenium code 
		Runtime.getRuntime().exec("C:\\Users\\Global\\autoIT files\\uploadCV.exe");
	}

}
