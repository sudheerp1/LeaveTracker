package com.example.demo.controller;

import com.example.demo.Dto.LeaveApplicationDTO;
import com.example.demo.Dto.LeaveFilterDTO;
import com.example.demo.Dto.LeaveSummaryDto;
import com.example.demo.service.LeaveApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
@RequiredArgsConstructor
public class LeaveTrackerController {

    private final LeaveApplicationService leaveApplicationService;

    @PostMapping("/filter")
    public List<LeaveApplicationDTO> filterLeaves(@RequestBody LeaveFilterDTO filterDTO) {
        return leaveApplicationService.filterLeaves(filterDTO);
    }

    @GetMapping("/summary/{employeeId}")
    public LeaveSummaryDto getLeaveSummary(@PathVariable Long employeeId) {
        return leaveApplicationService.getLeaveSummary(employeeId);
    }
}
