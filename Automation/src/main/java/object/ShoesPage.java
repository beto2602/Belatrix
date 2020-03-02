package object;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoesPage {
	WebDriver driver;
	By adidasBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[1]/div/a/div/div/span[1]");
	By asicsBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[2]/div/a/div/div/span[1]");
	By clarksBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[3]/div/a/div/div/span[1]");
	By jordanBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[4]/div/a/div/div/span[1]");
	By newBalanceBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[5]/div/a/div/div/span[1]");
	By nikeBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[6]/div/a/div/div/span[1]");
	By pumaBrand = By.xpath("//*[@id=\"w4-w12\"]/ul/li[7]/div/a/div/div/span[1]");
	By unBranded = By.xpath("//*[@id=\"w4-w12\"]/ul/li[8]/div/a/div/div/span[1]");
	By eigthSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/div/span[1]");
	By eigthFiveSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[1]/div/a/div/div/span[1]");
	By nineSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[3]/div/a/div/div/span[1]");
	By nineFiveSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[4]/div/a/div/div/span[1]");
	By tenSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[5]/div/a/div/div/span[1]");
	By tenFiveSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[6]/div/a/div/div/span[1]");
	By elevenSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[7]/div/a/div/div/span[1]");
	By twelveSize = By.xpath("//*[@id=\"x-refine__group_1__0\"]/ul/li[8]/div/a/div/div/span[1]");
	By numberResults = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]");
	By orderBy = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]");
	By priceOne = By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span[1]");
	By firstDuration = By.xpath("//*[@id=\"w24-content-item[1]\"]'");
	By recentAnnouncement = By.xpath("//*[@id=\"w24-content-item[2]\"]");
	By lowerPrice = By.xpath("//*[@id=\"w23-content-0[3]\"]");
	By higherPrice = By.xpath("//*[@id=\"w24-content-item[4]\"]");
	By nearDistance = By.xpath("//*[@id=\"w24-content-item[5]\"]");
	//By priceAscendant = By.xpath("");
	
	public ShoesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectAdidasBrand() {
		driver.findElement(adidasBrand).click();
	}
	
	public void selectAsicsBrand() {
		driver.findElement(asicsBrand).click();
	}
	
	public void selectClarksBrand() {
		driver.findElement(clarksBrand).click();
	}
	
	public void selectJordanBrand() {
		driver.findElement(jordanBrand).click();
	}
	
	public void selectNewBalanceBrand() {
		driver.findElement(newBalanceBrand).click();
	}
	
	public void selectNikeBrand() {
		driver.findElement(nikeBrand).click();
	}
	
	public void selectPumaBrand() {
		driver.findElement(pumaBrand).click();
	}
	
	public void selectUnBranded() {
		driver.findElement(unBranded).click();
	}
	
	public void selectBrandShoes(String brand) {
		switch (brand) {
		case "adidas": selectAdidasBrand();
			break;
		case "asics": selectAsicsBrand();
			break;
		case "clarks": selectClarksBrand();
			break;
		case "jordan": selectJordanBrand();
			break;
		case "newbalance": selectNewBalanceBrand();
			break;
		case "nike": selectNikeBrand();
			break;
		case "puma": selectPumaBrand();
			break;
		default: selectUnBranded();
			break;
		}
	}
	
	public void selectEightSize() {
		driver.findElement(eigthSize).click();
	}
	
	public void selectEightFiveSize() {
		driver.findElement(eigthFiveSize).click();
	}
	
	public void selectNineSize() {
		driver.findElement(nineSize).click();
	}
	
	public void selectNineFiveSize() {
		driver.findElement(nineFiveSize).click();
	}
	
	public void selectTenSize() {
		driver.findElement(tenSize).click();
	}
	
	public void selectTenFiveSize() {
		driver.findElement(tenFiveSize).click();
	}
	
	public void selectElevenSize() {
		driver.findElement(elevenSize).click();
	}
	public void selectTwelveSize() {
		driver.findElement(twelveSize).click();
	}
	
	public void selectSizeShoes(String size) {
		switch (size) {
		case "8": selectEightSize();
			break;
		case "8,5": selectEightFiveSize();
			break;
		case "9": selectNineSize();
			break;
		case "9,5": selectNineFiveSize();
			break;
		case "10": selectTenSize();
			break;
		case "10,5": selectTenFiveSize();
			break;
		case "11": selectElevenSize();
			break;
		case "12": selectTwelveSize();
			break;
		default: System.out.println("Size not available");
			break;
		}
	}
	
	
	
	public void numberResults() {
		String text = driver.findElement(numberResults).getText();
		System.out.println(text + " Results");
	}
	
	public void clickOrderBy() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Boolean firstResult = new WebDriverWait(driver, 20)
		        .until(ExpectedConditions.attributeContains(By.xpath("//*[@id=\"google_ads_iframe_/79850875/ebay.gbh.search/keywordsRR_0\"]"), "data-load-complete", "true"));
		System.out.println(firstResult);
		
		driver.findElement(orderBy).click();
		driver.findElement(lowerPrice).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(lowerPrice).click();
	}
	
	
	public void selectFirstDuration() {
		driver.findElement(firstDuration).click();
	}
	
	public void selectAnnouncement() {
		driver.findElement(recentAnnouncement);
		
	}
	public void selectLowerPrice() {
		Actions action = new Actions(driver);
		WebElement we =driver.findElement(orderBy);
		action.moveToElement(we).moveToElement(driver.findElement(By.linkText("Precio + Envío: más bajo primero"))).click().build().perform();
		//driver.findElement(lowerPrice).click();
		
	}
	public void selectHigherPrice() {
		driver.findElement(higherPrice).click();
		
	}
	public void selectNearDistance() {
		driver.findElement(nearDistance).click();
		
	}
	public void selectParameter(String parameter) {
		switch(parameter) {
		
		case "Duration": selectFirstDuration();
			break;
		case "Announcement": selectAnnouncement();
			break;
		case "Lower": selectLowerPrice();
			break;
		case "Higher": selectHigherPrice();
			break;
		case "nearDistance": selectNearDistance();
			break;
		
		}
	}
	
	
	
	public void orderResultsBy(String parameter) {
		clickOrderBy();
		//selectParameter(parameter);
		
	}
	
	
	public List<String> getTopPrices() {
		
		List <String> price = new ArrayList<>();
		//price.add(driver.findElement(priceOne).getText().split(" "))*/
		
		System.out.println(driver.findElement(priceOne).getText());
		
		return price;
		
	}
	
	

	 
}