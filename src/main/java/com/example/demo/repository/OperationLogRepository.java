package com.example.demo.repository;

import com.example.demo.entity.OperationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationLogRepository extends JpaRepository<OperationLog, Long> {
    List<OperationLog> findByModuleNameOrderByTimestampDesc(String moduleName);
    List<OperationLog> findByPerformedByOrderByTimestampDesc(String performedBy);
}
