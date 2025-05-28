package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import com.example.demo.enums.ViewPermission;

@Entity
@Table(name = "leave_view_config")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveViewConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String viewName;

    @Enumerated(EnumType.STRING)
    private ViewPermission viewPermission; 

    @ElementCollection
    private List<String> selectedColumns;

    private boolean allowAllEmployees;

    @ElementCollection
    private List<Long> sharedUserIds;

    @ElementCollection
    private List<String> sharedDepartments;

    @ElementCollection
    private List<String> sharedRoles;

    @ElementCollection
    private List<String> sharedLocations;

    @ElementCollection
    private List<String> leaveTypes;

    private boolean includeLeaveBalance;
    private boolean includeLeaveRequests;
    private boolean includeShift;
    private boolean includeOnboarding;

    private String createdBy;
    private String modifiedBy;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    @ElementCollection
    private List<Long> sharedWithUsers;

    @ElementCollection
    private List<String> sharedWithRoles;

    @ElementCollection
    private List<String> sharedWithDepartments;

}



