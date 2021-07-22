package com.ECommerce.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ECommerce.AddToCart.generics.BaseLib;

public class AddToCartTest extends BaseLib{
	
	@Test
	public void cartDemo() {
		WebElement searchTxtBx=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchTxtBx.sendKeys("iphone 11 128 gb purple");
		WebElement searchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBtn.click();
		WebElement iphoneEle=driver.findElement(By.xpath("(//span[@class='a-price'])[1]"));
		iphoneEle.click();
		
		WebElement addToCartBtn=driver.findElement(By.xpath("span[text()='Add to Cart']"));
		//WebElement addToCartBtn=driver.findElement(By.xpath("//span[@id='submit.add-to-cart']/ancestor::div[@id='addToCart_feature_div']//input[@id='add-to-cart-button']"));
		addToCartBtn.click();
		
	}

}
