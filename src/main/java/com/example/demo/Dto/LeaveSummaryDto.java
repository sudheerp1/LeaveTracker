package com.example.demo.Dto;

import java.util.Map;
import com.example.demo.entity.LeaveType;
import lombok.Data;

public class LeaveSummaryDto {
     private String employeeId;
    private Map<LeaveType, Integer> available;
    private Map<LeaveType, Integer> booked;
    private Integer absentDays;
    private int bookedLeaves;
    private int availableLeaves;
    public void setBookedLeaves(int bookedLeaves) { this.bookedLeaves = bookedLeaves; }
    public void setAvailableLeaves(int availableLeaves) { this.availableLeaves = availableLeaves; }
}
