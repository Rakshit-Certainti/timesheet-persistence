package ETL.repository;

import ETL.model.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long> {
    public void uploadFile(MultipartFile file);
}