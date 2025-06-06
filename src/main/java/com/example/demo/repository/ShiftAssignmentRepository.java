package com.example.demo.repository;

import com.example.demo.entity.ShiftAssignment;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftAssignmentRepository extends JpaRepository<ShiftAssignment, Long> {
    List<ShiftAssignment> findByEmployeeIdAndDateBetween(Long empId, LocalDate start, LocalDate end);
}
