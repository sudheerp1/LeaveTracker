package com.example.demo.repository;
import com.example.demo.entity.LeaveImportLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveImportLogRepository extends JpaRepository<LeaveImportLog, Long> {
}


