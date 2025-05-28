package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dto.LeaveBalanceDto;
import com.example.demo.service.LeaveBalanceService;

import java.util.List;

@RestController
@RequestMapping("/api/leave-balances")
public class LeaveBalanceController {

    @Autowired
    private LeaveBalanceService leaveBalanceService;

    // Create or update a leave balance
    @PostMapping
    public ResponseEntity<LeaveBalanceDto> createOrUpdateLeaveBalance(@RequestBody LeaveBalanceDto leaveBalanceDto) {
        LeaveBalanceDto savedDto = leaveBalanceService.createOrUpdateLeaveBalance(leaveBalanceDto);
        return ResponseEntity.ok(savedDto);
    }

    // Get all leave balances
    @GetMapping
    public ResponseEntity<List<LeaveBalanceDto>> getAllLeaveBalances() {
        return ResponseEntity.ok(leaveBalanceService.getAllLeaveBalances());
    }

    // Get leave balance by ID
    @GetMapping("/{id}")
    public ResponseEntity<LeaveBalanceDto> getLeaveBalanceById(@PathVariable Long id) {
        return ResponseEntity.ok(leaveBalanceService.getLeaveBalanceById(id));
    }

    // Delete leave balance
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLeaveBalance(@PathVariable Long id) {
        leaveBalanceService.deleteLeaveBalance(id);
        return ResponseEntity.noContent().build();
    }
}


