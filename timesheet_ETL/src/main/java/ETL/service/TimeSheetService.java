package ETL.service;

import org.springframework.web.multipart.MultipartFile;

public interface TimeSheetService {
    public void uploadFile(MultipartFile file);
}
