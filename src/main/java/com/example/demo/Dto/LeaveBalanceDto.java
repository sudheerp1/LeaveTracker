package com.example.demo.Dto;

import com.example.demo.enums.LeaveType; // <-- Import your enum
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveBalanceDto {
    private Long id;
    private Long employeeId;
    private LeaveType leaveType;
    private Double availableLeaves;
    private Double bookedLeaves;
}

