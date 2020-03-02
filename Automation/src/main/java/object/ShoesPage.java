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
	By orderBy = By.tagName("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]");
	By priceOne = By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/div[3]/div[1]/span[1]");
	By priceTwo = By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/div[3]/div[1]/span");
	By priceThree = By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/div[3]/div[1]/span[1]");
	By priceFour = By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/div[3]/div[1]/span");
	By priceFive = By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/div[3]/div[1]/span");
	By firstDurationBlue = By.xpath("//*[@id=\"w9\"]/div/div/ul/li[2]/a/span");
	By recentAnnouncementBlue = By.xpath("//*[@id=\"w9\"]/div/div/ul/li[3]/a/span");
	By lowerPriceBlue = By.xpath("//*[@id=\"w9\"]/div/div/ul/li[4]/a/span");
	By higherPriceBlue = By.xpath("//*[@id=\"w9\"]/div/div/ul/li[5]/a/span");
	By nearDistanceBlue = By.xpath("//*[@id=\"w9\"]/div/div/ul/li[6]/a/span");
	By firstDurationBlack = By.xpath("//*[@id=\"w23-content-0[1]\"]");
	By recentAnnouncementBlack = By.xpath("//*[@id=\"w23-content-0[2]\"]");
	By lowerPriceBlack = By.xpath("//*[@id=\"w23-content-0[3]\"]");
	By higherPriceBlack = By.xpath("//*[@id=\"w23-content-0[4]\"]");
	By nearDistanceBlack = By.xpath("//*[@id=\"w23-content-0[5]\"]");
	By name1 =By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3");
	By name2 =By.xpath("//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3");
	By name3 =By.xpath("//*[@id=\"srp-river-results-listing3\"]/div/div[2]/a/h3");
	By name4 =By.xpath("//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3");
	By name5 =By.xpath("//*[@id=\"srp-river-results-listing5\"]/div/div[2]/a/h3");
	
	
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
		driver.findElement(orderBy).click();
		
		
	}
	
	public void selectFirstDurationBlue() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(firstDurationBlue)).click().build().perform();
	}
	
	public void selectAnnouncementBlue() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(recentAnnouncementBlue)).click().build().perform();
	}
	
	public void selectLowerPriceBlue() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(lowerPriceBlue)).click().build().perform();
	}
	
	public void selectHigherPriceBlue() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(higherPriceBlue)).click().build().perform();
	}
	
	public void selectNearDistanceBlue() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
		action.moveToElement(we).moveToElement(driver.findElement(nearDistanceBlue)).click().build().perform();
	}
	
	public void selectParameterBlue(String parameter) {
		switch(parameter) {
		
		case "Duration": selectFirstDurationBlue();
			break;
		case "Announcement": selectAnnouncementBlue();
			break;
		case "Lower": selectLowerPriceBlue();
			break;
		case "Higher": selectHigherPriceBlue();
			break;
		case "nearDistance": selectNearDistanceBlue();
			break;
		
		}
	}
	
	public void selectFirstDurationBlack() {
		driver.findElement(firstDurationBlack).click();
	}
	
	public void selectAnnouncementBlack() {
		driver.findElement(recentAnnouncementBlack);
	}
	
	public void selectLowerPriceBlack() {
		driver.findElement(lowerPriceBlack).click();
	}
	
	public void selectHigherPriceBlack() {
		driver.findElement(higherPriceBlack).click();
	}
	
	public void selectNearDistanceBlack() {
		driver.findElement(nearDistanceBlack).click();
	}
	
	public void selectParameterBlack(String parameter) {
		switch(parameter) {
		
		case "Duration": selectFirstDurationBlack();
			break;
		case "Announcement": selectAnnouncementBlack();
			break;
		case "Lower": selectLowerPriceBlack();
			break;
		case "Higher": selectHigherPriceBlack();
			break;
		case "nearDistance": selectNearDistanceBlack();
			break;
		
		}
	}
	
	public void orderResultsBy(String parameter) {
			
			
			if(driver.findElements(By.xpath("//*[@id=\"w23-content-0[1]\"]")).size()==0) {
				
				selectParameterBlue(parameter);
				
				/*
				Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]/div[1]"));
				action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"w9\"]/div/div/ul/li[4]/a/span"))).click().build().perform();
				*/
							
			}
			else {
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[3]")).findElement(By.tagName("div")).click();
			/*
			firstDuration = By.xpath("//*[@id=\"w23-content-0[1]\"]");
			recentAnnouncement = By.xpath("//*[@id=\"w23-content-0[2]\"]");
			lowerPrice = By.xpath("//*[@id=\"w23-content-0[3]\"]");
			higherPrice = By.xpath("//*[@id=\"w23-content-0[4]\"]");
			nearDistance = By.xpath("//*[@id=\"w23-content-0[5]\"]");
			*/
			selectParameterBlack(parameter);
			
			}
			
			
			
			
			
		
		
		
	}
	
	
	public List<String> getTopPrices() {
		
		List <String> price = new ArrayList<>();
		price.add(driver.findElement(priceOne).getText());
		price.add(driver.findElement(priceTwo).getText());
		price.add(driver.findElement(priceThree).getText());
		price.add(driver.findElement(priceFour).getText());
		price.add(driver.findElement(priceFive).getText());
		return price;
		
	}
	
	
	public List<String> getTopNames() {
		
		List <String> name = new ArrayList<>();
		name.add(driver.findElement(name1).getText());
		name.add(driver.findElement(name2).getText());
		name.add(driver.findElement(name3).getText());
		name.add(driver.findElement(name4).getText());
		name.add(driver.findElement(name5).getText());
		return name;
		
	}
	
	

	 
}