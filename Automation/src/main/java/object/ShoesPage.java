package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}