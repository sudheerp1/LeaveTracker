package com.example.demo.service;

import com.example.demo.Dto.LeaveViewConfigDto;
import com.example.demo.entity.LeaveViewConfig;
import com.example.demo.repository.LeaveViewConfigRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LeaveViewConfigService {

    private final LeaveViewConfigRepository repository;

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
        LeaveViewConfig config = LeaveViewConfig.builder()
                .viewName(dto.getViewName())
                .selectedColumns(dto.getSelectedColumns())
                .viewPermission(dto.getViewPermission()) // ✅ Updated
                .sharedWithUsers(dto.getSharedWithUsers())
                .sharedWithRoles(dto.getSharedWithRoles())
                .sharedWithDepartments(dto.getSharedWithDepartments())
                .createdAt(LocalDateTime.now())
                .createdBy(createdBy)
                .build();
        return toDto(repository.save(config));
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
        config.setViewPermission(dto.getViewPermission()); // ✅ Updated
        config.setSharedWithUsers(dto.getSharedWithUsers());
        config.setSharedWithRoles(dto.getSharedWithRoles());
        config.setSharedWithDepartments(dto.getSharedWithDepartments());
        config.setModifiedAt(LocalDateTime.now());
        config.setModifiedBy(dto.getModifiedBy());

        return toDto(repository.save(config));
    }

    public void deleteView(Long id) {
        repository.deleteById(id);
    }

    // --- Mapper Method ---
    private LeaveViewConfigDto toDto(LeaveViewConfig entity) {
        return LeaveViewConfigDto.builder()
                .id(entity.getId())
                .viewName(entity.getViewName())
                .selectedColumns(entity.getSelectedColumns())
                .viewPermission(entity.getViewPermission()) // ✅ Updated
                .sharedWithUsers(entity.getSharedWithUsers())
                .sharedWithRoles(entity.getSharedWithRoles())
                .sharedWithDepartments(entity.getSharedWithDepartments())
                .build();
    }
}


