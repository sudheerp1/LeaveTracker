package com.example.demo.controller;

import com.example.demo.entity.LeaveRequest;
import com.example.demo.entity.LeaveViewConfig;
import com.example.demo.repository.LeaveRequestRepository;
import com.example.demo.service.LeaveViewConfigService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leave-views")
public class LeaveViewConfigController {

    private final LeaveViewConfigService service;
    private final LeaveRequestRepository leaveRequestRepository;

    // Explicit constructor injection
    public LeaveViewConfigController(LeaveViewConfigService service, LeaveRequestRepository leaveRequestRepository) {
        this.service = service;
        this.leaveRequestRepository = leaveRequestRepository;
    }

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

    // Optional: If you intend to expose saving a LeaveRequest
    @PostMapping("/leave-request")
    public LeaveRequest saveLeaveRequest(@RequestBody LeaveRequest request) {
        return leaveRequestRepository.save(request);
    }
}
