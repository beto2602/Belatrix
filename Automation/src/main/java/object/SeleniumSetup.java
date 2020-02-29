package object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {
	WebDriver driver;
		
	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/seleniumdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		return driver;
	}
	public void closeDriver() {
		driver.close();
	}
}
