package com.testframework.automation.execution;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelExecutionReader {

    public static Map<String, Boolean> read(String path) {

        Map<String, Boolean> executionMap = new HashMap<>();

        try (InputStream is =
                     ExcelExecutionReader.class.getResourceAsStream(path)) {

            if (is == null) {
                throw new RuntimeException(
                        "Excel file NOT FOUND: " + path
                );
            }

            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);
                if (row == null) continue;

                Cell tcCell = row.getCell(0);
                Cell flagCell = row.getCell(1);

                if (tcCell == null || flagCell == null) continue;

                String testCase =
                        tcCell.getStringCellValue().trim();

                boolean execute;

                if (flagCell.getCellType() == CellType.BOOLEAN) {
                    execute = flagCell.getBooleanCellValue();
                } else {
                    execute = flagCell
                            .getStringCellValue()
                            .trim()
                            .equalsIgnoreCase("true");
                }

                executionMap.put(testCase, execute);
            }

            workbook.close();

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to read execution control Excel", e
            );
        }

        return executionMap;
    }
}
