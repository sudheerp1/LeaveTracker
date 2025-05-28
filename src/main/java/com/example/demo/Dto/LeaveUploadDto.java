package com.example.demo.Dto;

import java.time.LocalDate;
import com.example.demo.entity.LeaveType;
import lombok.Data;
@Data
public class LeaveUploadDto {
   private String employeeId;
    private LeaveType leaveType;
    private Integer days;
    private LocalDate fromDate;
    private LocalDate toDate; 
}
