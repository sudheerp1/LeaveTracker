package com.example.demo.service;

import com.example.demo.Dto.LeaveViewConfigDto;
import com.example.demo.entity.LeaveViewConfig;
import com.example.demo.repository.LeaveViewConfigRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaveViewConfigService {

    private final LeaveViewConfigRepository repository;

    public LeaveViewConfigService(LeaveViewConfigRepository repository) {
        this.repository = repository;
    }

    // --- Basic Entity Operations ---

    public LeaveViewConfig saveConfig(LeaveViewConfig config) {
        if (config.getId() == null) {
            config.setCreatedAt(LocalDateTime.now());
        } else {
            config.setModifiedAt(LocalDateTime.now());
        }
        return repository.save(config);
    }

    public List<LeaveViewConfig> getAllConfigs() {
        return repository.findAll();
    }

    public LeaveViewConfig getConfigById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave View Config not found with ID: " + id));
    }

    public void deleteConfig(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Config not found to delete with ID: " + id);
        }
        repository.deleteById(id);
    }

    // --- DTO-based View Operations ---

    public LeaveViewConfigDto createView(LeaveViewConfigDto dto, String createdBy) {
        LeaveViewConfig config = new LeaveViewConfig();
        config.setViewName(dto.getViewName());
        config.setSelectedColumns(dto.getSelectedColumns());
        config.setViewPermission(dto.getViewPermission());
        config.setSharedWithUsers(dto.getSharedWithUsers());
        config.setSharedWithRoles(dto.getSharedWithRoles());
        config.setSharedWithDepartments(dto.getSharedWithDepartments());
        config.setCreatedAt(LocalDateTime.now());
        config.setCreatedBy(createdBy);

        LeaveViewConfig saved = repository.save(config);
        return toDto(saved);
    }

    public List<LeaveViewConfigDto> getUserViews(String username) {
        return repository.findByCreatedBy(username).stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public LeaveViewConfigDto updateView(Long id, LeaveViewConfigDto dto) {
        LeaveViewConfig config = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("View not found with ID: " + id));

        config.setViewName(dto.getViewName());
        config.setSelectedColumns(dto.getSelectedColumns());
        config.setViewPermission(dto.getViewPermission());
        config.setSharedWithUsers(dto.getSharedWithUsers());
        config.setSharedWithRoles(dto.getSharedWithRoles());
        config.setSharedWithDepartments(dto.getSharedWithDepartments());
        config.setModifiedAt(LocalDateTime.now());
        config.setModifiedBy(dto.getModifiedBy());

        LeaveViewConfig updated = repository.save(config);
        return toDto(updated);
    }

    public void deleteView(Long id) {
        repository.deleteById(id);
    }

    // --- Mapper Method ---
    private LeaveViewConfigDto toDto(LeaveViewConfig entity) {
        LeaveViewConfigDto dto = new LeaveViewConfigDto();
        dto.setId(entity.getId());
        dto.setViewName(entity.getViewName());
        dto.setSelectedColumns(entity.getSelectedColumns());
        dto.setViewPermission(entity.getViewPermission());
        dto.setSharedWithUsers(entity.getSharedWithUsers());
        dto.setSharedWithRoles(entity.getSharedWithRoles());
        dto.setSharedWithDepartments(entity.getSharedWithDepartments());
        // You can add more fields if your entity has them and you want to expose them in DTO
        return dto;
    }
}
