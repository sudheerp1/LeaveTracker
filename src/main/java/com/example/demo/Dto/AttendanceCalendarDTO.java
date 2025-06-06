package com.example.demo.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class AttendanceCalendarDTO {
    private LocalDate date;
    private boolean present;
    private String shiftName;
    private LocalTime inTime;
    private LocalTime outTime;
}