package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By shoesSearch = By.xpath("//*[@id=\"gh-ac\"]");
	By search = By.xpath("//*[@id=\"gh-btn\"]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void findShoesSearch() {
		driver.findElement(shoesSearch).sendKeys("shoes");
	}
	
	public void searchButton() {
		driver.findElement(search).click();
	}
}
