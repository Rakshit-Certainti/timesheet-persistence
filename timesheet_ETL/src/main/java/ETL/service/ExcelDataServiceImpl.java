package ETL.service;

import ETL.model.TimeSheet;

import ETL.repository.TimeSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
@Service
public class ExcelDataServiceImpl implements ExcelDataService{

    @Value("${app.upload.file:${user.home}}")
    public String EXCEL_FILE_PATH;
    @Autowired
    TimeSheetRepository timeSheetRepository;
    @Override
    public List<TimeSheet> getExcelDataAsList() {
        return null;
    }

    @Override
    public int saveExcelData(List<TimeSheet> invoices) {
        return 0;
    }
}
