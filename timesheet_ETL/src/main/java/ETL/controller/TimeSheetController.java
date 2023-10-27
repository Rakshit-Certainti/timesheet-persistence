package ETL.controller;



import ETL.service.TimeSheetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/api/timesheet")
public class TimeSheetController {
    @Autowired
    TimeSheetServiceImpl timeSheetServiceImpl;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadTimeSheet(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
       return null;
    }
}
