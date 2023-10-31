package ETL.service;

import ETL.model.TimeSheet;

import java.util.List;

public interface ExcelDataService {
    List<TimeSheet> getExcelDataAsList();

    int saveExcelData(List<TimeSheet> invoices);
}
