
package com.example.demo.repository;

import com.example.demo.entity.LeaveViewConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveViewConfigRepository extends JpaRepository<LeaveViewConfig, Long> {
    
    // Custom query method to fetch views created by a specific user
    List<LeaveViewConfig> findByCreatedBy(String createdBy);
}
