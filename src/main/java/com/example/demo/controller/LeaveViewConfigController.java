package com.example.demo.controller;

import com.example.demo.entity.LeaveRequest;
import com.example.demo.entity.LeaveViewConfig;
import com.example.demo.repository.LeaveRequestRepository;
import com.example.demo.service.LeaveViewConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-views")
@RequiredArgsConstructor
public class LeaveViewConfigController {

    private final LeaveViewConfigService service;
    private final LeaveRequestRepository LeaveRequestRepository;
    @PostMapping
    public LeaveViewConfig createView(@RequestBody LeaveViewConfig config) {
        return service.saveConfig(config);
    }

    @GetMapping
    public List<LeaveViewConfig> getAllViews() {
        return service.getAllConfigs();
    }

    @GetMapping("/{id}")
    public LeaveViewConfig getView(@PathVariable Long id) {
        return service.getConfigById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteView(@PathVariable Long id) {
        service.deleteConfig(id);
    }
    public LeaveRequest saveLeaveRequest(LeaveRequest request) {
        return LeaveRequestRepository.save(request);
    }

}
