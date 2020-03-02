package run;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import model.Excel;
import object.HomePage;
import object.SeleniumSetup;
import object.ShoesPage;

public class Run {
	
	WebDriver driver;
	Excel excel;
	List <String> fileLines;
	SeleniumSetup setup;
	@Before
	public void setup() {
		excel = new Excel();
		fileLines = excel.readFile(System.getProperty("user.dir")+"/AttachedFiles/Test.xlsx");
	}
	
	
	@Test
	public void ebayShoes() {
		for (int i = 1; i < fileLines.size(); i++) {
			String[] separatedLines = fileLines.get(i).split("\t");
			setup= new SeleniumSetup();
			driver = setup.setup();
			HomePage homepage = new HomePage(driver);
			homepage.findShoesSearch();
			homepage.searchButton();
			ShoesPage shoespage = new ShoesPage(driver);
			shoespage.selectBrandShoes(separatedLines[0]);
			shoespage.selectSizeShoes(separatedLines[1]);
			shoespage.numberResults();
		//	shoespage.getTopPrices();
			shoespage.orderResultsBy("Lower");
			assertEquals("46,704","");
			
			
			setup.closeDriver();
		}
	}
}

