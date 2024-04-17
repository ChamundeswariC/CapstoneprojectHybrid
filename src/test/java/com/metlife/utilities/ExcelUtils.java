package com.metlife.utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
    public static Object[][] readExcel() {
        XSSFWorkbook wb;
        try {
            wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\cchamundeswari\\capstone\\src\\test\\resources\\Logincredentials.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sh = wb.getSheetAt(0);
        int row = sh.getPhysicalNumberOfRows() - 1;
        int col = sh.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][col];
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
                data[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return data;
    }
    public static String StaticIndexesCellValue(int row, int cellNUm) throws IOException, InvalidFormatException {

        File file = new File("C:\\Users\\cchamundeswari\\capstone\\src\\test\\resources\\Logincredentials.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);
        //Static indexes
        String cellValue = sheet.getRow(row).getCell(cellNUm).getStringCellValue();
        System.out.println(cellValue);
//        workbook.close();
//        fis.close();
        return cellValue;
    }
}