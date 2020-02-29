package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static ArrayList<String> readFile(String path) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			Workbook workbook = WorkbookFactory.create(new File(path));
			Sheet sheet = workbook.getSheetAt(0);
			DataFormatter dataFormatter = new DataFormatter();
			Iterator<Row> rowIterator = sheet.rowIterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				String aux = "";
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					String cellValue = dataFormatter.formatCellValue(cell);

					aux = aux + cellValue + "\t";
				}

				lines.add(aux);
			}
		} catch (Exception e) {

		}
		return lines;

	}
	
}
