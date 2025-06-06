package com.example.demo.controller;

import com.example.demo.Dto.ShiftCalendarDTO;
import com.example.demo.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/shifts")
@CrossOrigin("*")
public class ShiftController {

    @Autowired
    private ShiftService shiftService;

    @GetMapping("/calendar")
    public List<ShiftCalendarDTO> getShiftCalendar(
            @RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate
    ) {
        return shiftService.getShiftCalendarData(fromDate, toDate);
    }
}
