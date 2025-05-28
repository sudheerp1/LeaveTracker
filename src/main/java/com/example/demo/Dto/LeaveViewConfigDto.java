package com.example.demo.Dto;

import com.example.demo.enums.ViewPermission;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveViewConfigDto {

    private Long id;
    private String viewName;

    private ViewPermission viewPermission;
    private boolean allowAllEmployees;

    private List<Long> sharedUserIds;
    private List<String> sharedDepartments;
    private List<String> sharedRoles;
    private List<String> sharedLocations;

    private List<String> leaveTypes; // e.g., Earned Leave, Casual Leave, etc.
    private List<String> selectedColumns;

    private boolean includeLeaveBalance;
    private boolean includeLeaveRequests;
    private boolean includeShift;
    private boolean includeOnboarding;

    private String createdBy;
    private String modifiedBy;
    private List<Long> sharedWithUsers;
    private List<String> sharedWithRoles;
    private List<String> sharedWithDepartments;

}

