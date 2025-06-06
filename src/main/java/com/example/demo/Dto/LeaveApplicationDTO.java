package com.example.demo.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveApplicationDTO {
    private Long id;
    private String leaveType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String reason;
    private int hoursTaken;
    private LocalDate requestDate;
    private String operation;
    private String teamEmailId;
    private Long employeeId;
}
