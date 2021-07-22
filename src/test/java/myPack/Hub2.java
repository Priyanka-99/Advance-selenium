package myPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hub2 {
	
	@Parameters({"browser"})
	@Test
	public void setup(String browserName) throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.101:5556/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browserName);
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new RemoteWebDriver(remoteAddress,dc);
		driver.get("https://skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//driver.close();
	}

}
