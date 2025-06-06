package com.example.demo.Dto;

import com.example.demo.enums.ViewPermission;
import java.util.List;

public class LeaveViewConfigDto {

    private Long id;
    private String viewName;
    private ViewPermission viewPermission;
    private boolean allowAllEmployees;
    private List<Long> sharedUserIds;
    private List<String> sharedDepartments;
    private List<String> sharedRoles;
    private List<String> sharedLocations;
    private List<String> leaveTypes;
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

    // No-argument constructor
    public LeaveViewConfigDto() {
    }

    // Getters and Setters
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
    public List<String> getSelectedColumns() {
        return selectedColumns;
    }
    public void setSelectedColumns(List<String> selectedColumns) {
        this.selectedColumns = selectedColumns;
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
