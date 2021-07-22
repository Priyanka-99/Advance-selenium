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

public class Hub3 {

	@Parameters({"browser","ip"})
	@Test
	public void tc(String browserName, String ipEle) throws MalformedURLException {
		URL remoteAddress=new URL("http://"+ipEle+":5556/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName(browserName);
		WebDriver driver=new RemoteWebDriver(remoteAddress,dc);
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

}
