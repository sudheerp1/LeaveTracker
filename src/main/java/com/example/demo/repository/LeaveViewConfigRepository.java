package com.example.demo.repository;

import com.example.demo.entity.LeaveViewConfig;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface LeaveViewConfigRepository extends JpaRepository<LeaveViewConfig, Long> {
    List<LeaveViewConfig> findByCreatedBy(String createdBy);
}
