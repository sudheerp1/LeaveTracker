package com.example.demo.Dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OperationLogDTO {
    private Long id;
    private String moduleName;
    private String action;
    private String performedBy;
    private LocalDateTime timestamp;
    private String details;
}
