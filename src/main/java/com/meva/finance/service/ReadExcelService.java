package com.meva.finance.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.google.common.base.Strings;

@Service
public class ReadExcelService {

	public List<Long> loadDataExcel(String nameSheet) throws IOException {
		List<Long> listContacts = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File("C:\\zap-meva\\lead.xlsx"));
		Sheet sheet = new XSSFWorkbook(file).getSheet(nameSheet);
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType() == CellType.STRING) {
					String value = cell.getStringCellValue().replaceAll("[\\D]", "");
					if (!Strings.isNullOrEmpty(value)) {
						listContacts.add(Long.parseLong(value));
					}

				}

			}
		}
		return listContacts;
	}
}
