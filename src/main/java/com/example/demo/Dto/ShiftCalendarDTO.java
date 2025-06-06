package com.example.demo.Dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ShiftCalendarDTO {
    private LocalDate date;
    private String shiftName;
    private String shiftTiming;
}
