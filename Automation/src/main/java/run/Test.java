package run;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.Excel;
import object.HomePage;
import object.SeleniumSetup;
import object.ShoesPage;

public class Test {
	
	
	public static void main(String[] args) {
		/*Excel excel = new Excel();
		List <String> fileLines = excel.readFile(System.getProperty("user.dir")+"/AttachedFiles/Test.xlsx");
		for (int i = 1; i < fileLines.size(); i++) {
			String[] separatedLines = fileLines.get(i).split("\t");*/
			WebDriver driver;
			SeleniumSetup setup = new SeleniumSetup();
			driver = setup.setup();
			
			HomePage homepage = new HomePage(driver);
			homepage.findShoesSearch();
			homepage.searchButton();
			ShoesPage shoespage = new ShoesPage(driver);
			shoespage.brandPuma();
			shoespage.sizeTen();
			shoespage.numberResults();
			//setup.closeDriver();
		}
	}


