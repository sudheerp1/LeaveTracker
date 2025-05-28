package com.example.demo.Dto;

import java.util.Map;
import com.example.demo.entity.LeaveType;
import lombok.Data;
@Data
public class LeaveSummaryDto {
     private String employeeId;
    private Map<LeaveType, Integer> available;
    private Map<LeaveType, Integer> booked;
    private Integer absentDays;
}
