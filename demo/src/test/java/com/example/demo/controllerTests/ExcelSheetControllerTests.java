package com.example.demo.controllerTests;

import com.example.demo.controller.ExcelSheetController;
import com.example.demo.service.ExcelDataServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ExcelSheetControllerTests {

    @Mock
    ExcelDataServiceImpl excelDataServiceImpl;

    @InjectMocks
    ExcelSheetController excelSheetController;

    @Test
    public void testUploadExcelSheet() {
        MockMultipartFile mockMultipartFile = new MockMultipartFile("excelFile", "test.xlsx", "multipart/form-data", "test data".getBytes());
        ResponseEntity<String> responseEntity = excelSheetController.uploadExcelSheet(mockMultipartFile);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
