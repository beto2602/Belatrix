package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesPage {
	WebDriver driver;
	By brandPuma = By.xpath("//*[@id=\"w4-w12\"]/ul/li[7]/div/a/div/div/span[1]");
	By sizeTen = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[5]/div/a/div/div/span[1]");
	By numberResults = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]");
	//By priceAscendant = By.xpath("");
	
	public ShoesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void brandPuma() {
		driver.findElement(brandPuma).click();
	}
	
	public void sizeTen() {
		driver.findElement(sizeTen).click();
	}
	
	public void numberResults() {
		String text = driver.findElement(numberResults).getText();
		System.out.println(text + " Results");
	}
}