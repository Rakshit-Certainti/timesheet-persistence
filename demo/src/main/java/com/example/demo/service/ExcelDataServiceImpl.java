package com.example.demo.service;

import com.example.demo.model.TimeSheet;
import com.example.demo.repository.TimeSheetRepository;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExcelDataServiceImpl {
     @Autowired
     TimeSheetRepository timeSheetRepository;



    public void uploadFile(MultipartFile file) throws IOException {
        try (InputStream inputStream = file.getInputStream()) {
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            List<TimeSheet> timeSheets = new ArrayList<>();


            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                TimeSheet timeSheet = new TimeSheet();
                timeSheet.setTimeSheetID((int) row.getCell(0).getNumericCellValue());
                timeSheet.setTimePeriod(row.getCell(1).getStringCellValue());
                timeSheet.setFirstName(row.getCell(3).getStringCellValue());
                timeSheet.setEmployeeID((int) row.getCell(2).getNumericCellValue());
                timeSheet.setLastName(row.getCell(4).getStringCellValue());
                timeSheet.setDate(row.getCell(5).getDateCellValue());
                timeSheet.setTaskName(row.getCell(6).getStringCellValue());
                timeSheet.setTaskDescription(row.getCell(7).getStringCellValue());
                timeSheet.setTaskStatus(row.getCell(8).getStringCellValue());
                timeSheet.setTaskType(row.getCell(9).getStringCellValue());
                timeSheet.setProjectID((int)row.getCell(10).getNumericCellValue());
                timeSheet.setProjectName(row.getCell(11).getStringCellValue());
                timeSheets.add(timeSheet);
            }



            timeSheetRepository.saveAllAndFlush(timeSheets);
        } catch (Exception e) {
            throw new IOException("Failed to process Excel file: " + e.getMessage());
        }
    }
}
