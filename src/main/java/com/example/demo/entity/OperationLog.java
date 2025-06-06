package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "operation_log")

public class OperationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moduleName; 
    private String action;     // e.g., "CREATE", "UPDATE", "DELETE", "VIEW", "FILTER_APPLIED"
    private String performedBy;
    private LocalDateTime timestamp;

    @Column(columnDefinition = "TEXT")
    private String details;    // JSON or human-readable details of the action
}
