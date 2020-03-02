package run;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
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
			shoespage.orderResultsBy(separatedLines[2]);
			List <String> prices =shoespage.getTopPrices();
			assertEquals("COP $95 035.21",prices.get(0));
			assertEquals("COP $93 943.66 a COP $113 204.23",prices.get(1));
			assertEquals("COP $17 957.75",prices.get(2));
			assertEquals("COP $122 887.32",prices.get(3));
			assertEquals("COP $122 887.32",prices.get(4));
			
			List<String> names = shoespage.getTopNames();
			for(int j=0; j<prices.size();j++) {
				System.out.println(names.get(j)+" "+prices.get(j) );
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Sort by name");
			Collections.sort(names);
			for(int j=0; j<names.size();j++) {
				System.out.println(names.get(j));
			}
			
			List <String> justPrices = new ArrayList<>();
			for(int j=0; j<prices.size();j++) {
				
				justPrices.add(prices.get(j).split("\\$")[1].replace(" ","").replaceAll("[A-Za-z]", ""));
				
			
			}
			
			List<Double> finalPrices = new ArrayList<Double>();
			
			for(int j=0; j<justPrices.size();j++) {
				finalPrices.add(Double.parseDouble(justPrices.get(j)));
			}
			
			Collections.sort(finalPrices);
			
			
			System.out.println();
			System.out.println();
			System.out.println("Sort by price");
			for(int j=0; j<finalPrices.size();j++) {
				System.out.println(finalPrices.get(j));
			}
			
			
			setup.closeDriver();
		}
	}
}

