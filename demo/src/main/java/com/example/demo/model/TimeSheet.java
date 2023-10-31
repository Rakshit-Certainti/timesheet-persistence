package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimeSheet {
    @Id
    @Column
    Integer timeSheetID;
    @Column
    String timePeriod;
    @Column
    Integer employeeID;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    Date date;
    @Column
    String taskName;
    @Column
    String taskDescription;
    @Column
    String taskStatus;
    @Column
    String taskType;
    @Column
    Integer  projectID;
    @Column
    String projectName;

}
