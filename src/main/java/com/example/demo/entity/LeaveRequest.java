package com.example.demo.entity;

    

import com.example.demo.enums.LeaveStatus;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "leave_type_id") 
    
    private LeaveType leaveType;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    private String teamEmailId;

    @Column(length = 500)
    private String reason;

    private LocalDate createdAt;
    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    // Add setter
    public void setStatus(LeaveStatus status) {
        this.status = status;
    }
}


