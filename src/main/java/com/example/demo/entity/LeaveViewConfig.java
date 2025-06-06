package com.example.demo.entity;

import jakarta.persistence.*;
import com.example.demo.enums.ViewPermission;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "leave_view_config")
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

    // 🧱 Manual Builder Implementation
    public static class Builder {
        private final LeaveViewConfig config;

        public Builder() {
            config = new LeaveViewConfig();
        }

        public Builder id(Long id) {
            config.setId(id);
            return this;
        }

        public Builder viewName(String viewName) {
            config.setViewName(viewName);
            return this;
        }

        public Builder viewPermission(ViewPermission viewPermission) {
            config.setViewPermission(viewPermission);
            return this;
        }

        public Builder selectedColumns(List<String> selectedColumns) {
            config.setSelectedColumns(selectedColumns);
            return this;
        }

        public Builder allowAllEmployees(boolean allowAllEmployees) {
            config.setAllowAllEmployees(allowAllEmployees);
            return this;
        }

        public Builder sharedUserIds(List<Long> sharedUserIds) {
            config.setSharedUserIds(sharedUserIds);
            return this;
        }

        public Builder sharedDepartments(List<String> sharedDepartments) {
            config.setSharedDepartments(sharedDepartments);
            return this;
        }

        public Builder sharedRoles(List<String> sharedRoles) {
            config.setSharedRoles(sharedRoles);
            return this;
        }

        public Builder sharedLocations(List<String> sharedLocations) {
            config.setSharedLocations(sharedLocations);
            return this;
        }

        public Builder leaveTypes(List<String> leaveTypes) {
            config.setLeaveTypes(leaveTypes);
            return this;
        }

        public Builder includeLeaveBalance(boolean includeLeaveBalance) {
            config.setIncludeLeaveBalance(includeLeaveBalance);
            return this;
        }

        public Builder includeLeaveRequests(boolean includeLeaveRequests) {
            config.setIncludeLeaveRequests(includeLeaveRequests);
            return this;
        }

        public Builder includeShift(boolean includeShift) {
            config.setIncludeShift(includeShift);
            return this;
        }

        public Builder includeOnboarding(boolean includeOnboarding) {
            config.setIncludeOnboarding(includeOnboarding);
            return this;
        }

        public Builder createdBy(String createdBy) {
            config.setCreatedBy(createdBy);
            return this;
        }

        public Builder modifiedBy(String modifiedBy) {
            config.setModifiedBy(modifiedBy);
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            config.setCreatedAt(createdAt);
            return this;
        }

        public Builder modifiedAt(LocalDateTime modifiedAt) {
            config.setModifiedAt(modifiedAt);
            return this;
        }

        public Builder sharedWithUsers(List<Long> sharedWithUsers) {
            config.setSharedWithUsers(sharedWithUsers);
            return this;
        }

        public Builder sharedWithRoles(List<String> sharedWithRoles) {
            config.setSharedWithRoles(sharedWithRoles);
            return this;
        }

        public Builder sharedWithDepartments(List<String> sharedWithDepartments) {
            config.setSharedWithDepartments(sharedWithDepartments);
            return this;
        }

        public LeaveViewConfig build() {
            return config;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    // ✅ Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public ViewPermission getViewPermission() {
        return viewPermission;
    }

    public void setViewPermission(ViewPermission viewPermission) {
        this.viewPermission = viewPermission;
    }

    public List<String> getSelectedColumns() {
        return selectedColumns;
    }

    public void setSelectedColumns(List<String> selectedColumns) {
        this.selectedColumns = selectedColumns;
    }

    public boolean isAllowAllEmployees() {
        return allowAllEmployees;
    }

    public void setAllowAllEmployees(boolean allowAllEmployees) {
        this.allowAllEmployees = allowAllEmployees;
    }

    public List<Long> getSharedUserIds() {
        return sharedUserIds;
    }

    public void setSharedUserIds(List<Long> sharedUserIds) {
        this.sharedUserIds = sharedUserIds;
    }

    public List<String> getSharedDepartments() {
        return sharedDepartments;
    }

    public void setSharedDepartments(List<String> sharedDepartments) {
        this.sharedDepartments = sharedDepartments;
    }

    public List<String> getSharedRoles() {
        return sharedRoles;
    }

    public void setSharedRoles(List<String> sharedRoles) {
        this.sharedRoles = sharedRoles;
    }

    public List<String> getSharedLocations() {
        return sharedLocations;
    }

    public void setSharedLocations(List<String> sharedLocations) {
        this.sharedLocations = sharedLocations;
    }

    public List<String> getLeaveTypes() {
        return leaveTypes;
    }

    public void setLeaveTypes(List<String> leaveTypes) {
        this.leaveTypes = leaveTypes;
    }

    public boolean isIncludeLeaveBalance() {
        return includeLeaveBalance;
    }

    public void setIncludeLeaveBalance(boolean includeLeaveBalance) {
        this.includeLeaveBalance = includeLeaveBalance;
    }

    public boolean isIncludeLeaveRequests() {
        return includeLeaveRequests;
    }

    public void setIncludeLeaveRequests(boolean includeLeaveRequests) {
        this.includeLeaveRequests = includeLeaveRequests;
    }

    public boolean isIncludeShift() {
        return includeShift;
    }

    public void setIncludeShift(boolean includeShift) {
        this.includeShift = includeShift;
    }

    public boolean isIncludeOnboarding() {
        return includeOnboarding;
    }

    public void setIncludeOnboarding(boolean includeOnboarding) {
        this.includeOnboarding = includeOnboarding;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public List<Long> getSharedWithUsers() {
        return sharedWithUsers;
    }

    public void setSharedWithUsers(List<Long> sharedWithUsers) {
        this.sharedWithUsers = sharedWithUsers;
    }

    public List<String> getSharedWithRoles() {
        return sharedWithRoles;
    }

    public void setSharedWithRoles(List<String> sharedWithRoles) {
        this.sharedWithRoles = sharedWithRoles;
    }

    public List<String> getSharedWithDepartments() {
        return sharedWithDepartments;
    }

    public void setSharedWithDepartments(List<String> sharedWithDepartments) {
        this.sharedWithDepartments = sharedWithDepartments;
    }
}
