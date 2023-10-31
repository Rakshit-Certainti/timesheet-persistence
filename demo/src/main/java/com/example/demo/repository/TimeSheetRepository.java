package com.example.demo.repository;

import com.example.demo.model.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TimeSheetRepository extends JpaRepository<TimeSheet, Long> {


}
