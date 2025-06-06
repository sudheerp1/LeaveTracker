package com.example.demo.Dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class LeaveFilterDTO {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String leaveType; // Optional: "All", "Earned Leave", etc.
    private Long employeeId;  // For filtering My Data
    private String operation; // For filtering operations (optional)
}
