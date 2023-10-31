package com.example.demo.controller;

import com.example.demo.service.ExcelDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/timesheet")
public class ExcelSheetController {
    @Autowired
    ExcelDataServiceImpl excelDataServiceImpl;
    @PostMapping("/upload&save")
    public ResponseEntity<String> uploadExcelSheet(@RequestParam("excelFile") MultipartFile file){
        try{
            if (file.isEmpty()) {
                return new ResponseEntity<>("Please select a file!", HttpStatus.BAD_REQUEST);
            }
            String fileName = file.getOriginalFilename();
            excelDataServiceImpl.uploadFile(file);
            return new ResponseEntity<>("File uploaded successfully: " + fileName, HttpStatus.OK);
        }

        catch (IOException e) {
            return new ResponseEntity<>("Failed to upload file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
