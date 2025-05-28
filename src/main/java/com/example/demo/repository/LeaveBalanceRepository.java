package com.example.demo.repository;
    
import com.example.demo.entity.LeaveBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance, Long> {

    List<LeaveBalance> findByUserId(Long userId);

    List<LeaveBalance> findByUserIdAndLeaveTypeId(Long userId, Long leaveTypeId);
    List<LeaveBalance> findByEmployeeId(Long employeeId);

}


