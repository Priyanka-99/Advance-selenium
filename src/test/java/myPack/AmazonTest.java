package myPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchBx = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBx.sendKeys("iphone11");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBtn.click();
		WebElement priceEle=driver.findElement(By.xpath("(//span[@class='a-price'])[1]"));
		String priceTxt = priceEle.getText();
		System.out.println("Price: "+priceTxt);
		Reporter.log("Price: "+priceTxt);

		String str1=new String(priceTxt);
		String str2=new String("40000");
		if(str1.equals(str2)) {
			System.out.println("Price is similar");
		}else {
			System.out.println("Price is different");
		}
		driver.close();
	}

}
